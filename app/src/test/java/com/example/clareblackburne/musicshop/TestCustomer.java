package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Accessory.Microphone;
import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Tuba;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestCustomer {

    private Customer customer;
    private Tuba tuba;
    private Store store;
    private Microphone microphone;

    @Before
    public void before(){
        customer = new Customer("Bob", 500);
        tuba = new Tuba("tuba", Family.BRASS, 70, 90, Material.COPPER);
        microphone = new Microphone("microphone", 50, 60, "dynamic");
        store = new Store("Mike's Music Shop", "Mike", 15000);
    }

    @Test
    public void customerCanBuyInstrument(){
        customer.buy(tuba);
        assertEquals(410, customer.getCash(), 0.1);
    }

    @Test
    public void customerCanBuyAccessory(){
        customer.buy(microphone);
        assertEquals(440, customer.getCash(), 0.1);
    }
    @Test
    public void customerCanTryInstrument(){
       assertEquals("whomppp whompp", customer.tryOut(tuba));
    }
}
