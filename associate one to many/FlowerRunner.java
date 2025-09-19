class FlowerRunner {
    public static void main(String[] args) {
        
        CommonFertilizer fertilizer = new CommonFertilizer("NPK 20-20-20", 100);

   
        Rose rose = new Rose("Red", 50, fertilizer);
        Lily lily = new Lily("White", 45, fertilizer);
        Tulip tulip = new Tulip("Yellow", 40, fertilizer);
        Orchid orchid = new Orchid("Purple", 55, fertilizer);
        Daisy daisy = new Daisy("Pink", 35, fertilizer);

    
        fertilizer.displayFertilizer();
        
        rose.displayRose();
     
        lily.displayLily();
      
        tulip.displayTulip();
        
        orchid.displayOrchid();
      
        daisy.displayDaisy();
    }
}