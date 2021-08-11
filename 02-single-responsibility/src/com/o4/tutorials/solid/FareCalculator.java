package com.o4.tutorials.solid;

public class FareCalculator {
    public void calculate(Billing billing, Booking booking) {
        billing.baseFare = Math.ceil((billing.distanceInKm * billing.rateFactor)
                + (billing.timeInHours * billing.rateFactor));

        billing.peakAmount = Math.ceil(billing.baseFare * booking.peakFactor);
        billing.discountAmount = Math.floor((billing.baseFare + billing.peakAmount) * booking.discountFactor);
        billing.totalFare = billing.baseFare + billing.peakAmount - billing.discountAmount;
        billing.taxAmount = Math.ceil(billing.totalFare * booking.taxFactor);
        billing.payableFare = billing.totalFare + billing.taxAmount;
    }
}
