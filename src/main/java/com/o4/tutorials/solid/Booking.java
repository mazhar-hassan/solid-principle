package com.o4.tutorials.solid;

import com.o4.tutorials.solid.factors.PriceFactor;
import com.o4.tutorials.solid.vehicles.Vehicle;

import java.util.List;

public class Booking {
    private Trip trip;
    private List<PriceFactor> pricePriceFactors;

    public void assign(Vehicle vehicle) {
        trip = new Trip(vehicle);
    }

    public void startTrip() {
        trip.start();
    }

    public void cancelTrip() {
        trip.cancel();
    }

    public void endTrip() {
        trip.end();
    }

    @Override
    public String toString() {
        return "Booking{" +
                "trip=" + trip + '}';
    }

    public void setPriceFactors(List<PriceFactor> pricePriceFactors) {
        this.pricePriceFactors = pricePriceFactors;
    }

    public Trip getTrip() {
        return trip;
    }

    public void setTrip(Trip trip) {
        this.trip = trip;
    }

    public List<PriceFactor> getPriceFactors() {
        return pricePriceFactors;
    }
}
