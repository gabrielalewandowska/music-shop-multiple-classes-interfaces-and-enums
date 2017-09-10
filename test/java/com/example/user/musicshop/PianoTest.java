package com.example.user.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by user on 09/09/2017.
 */

public class PianoTest {
    Piano piano;

    @Before
    public void before(){
        piano = new Piano(Material.WOOD, "black", InstrumentType.PERCUSSION, 10500, 12000);
    }

    @Test
    public void canGetMaterial(){
        assertEquals(Material.WOOD, piano.getMaterial());
    }

    @Test
    public void canGetColour(){
        assertEquals("black", piano.getColour());
    }

    @Test
    public void canGetInstrumentType(){
        assertEquals(InstrumentType.PERCUSSION, piano.getType());
    }

    @Test
    public void canCalculateMarkup(){
        assertEquals(1500, piano.calculateMarkup());
    }

    @Test
    public void canPlay(){
        assertEquals("I'm making piano-like sounds!", piano.play());
    }

}
