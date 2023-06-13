package com.ddd_bootcamp.domain;

import java.util.Currency;

public class Price {
    private Double price;
    private String instance;

    public Price(Double price, String instance) {
        this.price = price;
        this.instance = instance;
    }

    public Double getPrice() {
        return price;
    }
}
