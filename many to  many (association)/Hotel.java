class Hotel {
    public String placeName;
    public Chef chef;
    public Waiter waiter;
    public Table table;

    public Hotel(String placeName, Chef chef, Waiter waiter, Table table) {
        this.placeName = placeName;
        this.chef = chef;
        this.waiter = waiter;
        this.table = table;
    }

    public void displayHotelInfo() {
        System.out.println("This is Hotel Information:");
        System.out.println("Hotel Name: " + placeName);
        System.out.println("Chef Name: " + chef.name);
        System.out.println("Number of Waiters: " + waiter.count);
        System.out.println("Number of Tables: " + table.numberOfTables);
    }
}
