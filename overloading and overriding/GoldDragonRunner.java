class GoldDragonRunner {
    public static void main(String[] args) {
        GoldDragon dragon = new GoldDragon();

        dragon.attack();
        dragon.attack("Fireball");
        dragon.attack("Lightning", 900);
        dragon.attack("Ice Blast", 750, true);
        dragon.attack("Tail Whip", 600, false, 120.5);
        dragon.attack("Meteor Strike", 1000, true, 200.0, 9999999L);
    }
}