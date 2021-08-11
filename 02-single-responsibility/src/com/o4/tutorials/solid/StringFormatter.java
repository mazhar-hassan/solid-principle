package com.o4.tutorials.solid;

public class StringFormatter {
    public String format(Billing bill) {

        StringBuilder result = new StringBuilder("\n");
        result.append("***************************************").append("\n");

        result.append(getTripDetails(bill));

        result.append(getBillDetails(bill));

        result.append("---------------- Payable -------------").append("\n");
        result.append("Payable Fare: "+bill.payableFare).append("\n");

        result.append("***************************************").append("\n");

        return result.toString();
    }

    private String  getBillDetails(Billing bill) {
        StringBuilder result = new StringBuilder();

        result.append("---------------- Bill ---------------").append("\n");
        result.append("Base fare: "+ bill.baseFare).append("\n");
        result.append("Peak: +"+ bill.peakAmount).append("\n");
        result.append("discount: -"+ bill.discountAmount).append("\n");
        result.append("Tax: +"+ bill.taxAmount).append("\n");

        return result.toString();
    }

    private String getTripDetails(Billing billing) {
        StringBuilder details = new StringBuilder();

        details.append("---------------- Trip details -------").append("\n");
        details.append("Distance : " + billing.distanceInKm + " km \n");
        details.append("Time : " + billing.timeInHours + " hr \n");
        details.append("Rate Factor : " + billing.rateFactor + " hr \n");

        return details.toString();
    }
}
