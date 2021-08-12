package com.o4.tutorials.solid;

public class Billing {

    public double rate;
    public double subTotal;
    public double peakAmount;
    public double discountAmount;
    public double totalFare;
    public double taxAmount;
    public double payableFare;
    public final double distanceInKm;
    public final double timeInHours;

    public Billing(Booking booking) {
        timeInHours = booking.trip.timeInHours;
        distanceInKm = booking.trip.distanceInKm;

        new FareCalculator().calculate(this, booking);
    }

}
