class Dragon {

  
    public void breatheFire() {
        System.out.println("Dragon breathes fire!");
    }

   
    public void breatheFire(int intensity) {
        System.out.println("Dragon breathes fire with intensity: " + intensity);
    }

   
    public void breatheFire(int intensity, String color) {
        System.out.println("Dragon breathes " + color );
    }

   
    public void breatheFire(int intensity, String color, boolean isFlying) {
        System.out.println("Dragon breathes " +isFlying);
    }

   
    public void breatheFire(int intensity, String color, boolean isFlying, float flameSize) {
        System.out.println("Dragon breathes " + flameSize);
    }

    public void breatheFire(int intensity, String color, boolean isFlying, float flameSize, double distance) {
        System.out.println("Dragon breathes " + distance);
    }

  
    public void breatheFire(int intensity, String color, boolean isFlying, float flameSize, double distance, long duration) {
        System.out.println("Dragon breathes "+ duration);
    }
}