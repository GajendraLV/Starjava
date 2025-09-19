class Salad {
    public int price;
    public String hotelName;
    public CommonSalt salt;

    public Salad(int price, String hotelName, CommonSalt salt) {
        this.price = price;
        this.hotelName = hotelName;
        this.salt = salt;
    }

    public void displaySalad() {
        System.out.println("This is Salad");
        System.out.println("Price = " + price);
        System.out.println("Hotel = " + hotelName);
        System.out.println("Salt Quantity = " + salt.quantity + " grams");
        System.out.println("Salt Type = " + salt.type);
    }
}