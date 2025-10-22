package com.xworks.metro.extranal;

import com.xworks.metro.internal.Car;
import com.xworks.metro.internal.Driver;

public class CarRunner {
    public static void main(String[] args) {
        Driver driver = new Driver("Arjun", 5);
        Car car = new Car("Tesla Model S", driver);

        car.displayCar();
        driver.displayDriver();
    }
}

