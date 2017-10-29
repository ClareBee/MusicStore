package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Piano;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestPiano {

    Piano piano;

    @Before
    public void before(){
        piano = new Piano("piano", Family.KEYBOARD, 120, 160, Material.MAPLE, "grand");
    }

    @Test
    public void markUpPrice(){
        assertEquals(40, piano.calculateMarkup(), 0.1);
    }

    @Test
    public void hasType(){
        assertEquals("grand", piano.getType());
    }
}
