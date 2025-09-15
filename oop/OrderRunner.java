public class OrderRunner {
    public static void main(String[] args) {
        Order order = new Order();

        Item item1 = new Item(1, "Laptop");
        Item item2 = new Item(2, "Smartphone");
        Item item3 = new Item(3, "Headphones");
        Item item4 = new Item(4, "Charger");

        Item[] items = {item1, item2, item3, item4};

        order.orders(items);
    }
}
