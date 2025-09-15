class Product {
    public int id;
    public String name;
public Product(int id, String name) {
        this.id = id;
        this.name = name;
    }
public void displayProduct() {
        System.out.println( id + "," + name );
    }
}
