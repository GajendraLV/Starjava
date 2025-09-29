class BlackDragonRunner {
    public static void main(String[] args) {
        BlackDragon dragon = new BlackDragon();

        
        dragon.fly();
        dragon.fly(120);
        dragon.fly(150, "north");
        dragon.fly(200, "east", true);
        dragon.fly(250, "west", false, 1500.5);
    }
}