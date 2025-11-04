package com.Fruits.external;

import com.Fruits.bridge.FootBall;
import com.Fruits.bridge.FootBallinfo;

public class FootBallRunner {
    public static void main(String[] args) {
        FootBall ball=new FootBallinfo();
           int price= ball.price(20);
        System.out.println(price);
        }
    }
