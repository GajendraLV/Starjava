class Garage {
    public String garageName;
    public int numberOfVehicles;
    public Car car;
    public Bike bike;
    public Truck truck;

    public Garage(String garageName, int numberOfVehicles, Car car, Bike bike, Truck truck) {
        this.garageName = garageName;
        this.numberOfVehicles = numberOfVehicles;
        this.car = car;
        this.bike = bike;
        this.truck = truck;
    }

    public void displayGarageInfo() {
        System.out.println("This is Garage class.");
        System.out.println("Garage Name = " + garageName);
        System.out.println("Number of Vehicles = " + numberOfVehicles);
        System.out.println("Car Brand = " + car.carBrand + " | Price = " + car.carPrice);
        System.out.println("Bike Brand = " + bike.bikeBrand + " | Price = " + bike.bikePrice);
        System.out.println("Truck Brand = " + truck.truckBrand + " | Price = " + truck.truckPrice);
    }
}