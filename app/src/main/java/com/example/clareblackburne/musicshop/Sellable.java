package com.example.clareblackburne.musicshop;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public interface Sellable {

     double calculateMarkup();

     double getPrice();

     String getName();

     double getSellPrice();


     void setSellPrice(double salePrice);
}
