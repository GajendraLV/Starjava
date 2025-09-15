class Mall {
    public void showShops(Shop[] shopArray) {
        System.out.println(shopArray.length);
        for (int num = 0; num < shopArray.length; num++) {
            Shop shop = shopArray[num];
            shop.displayShop();
        }
    }
}
