package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.Vehicle;

import java.util.logging.Logger;

public class Trip {

    Logger logger = Logger.getLogger(Trip.class.getName());
    private final Vehicle vehicle;
    private double distanceInKm;
    private double timeInHours;

    public Trip(Vehicle vehicle) {
        this.vehicle = vehicle;
    }

    public void start() {
        logger.info("Start Trip");
    }

    public void end() {
        distanceInKm = RandomNumber.getDouble(1, 10);
        timeInHours = RandomNumber.getDouble(1, 2);

        logger.info("End Trip");
    }

    public void cancel() {
        logger.info("Cancel Trip");
    }

    public Vehicle getVehicle() {
        return vehicle;
    }

    public double getDistanceInKm() {
        return distanceInKm;
    }

    public double getTimeInHours() {
        return timeInHours;
    }

    @Override
    public String toString() {
        return "Trip{" +
                "vehicle=" + vehicle.getType() + "^" + vehicle.getCapacity() +
                ", distanceInKm=" + distanceInKm +
                ", timeInHours=" + timeInHours +
                '}';
    }
}
