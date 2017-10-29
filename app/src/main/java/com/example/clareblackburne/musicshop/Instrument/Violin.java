package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Violin extends Instrument {

    int numOfStrings;

    public Violin(String name, Family family, double buyPrice, double sellPrice, Material material, int numofStrings) {
        super(name, family, buyPrice, sellPrice, material);
        this.numOfStrings = numofStrings;
    }

    public String play(){
        return "sqeeeaaaakkkk";
    }

    public int getNumOfStrings() {
        return this.numOfStrings;
    }
}
