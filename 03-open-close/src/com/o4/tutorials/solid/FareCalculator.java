package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.MiniCar;
import com.o4.tutorials.solid.vehicles.NormalCar;

public class FareCalculator {
    public void calculate(Billing billing, Booking booking) {

        if (booking.trip.vehicle instanceof MiniCar) {
            billing.rate = 8;
        } else if (booking.trip.vehicle instanceof NormalCar) {
            billing.rate = 10;
        } // else ?

        billing.subTotal = Math.ceil((billing.distanceInKm * billing.rate)
                + (billing.timeInHours * billing.rate));

        billing.peakAmount = Math.ceil(billing.subTotal * booking.peakFactor);
        billing.discountAmount = Math.floor((billing.subTotal + billing.peakAmount) * booking.discountFactor);
        billing.totalFare = billing.subTotal + billing.peakAmount - billing.discountAmount;
        billing.taxAmount = Math.ceil(billing.totalFare * booking.taxFactor);
        billing.payableFare = billing.totalFare + billing.taxAmount;
    }
}
