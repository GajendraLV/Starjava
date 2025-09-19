class Sambar {
    public int price;
    public String hotelName;
    public CommonSalt salt;

    public Sambar(int price, String hotelName, CommonSalt salt) {
        this.price = price;
        this.hotelName = hotelName;
        this.salt = salt;
    }

    public void displaySambar() {
        System.out.println("This is Sambar");
        System.out.println("Price = " + price);
        System.out.println("Hotel = " + hotelName);
        System.out.println("Salt Quantity = " + salt.quantity);
        System.out.println("Salt Type = " + salt.type);
    }
}
