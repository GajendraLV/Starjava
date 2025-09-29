class GoldDragon {
    
  
    public void attack() {
        System.out.println("The GoldDragon attacks with fire breath!");
    }

    
    public void attack(String weapon) {
        System.out.println("The GoldDragon attacks using " + weapon);
    }

   
    public void attack(String weapon, int powerLevel) {
        System.out.println("The GoldDragon attacks with "+ powerLevel);
    }

   
    public void attack(String weapon, int powerLevel, boolean isFlying) {
        System.out.println("The GoldDragon attacks with " +isFlying);
    }

  
    public void attack(String weapon, int powerLevel, boolean isFlying, double speed) {
        System.out.println("The GoldDragon attacks with"+ speed );
    }

    
    public void attack(String weapon, int powerLevel, boolean isFlying, double speed, long damage) {
        System.out.println("The GoldDragon attacks with "+damage);
    }
}
