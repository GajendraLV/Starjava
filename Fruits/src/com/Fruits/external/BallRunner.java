package com.Fruits.external;

import com.Fruits.bridge.Ball;
import com.Fruits.bridge.Ballinfo;

public class BallRunner {
    public static void main(String[] args) {
        Ball ball =new Ballinfo();
        int price=ball.price(20);
        System.out.println("price");

    }
}
