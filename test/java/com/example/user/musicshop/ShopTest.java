package com.example.user.musicshop;

import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertArrayEquals;
import static org.junit.Assert.assertEquals;

import java.lang.reflect.Array;
import java.util.ArrayList;

/**
 * Created by user on 09/09/2017.
 */

public class ShopTest {
    Shop shop;
    Guitar guitar;
    Piano piano;
    ArrayList<Sellable> stock;

    @Before
    public void before(){
        stock = new ArrayList<Sellable>();
        shop = new Shop(stock);
        guitar = new Guitar(Material.WOOD, "brown", InstrumentType.STRING, 250, 300);
        piano = new Piano(Material.WOOD, "black", InstrumentType.PERCUSSION, 9000, 10000);
        shop.addItemToStock(guitar);
        shop.addItemToStock(piano);
    }

    @Test
    public void canAddItemToStock(){
        stock = shop.getStock();
        assertEquals(guitar, stock.get(0));
        assertEquals(piano, stock.get(1));
    }

    @Test
    public void canRemoveItemFromStock(){
        shop.removeItemFromStock(piano);
        assertEquals(guitar, stock.get(0));
        assertEquals(1, stock.size());
    }

    @Test
    public void canCalculatePotentialProfit(){
        assertEquals(1050, shop.calculatePotentialProfit());
    }

}
