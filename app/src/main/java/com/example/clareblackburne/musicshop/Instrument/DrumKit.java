package com.example.clareblackburne.musicshop.Instrument;

import com.example.clareblackburne.musicshop.Material;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class DrumKit extends Instrument {

    int numberOfPieces;

    public DrumKit(String name, Family family, double buyPrice, double sellPrice, Material material, int numberOfPieces) {
        super(name, family, buyPrice, sellPrice, material);
        this.numberOfPieces = numberOfPieces;
    }

    public String play(){
        return "badda badoom tish";
    }

    public int getNumberOfPieces() {
        return this.numberOfPieces;
    }
}
