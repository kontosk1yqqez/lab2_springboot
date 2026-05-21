package com.exampletolr;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Scanner;

@SpringBootApplication
public class Prod1Application implements CommandLineRunner {

    private final MathService mathService;

    @Autowired
    public Prod1Application(MathService mathService) {
        this.mathService = mathService;
    }

    public static void main(String[] args) {
        SpringApplication.run(Prod1Application.class, args);
    }

    @Override
    public void run(String... args) {

        Scanner scanner = new Scanner(System.in);

        System.out.print("Введіть число: ");
        double base = scanner.nextDouble();

        System.out.print("Введіть степінь: ");
        int exponent = scanner.nextInt();

        double result = mathService.calculatePower(base, exponent);

        System.out.println("MAIN VERSION");
        System.out.println(base + " ^ " + exponent + " = " + result);

        scanner.close();
    }
}