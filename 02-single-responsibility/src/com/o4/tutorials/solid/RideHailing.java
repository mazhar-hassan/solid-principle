package com.o4.tutorials.solid;

import com.o4.tutorials.solid.vehicles.MiniCar;

public class RideHailing {

    public static void main(String[] args) {

        Booking booking = new Booking();

        booking.assign(new MiniCar());
        booking.startTrip();
        booking.endTrip();

        System.out.println(booking);
        Billing billing = new Billing(booking);

        StringFormatter formatter = new StringFormatter();
        System.out.println(formatter.format(billing));
    }
}
