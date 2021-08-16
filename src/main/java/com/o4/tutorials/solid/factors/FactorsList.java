package com.o4.tutorials.solid.factors;

import com.o4.tutorials.solid.RandomNumber;

import java.util.ArrayList;
import java.util.List;

public class FactorsList {

    public List<PriceFactor> getDefaultFactors() {
        List<PriceFactor> priceFactors = new ArrayList<>();

        priceFactors.add(new PriceFactor("Peak", RandomNumber.getDouble(0.1, 0.8)));
        priceFactors.add(new PriceFactor("Discount", -RandomNumber.getDouble(0.05, 0.15)));
        priceFactors.add(new PriceFactor("City Tax", 0.05D));
        priceFactors.add(new PriceFactor("Tax", 0.33D));

        return priceFactors;
    }
}
