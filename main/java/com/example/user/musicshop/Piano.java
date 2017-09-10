package com.example.user.musicshop;

/**
 * Created by user on 09/09/2017.
 */

public class Piano extends Instrument {
    public Piano(Material material, String colour, InstrumentType type, int buyingPrice, int sellingPrice) {
        super(material, colour, type, buyingPrice, sellingPrice);
    }

    @Override
    public String play() {
        return "I'm making piano-like sounds!";
    }

}
