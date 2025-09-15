public class MallRunner {
    public static void main(String[] args) {
        Mall mall = new Mall();

        Shop shop1 = new Shop(1, "Gaja Electronics");
        Shop shop2 = new Shop(2, "Krish Fashion");
        Shop shop3 = new Shop(3, "Rama Groceries");
        Shop shop4 = new Shop(4, "Arjun Sports");

        Shop[] shops = {shop1, shop2, shop3, shop4};

        mall.showShops(shops);
    }
}
