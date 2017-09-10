package com.example.user.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 08/09/2017.
 */

public class GuitarTest {
    Guitar guitar;

    @Before
    public void before(){
        guitar = new Guitar(Material.WOOD,"brown", InstrumentType.STRING, 350, 400);
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.WOOD, guitar.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("brown", guitar.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.STRING, guitar.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(50, guitar.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm making guitarry sounds!", guitar.play());
    }


}

