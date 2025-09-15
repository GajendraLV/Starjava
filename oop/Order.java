public class Order {
    public void orders(Item[] itemArray) {
        System.out.println("Total Items in Order: " + itemArray.length);
        for (int num = 0; num < itemArray.length; num++) {
            Item item = itemArray[num];
            item.displayItem();
        }
    }
}
