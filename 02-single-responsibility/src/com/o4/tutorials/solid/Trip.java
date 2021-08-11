package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.Vehicle;

public class Trip {

    private final Vehicle vehicle;
    public double distanceInKm;
    public double rateFactor;
    public double timeInHours;

    public Trip(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        System.out.println("Start trip");
    }

    public void end() {
        distanceInKm = RandomNumber.getDouble(1, 10);
        rateFactor = RandomNumber.getDouble(1, 3) * 5;
        timeInHours = RandomNumber.getDouble(1, 2);

        System.out.println("End trip");
    }

    public void cancel() {
        System.out.println("Cancel trip");
    }

    @Override
    public String toString() {
        return "Trip{" +
                "vehicle=" + vehicle +
                "\n, distanceInKm=" + distanceInKm +
                ", rateFactor=" + rateFactor +
                ", timeInHours=" + timeInHours +
                '}';
    }
}
