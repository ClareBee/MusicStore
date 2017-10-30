package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Piano extends Instrument {

    private String type;

    public Piano(String name, Family family, double buyPrice, double sellPrice, Material material, String type){
        super(name, family, buyPrice, sellPrice, material);
        this.type = type;
    }


    @Override
    public String play() {
        return "Plinkety plonk";
    }

    public String getType(){
        return this.type;
    }
}
