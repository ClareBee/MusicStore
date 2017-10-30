package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;
import com.example.clareblackburne.musicshop.Playable;
import com.example.clareblackburne.musicshop.Sellable;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public abstract class Instrument implements Playable, Sellable {

    protected String name;
    protected Family family;
    protected double buyPrice;
    protected double sellPrice;
    protected Material material;

    public Instrument(String name, Family family, double buyPrice, double sellPrice, Material material){
        this.name = name;
        this.family = family;
        this.buyPrice = buyPrice;
        this.sellPrice = sellPrice;
        this.material = material;
    }

    public double getPrice(){
        return this.sellPrice;
    }

    public double calculateMarkup(){
        return (this.sellPrice -= this.buyPrice);
    }

    public abstract String play();

    public Material getMaterial() {
        return this.material;
    }

    public String getName() {
        return this.name;
    }

    public Family getFamily() {
        return this.family;
    }

    public double getBuyPrice() {
        return this.buyPrice;
    }

    public void setBuyPrice(double buyPrice) {
        this.buyPrice = buyPrice;
    }

    public double getSellPrice() {
        return this.sellPrice;
    }

    public void setSellPrice(double sellPrice) {
        this.sellPrice = sellPrice;
    }

}
