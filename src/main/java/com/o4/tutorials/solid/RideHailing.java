package com.o4.tutorials.solid;

import com.o4.tutorials.solid.factors.FactorsList;
import com.o4.tutorials.solid.vehicles.MiniCar;

import java.util.logging.Level;
import java.util.logging.Logger;

public class RideHailing {
    static Logger logger = Logger.getLogger(RideHailing.class.getName());

    public static void main(String[] args) {

        var booking = new Booking();

        booking.assign(new MiniCar());
        booking.setPriceFactors(new FactorsList().getDefaultFactors());
        booking.startTrip();
        booking.endTrip();

        logger.log(Level.INFO, "The booking details are {0}",booking);

        var formatter = new StringFormatter();
        logger.log(Level.INFO, "Fare details: {0}", formatter.format(new FareCalculator().calculate(booking)));
    }
}
