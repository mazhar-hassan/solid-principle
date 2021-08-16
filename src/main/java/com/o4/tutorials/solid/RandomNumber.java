package com.o4.tutorials.solid;

import java.util.Random;

public class RandomNumber {
    static Random random = new Random();

    private RandomNumber() {
    }

    public static double getDouble(double min, double max) {
        double number = (random.nextDouble() * max) + min;
        return Math.round(number * 100) / 100D;
    }
}
