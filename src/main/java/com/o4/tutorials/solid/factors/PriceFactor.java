package com.o4.tutorials.solid.factors;

public class PriceFactor {

    private final String title;
    private final double factor;

    public PriceFactor(String title, double factor) {
        this.title = title;
        this.factor = factor;
    }

    public double apply(double amount) {
        return Math.ceil(amount * getFactor());
    }

    public double getFactor() {
        return factor;
    }

    public String getTitle() {
        return title;
    }

}
