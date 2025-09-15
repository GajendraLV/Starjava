public class EcommerceRunner {
    public static void main(String[] args) {
        Product product1 = new Product(1, "T-shirt");
        Product product2 = new Product(2, "Sneakers");
        Product product3 = new Product(3, "Backpack");
        Product product4 = new Product(4, "Smartphone");

        Product[] products = {product1, product2, product3, product4};

        Ecommerce platform = new Ecommerce();
        platform.showProducts(products);
    }
}
