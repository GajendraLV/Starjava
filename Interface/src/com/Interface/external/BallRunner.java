package com.Interface.external;

import com.Interface.bridge.Ball;
import com.Interface.bridge.Ballinfo;
import com.Interface.internal.Bat;

public class BallRunner {
    public static void main(String[] args) {
        Bat bat = new Bat(20, "Rocky", 255.2);
        Ball ballinfo = new Ballinfo(50, bat);

        ballinfo.ballDetails(ballinfo);
        ballinfo.runs(ballinfo);
        ballinfo.name(ballinfo);
        ballinfo.percent(ballinfo);
        ballinfo.isball(ballinfo);
    }
}