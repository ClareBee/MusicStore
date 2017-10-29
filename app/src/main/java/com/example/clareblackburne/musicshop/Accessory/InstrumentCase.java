package com.example.clareblackburne.musicshop.Accessory;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class InstrumentCase extends Accessory {

    Material material;

    public InstrumentCase(String name, double buyPrice, double sellPrice, Material material){
        super(name, buyPrice, sellPrice);
        this.material = material;
    }

    public Material getMaterial() {
        return this.material;
    }
}
