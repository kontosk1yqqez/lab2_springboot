package com.exampletolr;

import org.springframework.stereotype.Component;

@Component
public class MathService {

    public double calculatePower(double base, int exponent) {
        return Math.pow(base, exponent);
    }
}