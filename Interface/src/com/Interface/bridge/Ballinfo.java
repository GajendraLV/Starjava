package com.Interface.bridge;

import com.Interface.internal.Bat;

public class Ballinfo implements Ball{
    public int ballprice;
    public Bat bat;
    public Ballinfo(int ballprice,Bat bat){
        this.ballprice=ballprice;
        this.bat=bat;
    }
    @Override
    public Ball ballDetails(Ball ball) {
        System.out.println("this is"+ballprice);
        System.out.println("this is"+bat.runs);
        System.out.println("this is"+bat.name);
        System.out.println("this is"+bat.percent);
        return ball;
    }

    @Override
    public int runs(Ball ball) {
        System.out.println("this is"+ballprice);
        return ballprice;
    }

    @Override
    public String name(Ball ball) {
        System.out.println("this is"+bat.name);
        return bat.name;
    }

    @Override
    public Double percent(Ball ball) {
        System.out.println("this is"+bat.percent);
        return bat.percent;
    }

    @Override
    public Boolean isball(Ball ball) {
        if(bat.name=="Rocky") {
            System.out.println("this is");
            return true;
        }
        else{
            System.out.println("this is");
            return false;

        }
    }
}
