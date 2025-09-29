class Train {
    
    public int trainNumber;
    public String trainName;
    public String source;
    public String destination;
    public int numberOfCoaches;
    public double ticketPrice;
    public boolean isExpress;

    public Train() {
        System.out.println("This is no argumental constructor in Train class.");
    }

    public Train(int trainNumber, String trainName, String source, String destination,
                 int numberOfCoaches, double ticketPrice, boolean isExpress) {
        this.trainNumber = trainNumber;
        this.trainName = trainName;
        this.source = source;
        this.destination = destination;
        this.numberOfCoaches = numberOfCoaches;
        this.ticketPrice = ticketPrice;
        this.isExpress = isExpress;
        System.out.println("This is parameterized constructor in Train class.");
    }
}
