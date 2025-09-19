class Curry {
    public int price;
    public String hotelName;
    public CommonSalt salt;

    public Curry(int price, String hotelName, CommonSalt salt) {
        this.price = price;
        this.hotelName = hotelName;
        this.salt = salt;
    }

    public void displayCurry() {
        System.out.println("This is Curry");
        System.out.println("Price = " + price);
        System.out.println("Hotel = " + hotelName);
        System.out.println("Salt Quantity = " + salt.quantity);
        System.out.println("Salt Type = " + salt.type);
    }
}