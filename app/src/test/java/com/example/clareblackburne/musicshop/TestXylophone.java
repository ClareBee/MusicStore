package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Xylophone;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestXylophone {

    private Xylophone xylophone;
    private Store store;
    private Customer customer;

    @Before
    public void before(){
        xylophone = new Xylophone("xylophone", Family.PERCUSSION, 50, 90, Material.COPPER, 40);
        store = new Store("Mike's Music Shop", "Mike", 40000);
        customer = new Customer("Bob", 600);
    }

    @Test
    public void canBeAddedToStock(){
        store.addToStock(xylophone);
        assertEquals(true, store.checkStock(xylophone));
    }

    @Test
    public void canBeBought(){
        store.sellToCustomer(customer, xylophone);
        assertEquals(510, customer.getCash(), 0.1);
        assertEquals(0, store.getStockSize());
    }
}
