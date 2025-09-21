class Truck {
    public String name;
    public Engine engine;
    public Fuel fuel;
    public Wheel wheel;

    public Truck(String name, Engine engine, Fuel fuel, Wheel wheel) {
        this.name = name;
        this.engine = engine;
        this.fuel = fuel;
        this.wheel = wheel;
    }

    public void displayTruckInfo() {
        System.out.println("This is Truck Information:");
        System.out.println("Truck Name: " + name);
        System.out.println("Engine Horsepower: " + engine.horsePower);
        System.out.println("Fuel Type: " + fuel.type);
        System.out.println("Number of Wheels: " + wheel.count);
    }
}