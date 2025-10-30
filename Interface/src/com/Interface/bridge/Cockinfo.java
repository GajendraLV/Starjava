package com.Interface.bridge;

import com.Interface.internal.Shuttlecock;

public class Cockinfo implements Cock{
    public int cockprice;
    public Shuttlecock shuttlecock;
    public Cockinfo(int cockprice,Shuttlecock shuttlecock){
        this.cockprice=cockprice;
        this.shuttlecock=shuttlecock;
    }

    @Override
    public Cock cock(Cock cock) {
        System.out.println("this is"+cockprice);
        System.out.println("this is"+shuttlecock.name);
        System.out.println("this is"+shuttlecock.percent);
        System.out.println("this is"+shuttlecock.price);
        return cock;
    }

    @Override
    public int price(Cock cock) {
        System.out.println("this is"+shuttlecock.price);
        return shuttlecock.price;
    }

    @Override
    public String name(Cock cock) {
        System.out.println("this is"+shuttlecock.name);
        return shuttlecock.name;
    }

    @Override
    public double percent(Cock cock) {
        System.out.println("this is"+shuttlecock.percent);
        return shuttlecock.percent;
    }

    @Override
    public boolean isCock(Cock cock) {
        if (shuttlecock.name==("Rocky")) {
            System.out.println("this is ");
            return true;
        }
        else{
            System.out.println("this is");
            return false;
        }

    }
}
