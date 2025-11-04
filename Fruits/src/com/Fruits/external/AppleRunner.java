package com.Fruits.external;

import com.Fruits.bridge.Apple;
import com.Fruits.bridge.Appleinfo;

public class AppleRunner {

    public static void main(String[] args) {

        Apple apple = new Appleinfo();
            String brandName = apple.brandName("Apple");
        System.out.println(brandName);

    }
}