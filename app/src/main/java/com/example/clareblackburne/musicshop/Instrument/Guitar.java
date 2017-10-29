package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Guitar extends Instrument {

    String type;

    public Guitar(String name, Family family, double buyPrice, double sellPrice, Material material, String type) {
        super(name, family, buyPrice, sellPrice, material);
        this.type = type;
    }

    public String play(){
        return "twang twang";
    }

    public String getType() {
        return this.type;
    }
}
