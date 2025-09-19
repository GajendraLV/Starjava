class CommonFertilizer {
    public String name;
    public int quantity;

    public CommonFertilizer(String name, int quantity) {
        this.name = name;
        this.quantity = quantity;
    }

    public void displayFertilizer() {
        System.out.println("Fertilizer Name = " + name);
        System.out.println("Quantity = " + quantity + " grams");
    }
}