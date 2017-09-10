package com.example.user.musicshop;

import java.util.ArrayList;

/**
 * Created by user on 09/09/2017.
 */

public class Shop {
    ArrayList<Sellable> stock;

    public Shop(ArrayList<Sellable> stock) {
        this.stock = stock;
    }


    public ArrayList getStock(){
        return this.stock;
    }

    public void addItemToStock(Sellable item){
        this.stock.add(item);
    }

    public void removeItemFromStock(Sellable item){
        this.stock.remove(item);
    }

    public int calculatePotentialProfit(){

        int profit = 0;

        for (int i = 0; i < this.stock.size(); i++ ) {
            int markUp = this.stock.get(i).calculateMarkup();
            profit += markUp;
        }

        return profit;
    }
}
