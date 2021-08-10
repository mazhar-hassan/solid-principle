package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.MiniCar;

public class RideHailing {

    public static void main(String[] args) {
        Trip trip = new Trip(new MiniCar());
        Booking booking = new Booking(trip);

        trip.start();
        booking.end();

        System.out.println(booking);
        Billing billing = new Billing(booking);

        StringFormatter formatter = new StringFormatter();
        System.out.println(formatter.format(billing));
    }
}
