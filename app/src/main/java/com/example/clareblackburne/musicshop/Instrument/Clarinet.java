package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Clarinet extends Instrument {

    public Clarinet(String name, Family family, double buyPrice, double sellPrice, Material material) {
        super(name, family, buyPrice, sellPrice, material);
    }

    public String play(){
        return "pnarrrp";
    }
}
