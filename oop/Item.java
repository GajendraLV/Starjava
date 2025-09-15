public class Item {
    public int itemId;
    public String itemName;

    public Item(int itemId, String itemName) {
        this.itemId = itemId;
        this.itemName = itemName;
    }

    public void displayItem() {
        System.out.println(itemId + ", " + itemName);
    }
}
