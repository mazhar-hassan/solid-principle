package com.o4.tutorials.solid;

public class PriceItem {
    public final String title;
    public final double amount;
    public final String unit;

    public PriceItem(String title, double amount, String unit) {
        this.title = title;
        this.amount = amount;
        this.unit = unit;
    }

    public String toString() {
        return title + ":" + amount + " " + unit;
    }
}
