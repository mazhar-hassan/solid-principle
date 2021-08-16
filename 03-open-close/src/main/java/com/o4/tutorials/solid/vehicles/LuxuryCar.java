package com.o4.tutorials.solid.vehicles;

public class LuxuryCar implements Vehicle {

    @Override
    public String getCapacity() {
        return "4 Persons";
    }

    @Override
    public String getType() {
        return "Luxury Car";
    }

    @Override
    public double getRate() {
        return 15;
    }
}
