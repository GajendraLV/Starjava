class Cafe {
    public String placeName;
    public Chef chef;
    public Waiter waiter;
    public Table table;

    public Cafe(String placeName, Chef chef, Waiter waiter, Table table) {
        this.placeName = placeName;
        this.chef = chef;
        this.waiter = waiter;
        this.table = table;
    }

    public void displayCafeInfo() {
        System.out.println("This is Cafe Information:");
        System.out.println("Cafe Name: " + placeName);
        System.out.println("Chef Name: " + chef.name);
        System.out.println("Number of Waiters: " + waiter.count);
        System.out.println("Number of Tables: " + table.numberOfTables);
    }
}