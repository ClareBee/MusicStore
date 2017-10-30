package com.example.clareblackburne.musicshop.Accessory;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Microphone extends Accessory {

    private String type;

    public Microphone (String name, double buyPrice, double sellPrice, String type){
        super(name, buyPrice, sellPrice);
        this.type = type;
    }

    public String getType() {
        return this.type;
    }
}

