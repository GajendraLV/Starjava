package com.xworks.metro.internal;

public class Car {
    public String carName;
    public int driverprice;

    public Car(String carName, Driver driver) {
        this.carName = carName;
        this.driverprice = driverprice;
    }

    public void displayCar() {
        System.out.println("This is Car class");
        System.out.println("Car name: " + carName);
        System.out.println("Driven by: " + driverprice);
    }
}

