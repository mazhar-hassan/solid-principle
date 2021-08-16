package com.o4.tutorials.solid.vehicles;

public class NormalCar implements Vehicle {

    @Override
    public String getCapacity() {
        return "3 Persons";
    }

    @Override
    public String getType() {
        return "Normal Car";
    }

    @Override
    public double getRate() {
        return 10;
    }
}
