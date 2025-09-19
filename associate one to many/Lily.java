class Lily {
    public String color;
    public int height;
    public CommonFertilizer fertilizer;

    public Lily(String color, int height, CommonFertilizer fertilizer) {
        this.color = color;
        this.height = height;
        this.fertilizer = fertilizer;
    }

    public void displayLily() {
        System.out.println("This is Lily");
        System.out.println("Color = " + color);
        System.out.println("Height = " + height );
        System.out.println("Fertilizer = " + fertilizer.name);
        System.out.println("Fertilizer Quantity = " + fertilizer.quantity );
    }
}
