package com.xworks.metro.extranal;

import com.xworks.metro.internal.*;

public class VehicleRunner {
        public static <Engine> void main(String[] args) {
            Engine carEngine = new Engine(120);
            Engine bikeEngine = new Engine(50);
            Engine truckEngine = new Engine(400);

            Fuel carFuel = new Fuel("Petrol");
            Fuel bikeFuel = new Fuel("Petrol");
            Fuel truckFuel = new Fuel("Diesel");

            Wheel carWheel = new Wheel(4);
            Wheel bikeWheel = new Wheel(2);
            Wheel truckWheel = new Wheel(6);

            Car car = new Car("Sedan", carEngine, carFuel, carWheel);
            Bike bike = new Bike("Sport Bike", bikeEngine, bikeFuel, bikeWheel);
            Truck truck = new Truck("Heavy Truck", truckEngine, truckFuel, truckWheel);

            Bus.displayCarInfo();
            Laari.displayBikeInfo();
        }
    }

