package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Accessory.InstrumentCase;
import com.example.clareblackburne.musicshop.Instrument.Clarinet;
import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestStore {
    Store store;
    Piano piano;
    Clarinet clarinet;
    InstrumentCase instrumentCase;
    Customer customer;


    @Before
    public void before(){
        store = new Store("Mike's MusicShop", "Mike", 1500);
        customer = new Customer("Bob", 500);
        piano = new Piano("piano", Family.KEYBOARD, 100, 150, Material.BIRCH, "grand");
        clarinet = new Clarinet("clarinet", Family.WOODWIND, 100, 120, Material.AFRICAN_BOXWOOD);
        instrumentCase = new InstrumentCase("guitar case", 40, 50, Material.LEATHER);
    }

    @Test
    public void canAddToStock(){
        store.addToStock(piano);
        assertEquals(1, store.getStockSize());
    }

    @Test
    public void canRemoveFromStock(){
        store.addToStock(piano);
        store.addToStock(clarinet);
        store.removeFromStock(piano);
        assertEquals(1, store.getStockSize());
        assertEquals("[clarinet]", store.getStockContents());
    }

    @Test
    public void testStockContains(){
        store.addToStock(piano);
        assertEquals(true, store.checkStock(piano));
    }

    @Test
    public void canCalculateTotalProfit(){
        store.addToStock(piano);
        store.addToStock(clarinet);
        assertEquals(70, store.calculateTotalPossibleProfit(), 0.1);
    }

    @Test
    public void testHowMuchStockInstruments(){
        store.addToStock(piano);
        store.addToStock(instrumentCase);
        store.addToStock(instrumentCase);
        assertEquals(1, store.howManyInstruments());
    }

    @Test
    public void testDiscount(){
        store.applySaleToTypeofItem(20, piano);
        assertEquals(130, piano.getSellPrice(), 0.1);
    }


}

