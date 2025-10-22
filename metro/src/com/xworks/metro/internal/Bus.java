package com.xworks.metro.internal;

public class Bus {
    public String name;
    public Engine engine;
    public Fuel fuel;
    public Wheel wheel;

    public Bus(String name, Engine engine, Fuel fuel, Wheel wheel) {
        this.name = name;
        this.engine = engine;
        this.fuel = fuel;
        this.wheel = wheel;
    }

    public void displayCarInfo() {
        System.out.println("This is Car Information:");
        System.out.println("Car Name: " + name);
        System.out.println("Engine Horsepower: " + engine.horsePower);
        System.out.println("Fuel Type: " + fuel.type);
        System.out.println("Number of Wheels: " + wheel.count);
    }
}
