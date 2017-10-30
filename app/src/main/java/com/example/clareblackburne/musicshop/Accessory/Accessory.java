package com.example.clareblackburne.musicshop.Accessory;

import com.example.clareblackburne.musicshop.Sellable;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public abstract class Accessory implements Sellable {

    protected String name;
    protected double buyPrice;
    protected double sellPrice;


    public Accessory(String name, double buyPrice, double sellPrice) {
        this.name = name;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
    }
    public double calculateMarkup(){
        return (this.sellPrice -= this.buyPrice);
    }

    public double getPrice(){
        return sellPrice;
    }

    public String getName() {
        return name;
    }


    public double getBuyPrice() {
        return buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }
}
