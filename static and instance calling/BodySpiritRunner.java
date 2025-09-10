class BodySpiritRunner{
    public static void main(String[] args) {
        Body body = new Body();
        Spirit spirit = new Spirit();
        
        spirit.motivate(body);
        
        System.out.println("Energy Level: " + Body.energyLevel);
    }
}