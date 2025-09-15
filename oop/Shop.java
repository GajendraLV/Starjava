class Shop {
    public int shopId;
    public String shopName;

    public Shop(int shopId, String shopName) {
        this.shopId = shopId;
        this.shopName = shopName;
    }

    public void displayShop() {
        System.out.println(shopId + ", " + shopName);
    }
}
