package com.o4.tutorials.solid.vehicles;

public class MiniCar implements Vehicle {

    @Override
    public String getCapacity() {
        return "2 Persons";
    }

    @Override
    public String getType() {
        return "MiniCar";
    }

    @Override
    public double getRate() {
        return 5;
    }
}
