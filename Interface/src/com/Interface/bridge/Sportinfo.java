package com.Interface.bridge;

import com.Interface.internal.Golf;

import java.sql.SQLOutput;

public class Sportinfo implements Sport{
    public int price;
    public Golf golf;
    public Sportinfo(int price, Golf golf){
        this.price=price;
        this.golf=golf;
    }
    @Override
    public Sport sport(Sport sport) {
        System.out.println("this is"+price);
        System.out.println("this is"+golf.price);
        System.out.println("this is"+golf.name);
        System.out.println("this is"+golf.percent);
        return sport;
    }

    @Override
    public int price(Sport sport) {
        System.out.println("this is"+golf.price);
        return golf.price;
    }

    @Override
    public String name(Sport sport) {
        System.out.println("this is"+golf.name);
        return golf.name;
    }

    @Override
    public double percent(Sport sport) {
        System.out.println("this is"+golf.percent);
        return golf.percent;
    }

    @Override
    public boolean issport(Sport sport) {
        if(golf.name=="gaja"){
            System.out.println("this is true");
            return true;
        }
        else{
            System.out.println("this is else");
            return false;
        }
    }
}
