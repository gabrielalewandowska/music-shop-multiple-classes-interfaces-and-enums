package com.example.user.musicshop;

/**
 * Created by user on 08/09/2017.
 */

public class Guitar extends Instrument implements Playable, Sellable {
     Material material;
     String colour;
     InstrumentType type;
     int buyingPrice;
     int sellingPrice;

    public Guitar(Material material, String colour, InstrumentType type, int buyingPrice, int sellingPrice) {
       super(material, colour, type, buyingPrice, sellingPrice);
    }


    @Override
    public String play() {
        return "I'm making guitarry sounds!";
    }
}
