class Bike {
    public String name;
    public Engine engine;
    public Fuel fuel;
    public Wheel wheel;

    public Bike(String name, Engine engine, Fuel fuel, Wheel wheel) {
        this.name = name;
        this.engine = engine;
        this.fuel = fuel;
        this.wheel = wheel;
    }

    public void displayBikeInfo() {
        System.out.println("This is Bike Information:");
        System.out.println("Bike Name: " + name);
        System.out.println("Engine Horsepower: " + engine.horsePower);
        System.out.println("Fuel Type: " + fuel.type);
        System.out.println("Number of Wheels: " + wheel.count);
    }
}
