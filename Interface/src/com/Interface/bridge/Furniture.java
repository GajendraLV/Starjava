package com.Interface.bridge;

public interface Furniture {
    Furniture furniture(Furniture furniture);
    int price(Furniture furniture);
    String name(Furniture furniture);
    double percent(Furniture furniture);
    boolean isFurniture(Furniture furniture);
}
