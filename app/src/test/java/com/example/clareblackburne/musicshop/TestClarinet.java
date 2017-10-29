package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Instrument.Clarinet;
import com.example.clareblackburne.musicshop.Instrument.Family;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestClarinet {

    Clarinet clarinet;
    Store store;

    @Before
    public void before(){
        clarinet = new Clarinet("clarinet", Family.WOODWIND, 100, 120, Material.AFRICAN_BOXWOOD);
        store = new Store("Mike's Music Shop", "Mike", 12000);
    }

    @Test
    public void clarinetHasMaterial(){
        assertEquals(Material.AFRICAN_BOXWOOD, clarinet.getMaterial());
    }

    @Test
    public void clarinetMarkUp(){
        assertEquals(20, clarinet.calculateMarkup(), 0.1);
    }

    @Test
    public void clarinetAddToStore(){
        store.addToStock(clarinet);
        assertEquals(1, store.stock.size());
    }
}
