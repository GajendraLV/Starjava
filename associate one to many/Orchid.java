class Orchid {
    public String color;
    public int height;
    public CommonFertilizer fertilizer;

    public Orchid(String color, int height, CommonFertilizer fertilizer) {
        this.color = color;
        this.height = height;
        this.fertilizer = fertilizer;
    }

    public void displayOrchid() {
        System.out.println("This is Orchid");
        System.out.println("Color = " + color);
        System.out.println("Height = " + height);
        System.out.println("Fertilizer = " + fertilizer.name);
        System.out.println("Fertilizer Quantity = " + fertilizer.quantity);
    }
}

