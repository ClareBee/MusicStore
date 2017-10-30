package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class ElectronicKeyboard extends Instrument {

    private int numberOfKeys;

    public ElectronicKeyboard(String name, Family family, double buyPrice, double sellPrice, Material material, int numberOfKeys) {
        super(name, family, buyPrice, sellPrice, material);
        this.numberOfKeys = numberOfKeys;
    }

    public String play(){
        return "perrrrlonkplonk";
    }

    public int getNumberOfKeys() {
        return this.numberOfKeys;
    }
}
