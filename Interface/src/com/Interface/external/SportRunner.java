package com.Interface.external;

import com.Interface.bridge.Sport;
import com.Interface.bridge.Sportinfo;
import com.Interface.internal.Golf;

public class SportRunner {
    public static void main(String[] args) {
        Golf golf=new Golf(20, "gaja", 255.2);
        Sport sport=new Sportinfo(20, golf);
        sport.price(sport);
        sport.name(sport);
        sport.percent(sport);
        sport.issport(sport);
    }
}
