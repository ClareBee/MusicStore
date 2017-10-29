package com.example.clareblackburne.musicshop;

import com.example.clareblackburne.musicshop.Instrument.Family;
import com.example.clareblackburne.musicshop.Instrument.Violin;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by clareblackburne on 28/10/2017.
 */

public class TestViolin {

    Violin violin;

    @Before
    public void before(){
        violin = new Violin("violin", Family.STRINGED, 80, 100, Material.ALDER, 4);
    }

    @Test
    public void testViolinHasSellingPrice(){
        assertEquals(100, violin.getSellPrice(), 0.1);
    }

    @Test
    public void testViolinCanPlay(){
        assertEquals("sqeeeaaaakkkk", violin.play());
    }
}
