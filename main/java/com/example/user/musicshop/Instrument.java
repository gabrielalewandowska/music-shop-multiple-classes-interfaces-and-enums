package com.example.user.musicshop;

/**
 * Created by user on 08/09/2017.
 */

public abstract class Instrument implements Playable, Sellable {
    Material material;
    String colour;
    InstrumentType type;
    int buyingPrice;
    int sellingPrice;

    public Instrument(Material material, String colour, InstrumentType type, int buyingPrice, int sellingPrice) {
        this.material = material;
        this.colour = colour;
        this.type = type;
        this.buyingPrice = buyingPrice;
        this.sellingPrice = sellingPrice;
    }

    public Material getMaterial() {
        return material;
    }

    public String getColour() {
        return colour;
    }

    public InstrumentType getType(){
        return this.type;
    }

    public int getBuyingPrice() {
        return buyingPrice;
    }

    public int getSellingPrice() {
        return sellingPrice;
    }

    public void setBuyingPrice(int buyingPrice) {
        this.buyingPrice = buyingPrice;
    }

    public void setSellingPrice(int sellingPrice) {
        this.sellingPrice = sellingPrice;
    }

    public int calculateMarkup(){
        sellingPrice = this.getSellingPrice();
        buyingPrice = this.getBuyingPrice();
        int markup = sellingPrice - buyingPrice;
        return markup;
    };

}
