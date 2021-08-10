package com.o4.tutorials.solid;

public class Billing {

    public final Trip trip;
    public final double baseFare;
    public final double peakAmount;
    public final double discountAmount;
    public final double totalFare;
    public final double taxAmount;
    public final double payableFare;


    public Billing(Booking booking) {
        trip = booking.trip;

        baseFare = Math.ceil((trip.distanceInKm * trip.rateFactor)
                + (trip.timeInHours * trip.rateFactor));

        peakAmount = Math.ceil(baseFare * booking.peakFactor);
        discountAmount = Math.floor((baseFare + peakAmount) * booking.discountFactor);
        totalFare = baseFare + peakAmount - discountAmount;
        taxAmount = Math.ceil(totalFare * booking.taxFactor);
        payableFare = totalFare + taxAmount;
    }
}
