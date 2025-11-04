package com.Fruits.external;

import com.Fruits.bridge.Lion;
import com.Fruits.bridge.Lioninfo;

public class LionRunner {
    public static void main(String[] args) {
    Lion lion = new Lioninfo();
    String Huli = lion.name("gaja");
  System.out.println(Huli);
}
}
