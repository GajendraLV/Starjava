class Metro extends Train {
    
    public int trainNumber;
    public String trainName;
    public String source;
    public String destination;
	
    public int numberOfCoaches;
    public double ticketPrice;
    public boolean isExpress;

    public Metro() {
        super();
        System.out.println("This is no argumental constructor in Metro class.");
    }

    public Metro(int trainNumber, String trainName, String source, String destination,
                 int numberOfCoaches, double ticketPrice, boolean isExpress) {
        this();
        
        
        super.trainNumber = trainNumber;
        super.trainName = trainName;
        super.source = source;
        super.destination = destination;
        super.numberOfCoaches = numberOfCoaches;
        super.ticketPrice = ticketPrice;
        super.isExpress = isExpress;
        
        
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.numberOfCoaches = numberOfCoaches;
        this.ticketPrice = ticketPrice;
        this.isExpress = isExpress;
    }

    public void displayInfo() {
        System.out.println("Train class train Number = " + super.trainNumber);
        System.out.println("Train class train Name = " + super.trainName);
        System.out.println("Train class source = " + super.source);
        System.out.println("Train class destination = " + super.destination);
        System.out.println("Train class number Of Coaches = " + super.numberOfCoaches);
        System.out.println("Train class ticket Price = " + super.ticketPrice);
        System.out.println("Train class is Express = " + super.isExpress);

        System.out.println("Metro class train Number = " + this.trainNumber);
        System.out.println("Metro class train Name = " + this.trainName);
        System.out.println("Metro class source = " + this.source);
        System.out.println("Metro class destination = " + this.destination);
        System.out.println("Metro class number Of Coaches = " + this.numberOfCoaches);
        System.out.println("Metro class ticket Price = " + this.ticketPrice);
        System.out.println("Metro class is Express = " + this.isExpress);
    }
}