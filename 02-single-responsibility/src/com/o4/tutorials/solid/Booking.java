package com.o4.tutorials.solid;

public class Booking {
    public Trip trip;
    public double peakFactor;
    public double discountFactor;
    public double taxFactor;

    public Booking(Trip trip) {
        this.trip = trip;
    }
    public void cancel() {
        trip.cancel();
    }

    public void end() {
        trip.end();
        peakFactor = RandomNumber.getDouble(0.2, 0.8);
        discountFactor = RandomNumber.getDouble(0.1,0.3);
        taxFactor = 0.33D;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "trip=" + trip +
                "\n, peakFactor=" + peakFactor +
                ", discountFactor=" + discountFactor +
                ", taxFactor=" + taxFactor +
                '}';
    }
}
