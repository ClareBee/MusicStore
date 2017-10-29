package com.example.clareblackburne.musicshop.Accessory;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class SheetMusic extends Accessory  {

    int numOfPages;

    public SheetMusic(String name, double buyPrice, double sellPrice, int numOfPages){
        super(name, buyPrice, sellPrice);
        this.numOfPages = numOfPages;
    }

    public int getNumOfPages() {
        return this.numOfPages;
    }
}
