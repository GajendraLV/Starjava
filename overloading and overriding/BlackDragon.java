class BlackDragon {

    
    public void fly() {
        System.out.println("BlackDragon is flying at normal speed.");
    }

    
    public void fly(int speed) {
        System.out.println("BlackDragon is flying at speed: " + speed);
    }

 
    public void fly(int speed, String direction) {
        System.out.println("BlackDragon is flying at speed: "+ direction);
    }

  
    public void fly(int speed, String direction, boolean fireBreath) {
        System.out.println("BlackDragon is flying at speed: " +fireBreath);
    }

  
    public void fly(int speed, String direction, boolean fireBreath, double altitude) {
        System.out.println("BlackDragon is flying at speed: "+ altitude);
    }
}