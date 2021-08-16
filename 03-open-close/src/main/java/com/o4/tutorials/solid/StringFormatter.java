package com.o4.tutorials.solid;

import java.util.List;

public class StringFormatter {
    public String format(List<PriceItem> priceItems) {

        var result = new StringBuilder("\n");
        result.append("***************************************").append("\n");

        priceItems.forEach(item -> result.append(item.title).append("  ")
                .append(item.amount).append(" ")
                .append(item.unit).append("\n"));

        return result.toString();
    }
}
