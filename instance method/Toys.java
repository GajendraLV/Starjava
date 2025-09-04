class Toys {
    public static String name = "Car";
    public static int id = 101;
    public static double price = 499.99;
    public static char quality = 'A';
    public static boolean isAvailable = true;

    public void showName() {
        System.out.println("Toy Name: " + name);
    }

    public void showId() {
        System.out.println("Toy Id: " + id);
    }

    public void showPrice() {
        System.out.println("Toy Price: " + price);
    }

    public void showQuality() {
        System.out.println("Toy Quality: " + quality);
    }

    public void showIsAvailable() {
        System.out.println("Is Available: " + isAvailable);
    }
}