package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Cello extends Instrument {

    private int numOfStrings;

    public Cello(String name, Family family, double buyPrice, double sellPrice, Material material, int numofStrings) {
        super(name, family, buyPrice, sellPrice, material);
        this.numOfStrings = numofStrings;
    }

    public String play(){
        return "rumble rumble";
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }
}
