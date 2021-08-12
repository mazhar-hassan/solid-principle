package com.o4.tutorials.solid;
import com.o4.tutorials.solid.vehicles.Vehicle;

public class Booking {
    public Trip trip;
    public double peakFactor;
    public double discountFactor;
    public double taxFactor;

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
