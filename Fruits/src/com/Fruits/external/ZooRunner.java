package com.Fruits.external;

import com.Fruits.bridge.Zoo;
import com.Fruits.bridge.Zooinfo;

public class ZooRunner {
    public static void main(String[] args) {
        Zoo zoo=new Zooinfo();
       String Sahoo=zoo.name("gaja");
        System.out.println(Sahoo);

    }
}
