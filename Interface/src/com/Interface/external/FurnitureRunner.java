package com.Interface.external;

import com.Interface.bridge.Furniture;
import com.Interface.bridge.Furnitureinfo;
import com.Interface.internal.Wood;

public class FurnitureRunner {
    public static void main(String[] args) {
        Wood wood =new Wood(20, "gaja", 254554.4);
        Furniture furniture=new Furnitureinfo(20,wood);
        furniture.furniture(furniture);
        furniture.name(furniture);
        furniture.percent(furniture);
        furniture.price(furniture);
        furniture.isFurniture(furniture);
    }
}
