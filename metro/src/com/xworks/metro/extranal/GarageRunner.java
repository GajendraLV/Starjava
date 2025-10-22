package com.xworks.metro.extranal;

import com.xworks.metro.internal.Bike;
import com.xworks.metro.internal.Car;
import com.xworks.metro.internal.Garage;
import com.xworks.metro.internal.Truck;

public class GarageRunner {
    public static void main(String[] args) {

        Bike bike = new Bike("Royal Enfield", 200000);
        Truck truck = new Truck("Tata Motors", 2500000);


        Garage.displayGarageInfo();
    }
}

