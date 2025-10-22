package com.xworks.metro.internal;

public class Driver {
    public String driverName;
    public int experience;

    public Driver(String driverName, int experience) {
        this.driverName = driverName;
        this.experience = experience;
    }

    public void displayDriver() {
        System.out.println("This is Driver class");
        System.out.println("Driver name: " + driverName);
        System.out.println("Years of experience: " + experience);
    }
}
