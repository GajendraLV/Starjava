class DragonRunner {
    public static void main(String[] args) {
        Dragon dragon = new Dragon();

        dragon.breatheFire();
        dragon.breatheFire(5);
        dragon.breatheFire(10, "red");
        dragon.breatheFire(15, "blue", true);
        dragon.breatheFire(20, "green", false, 12.5f);
        dragon.breatheFire(25, "black", true, 15.3f, 200.5d);
        dragon.breatheFire(30, "golden", true, 18.7f, 350.0d, 60L);
    }
}