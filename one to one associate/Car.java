class Car {
    public String carName;
    public Driver driver;

    public Car(String carName, Driver driver) {
        this.carName = carName;
        this.driver = driver;
    }

    public void displayCar() {
        System.out.println("This is Car class");
        System.out.println("Car name: " + carName);
        System.out.println("Driven by: " + driver.driverName + " (Experience: " + driver.experience + " years)");
    }
}