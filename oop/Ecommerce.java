class Ecommerce{
    public void showProducts(Product[] products) {
        System.out.println(products.length);
        for (int num = 0; num < products.length; num++) {
           Product displayProduct=products[num];
			displayProduct.displayProduct();
        }
    }
}
