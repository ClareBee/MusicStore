package com.example.clareblackburne.musicshop.Accessory;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class MusicStand extends Accessory   {

    private Material material;

    public MusicStand(String name, double buyPrice, double sellPrice, Material material) {
        super(name, buyPrice, sellPrice);
        this.material = material;
    }

    public Material getMaterial() {
        return this.material;
    }
}
