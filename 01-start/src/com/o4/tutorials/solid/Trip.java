package com.o4.tutorials.solid;

public class Trip {

    private double distanceInKm;
    private double rateFactor;
    private double peakFactor;
    private double timeInHours;
    private double discountFactor;
    private double taxFactor;

    public Trip(double distanceInKm, double rateFactor, double peakFactor, double timeInHours, double discountFactor, double taxFactor) {
        this.distanceInKm = distanceInKm;
        this.rateFactor = rateFactor;
        this.peakFactor = peakFactor;
        this.timeInHours = timeInHours;
        this.discountFactor = discountFactor;
        this.taxFactor = taxFactor;
    }

    public void printTrip() {

        double base = Math.ceil((distanceInKm * rateFactor) + (timeInHours * rateFactor));
        double peak = Math.ceil(base * peakFactor);
        double discount = Math.floor((base + peak) * discountFactor);
        double totalFare = base + peak - discount;
        double tax = Math.ceil(totalFare * taxFactor);
        double payable = totalFare + tax;

        System.out.println("***************************************");
        System.out.println("---------------- Trip details -------");
        System.out.println("Distance : " + distanceInKm);
        System.out.println("Time : " + timeInHours);
        System.out.println("Peak factor : " + peakFactor);
        System.out.println("---------------- Bill ---------------");
        System.out.println("Base fare: " + base);
        System.out.println("Peak: +" + peak);
        System.out.println("discount: -" + discount);
        System.out.println("Tax: +" + tax);
        System.out.println("---------------- Payable -------------");
        System.out.println("Payable Fare: " + payable);
        System.out.println("***************************************");

        System.out.println("Send SMS to the customer");
    }
}
