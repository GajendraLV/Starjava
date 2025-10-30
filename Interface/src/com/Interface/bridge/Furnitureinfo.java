package com.Interface.bridge;

import com.Interface.internal.Wood;

public class Furnitureinfo implements Furniture{
    public int price;
    public Wood wood;
    public Furnitureinfo(int price, Wood wood){
        this.price=price;
        this.wood=wood;
    }
    @Override
    public Furniture furniture(Furniture furniture) {
        System.out.println("this is"+price);
        System.out.println("this is"+wood.price);
        System.out.println("this is"+wood.name);
        System.out.println("this is"+wood.percent);
        return furniture;
    }

    @Override
    public int price(Furniture furniture) {
        System.out.println("this is"+price);
        return price;
    }

    @Override
    public String name(Furniture furniture) {
        System.out.println("this is"+wood.name);
        return wood.name;
    }

    @Override
    public double percent(Furniture furniture) {
        System.out.println("this is"+wood.percent);
        return wood.percent;
    }

    @Override
    public boolean isFurniture(Furniture furniture) {
        if(wood.name=="garuda"){
            System.out.println("this is true");
            return true;
        }
        else{
            System.out.println("this is false");
            return false;
        }
    }
}
