package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Instrument.Instrument;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Customer {

    String name;
    double cash;

    public Customer(String name, double cash){
        this.name = name;
        this.cash = cash;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getCash() {
        return this.cash;
    }

    public void setCash(double cash) {
        this.cash = cash;
    }

    public void buy(Sellable item){
        this.cash -= item.getPrice();
    }

    public String tryOut(Instrument instrument){
        return instrument.play();
    }
}
