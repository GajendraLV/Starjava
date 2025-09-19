class CommonSalt {
    public int quantity;
    public String type;

    public CommonSalt(int quantity, String type) {
        this.quantity = quantity;
        this.type = type;
    }

    public void displaySalt() {
        System.out.println("This is CommonSalt");
        System.out.println("Quantity = " + quantity);
        System.out.println("Type = " + type);
    }
}