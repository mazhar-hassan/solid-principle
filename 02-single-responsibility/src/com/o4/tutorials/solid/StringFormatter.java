package com.o4.tutorials.solid;

public class StringFormatter {
    public String format(Billing bill) {

        StringBuilder result = new StringBuilder("\n");
        result.append("***************************************").append("\n");

        result.append(getTripDetails(bill.trip));

        result.append("---------------- Bill ---------------").append("\n");
        result.append("Base fare: "+bill.baseFare).append("\n");
        result.append("Peak: +"+bill.peakAmount).append("\n");
        result.append("discount: -"+bill.discountAmount).append("\n");
        result.append("Tax: +"+bill.taxAmount).append("\n");

        result.append("---------------- Payable -------------").append("\n");
        result.append("Payable Fare: "+bill.payableFare).append("\n");

        result.append("***************************************").append("\n");

        return result.toString();
    }

    private String getTripDetails(Trip trip) {
        StringBuilder details = new StringBuilder();

        details.append("---------------- Trip details -------").append("\n");
        details.append("Distance : " + trip.distanceInKm + " km \n");
        details.append("Time : " + trip.timeInHours + " hr \n");
        details.append("Rate Factor : " + trip.rateFactor + " hr \n");

        return details.toString();
    }
}
