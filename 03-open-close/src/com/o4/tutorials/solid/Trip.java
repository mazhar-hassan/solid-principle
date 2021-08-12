package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.Vehicle;

public class Trip {

    public final Vehicle vehicle;
    public double distanceInKm;
    public double timeInHours;

    public Trip(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        System.out.println("Start trip");
    }

    public void end() {
        distanceInKm = RandomNumber.getDouble(1, 10);
        timeInHours = RandomNumber.getDouble(1, 2);

        System.out.println("End trip");
    }

    public void cancel() {
        System.out.println("Cancel trip");
    }

    @Override
    public String toString() {
        return "Trip{" +
                "vehicle="+ vehicle.getType() + "^" + vehicle.getCapacity() +
                ", distanceInKm=" + distanceInKm +
                ", timeInHours=" + timeInHours +
                '}';
    }
}
