package com.o4.tutorials.solid;

public class FareCalculator {
    public void calculate(Billing billing, Booking booking) {

        billing.rate = booking.trip.vehicle.getRate();

        billing.subTotal = Math.ceil((billing.distanceInKm * billing.rate)
                + (billing.timeInHours * billing.rate));

        billing.peakAmount = Math.ceil(billing.subTotal * booking.peakFactor);
        billing.discountAmount = Math.floor((billing.subTotal + billing.peakAmount) * booking.discountFactor);
        billing.totalFare = billing.subTotal + billing.peakAmount - billing.discountAmount;
        billing.taxAmount = Math.ceil(billing.totalFare * booking.taxFactor);
        billing.payableFare = billing.totalFare + billing.taxAmount;
    }
}
