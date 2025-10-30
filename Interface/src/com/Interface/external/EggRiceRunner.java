package com.Interface.external;

import com.Interface.bridge.EggRice;
import com.Interface.bridge.EggRiceinfo;
import com.Interface.internal.Egg;

public class EggRiceRunner {
    public static void main(String[] args) {
        Egg egg = new Egg(5, "Desi", 5.5);
        EggRice rice = new EggRiceinfo(50, egg);

        rice.riceDetails(rice);
        rice.isEggDesi(rice);
        rice.dishPrice(rice);
        rice.eggType(rice);
        rice.dishTax(rice);
    }
}
