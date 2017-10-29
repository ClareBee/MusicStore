package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Accessory.Accessory;
import com.example.clareblackburne.musicshop.Instrument.Instrument;

import java.util.ArrayList;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class Store {
    String name;
    String owner;
    ArrayList<Sellable> stock;
    double takings;

    public Store(String name, String owner, double takings){
        this.name = name;
        this.owner = owner;
        this.stock = new ArrayList<Sellable>();
        this.takings = takings;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getOwner() {
        return this.owner;
    }


    public ArrayList<Sellable> getStock() {
        return this.stock;
    }

    public int getStockSize(){
        return this.stock.size();
    }

    public String getStockContents(){
        ArrayList<String> names = new ArrayList<>();
        for (int i = 0 ; i < this.stock.size() ; i++) {
             Sellable item = this.stock.get(i);
             names.add(i, item.getName());
        }
       return names.toString();
    }

    public void addToStock(Sellable item){
        this.stock.add(item);
    }

    public void removeFromStock(Sellable item){
        this.stock.remove(item);
    }

    public void sellToCustomer(Customer customer, Sellable item){
        removeFromStock(item);
        customer.buy(item);
    }

    public boolean checkStock(Sellable item){
        return this.stock.contains(item);
    }

    public double calculateTotalPossibleProfit(){
        double total = 0;
        for (int i = 0 ; i < this.stock.size() ; i++) {
        Sellable item = this.stock.get(i);
        total += item.calculateMarkup();
    }
       return total;
    }

    public int howManyInstruments(){
        int instruments = 0;
        for (int i = 0 ; i < this.stock.size() ; i++){
            Sellable item = this.stock.get(i);
            if (item instanceof Instrument)
                instruments += 1;
        }
        return instruments;
    }

    public int howManyAccessories(){
        int accessories = 0;
        for (int i = 0 ; i < this.stock.size() ; i++){
            Sellable item = this.stock.get(i);
            if (item instanceof Accessory)
                accessories += 1;
        }
        return accessories;
    }

    public void applySaleToTypeofItem(double discount, Sellable item) {
       item.setSellPrice(item.getSellPrice() - discount);
    }

}
