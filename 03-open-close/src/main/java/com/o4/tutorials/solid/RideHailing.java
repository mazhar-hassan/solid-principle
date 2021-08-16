package com.o4.tutorials.solid;

import com.o4.tutorials.solid.factors.FactorsList;
import com.o4.tutorials.solid.vehicles.MiniCar;

import java.util.logging.Logger;

public class RideHailing {
    static Logger logger = Logger.getLogger(RideHailing.class.getName());

    public static void main(String[] args) {

        var booking = new Booking();

        booking.assign(new MiniCar());
        booking.setPriceFactors(new FactorsList().getDefaultFactors());
        booking.startTrip();
        booking.endTrip();

        logger.info(booking.toString());

        var formatter = new StringFormatter();
        logger.info(formatter.format(new FareCalculator().calculate(booking)));
    }
}
