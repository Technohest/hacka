package com.technohest.hacka;

/**
 * Created by oskar on 2016-10-01.
 */
public class HackaModel {
    private int money;
    public HackaModel(){
        money=0;
    }

    public int getMoney() {
        return money;
    }

    public void addMoney(int money) {
        this.money += money;
    }
}
