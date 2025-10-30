package com.Interface.external;

import com.Interface.bridge.Cock;
import com.Interface.bridge.Cockinfo;
import com.Interface.internal.Shuttlecock;

public class CockRunner {
    public static void main(String[] args) {
        Shuttlecock shuttlecock=new Shuttlecock(20,"Rocky", 225.4);
        Cock cock=new Cockinfo(200, shuttlecock);
        cock.cock(cock);
        cock.isCock(cock);
        cock.name(cock);
        cock.percent(cock);
        cock.price(cock);
    }
}
