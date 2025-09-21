class GarageRunner {
    public static void main(String[] args) {
        Car car = new Car("Toyota", 1500000);
        Bike bike = new Bike("Royal Enfield", 200000);
        Truck truck = new Truck("Tata Motors", 2500000);

        Garage garage = new Garage("City Vehicle Garage", 3, car, bike, truck);

        garage.displayGarageInfo();
    }
}