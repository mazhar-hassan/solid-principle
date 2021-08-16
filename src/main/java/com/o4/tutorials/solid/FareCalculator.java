package com.o4.tutorials.solid;

import com.o4.tutorials.solid.factors.PriceFactor;

import java.util.ArrayList;
import java.util.List;

public class FareCalculator {

    private static final String UNIT_RS = "Rs";

    public List<PriceItem> calculate(Booking booking) {

        var trip = booking.getTrip();
        List<PriceItem> priceItems = getDefaultItems(trip);

        double amount = getDistanceFare(trip);
        priceItems.add(new PriceItem("Distance", amount, UNIT_RS));

        double timeAmount = getTimeFare(trip);
        priceItems.add(new PriceItem("Time", timeAmount, UNIT_RS));
        amount += timeAmount;

        for (PriceFactor priceFactor : booking.getPriceFactors()) {
            PriceItem item = toPriceItem(amount, priceFactor);
            amount += item.amount;

            priceItems.add(item);
        }

        priceItems.add(new PriceItem("Total", amount, UNIT_RS));
        return priceItems;
    }

    private PriceItem toPriceItem(double amount, PriceFactor priceFactor) {
        return new PriceItem(priceFactor.getTitle(), priceFactor.apply(amount), UNIT_RS);
    }

    private double getTimeFare(Trip trip) {
        return Math.ceil(trip.getTimeInHours() * trip.getVehicle().getRate());
    }

    private double getDistanceFare(Trip trip) {
        return Math.ceil(trip.getDistanceInKm() * trip.getVehicle().getRate());
    }

    private List<PriceItem> getDefaultItems(Trip trip) {
        List<PriceItem> list = new ArrayList<>();

        list.add(new PriceItem("Km", trip.getDistanceInKm(), ""));
        list.add(new PriceItem("Hour(s)", trip.getTimeInHours(), ""));
        list.add(new PriceItem("Rate", trip.getVehicle().getRate(), UNIT_RS));

        return list;
    }
}
