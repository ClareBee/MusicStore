package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Xylophone extends Instrument {


    private int numberOfBars;

    public Xylophone(String name, Family family, double buyPrice, double sellPrice, Material material, int numberOfBars) {
        super(name, family, buyPrice, sellPrice, material);
        this.numberOfBars = numberOfBars;
    }


    public String play(){
        return "plink plink plonk";
    }

    public int getNumberOfBars() {
        return this.numberOfBars;
    }
}
