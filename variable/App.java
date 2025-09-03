class App {
    public static String name;
    public static int version;
    public static long downloads;
    public static float size;
    public static double rating;
    public static boolean isFree;
    public static char category;

    public static void info() {
        System.out.println("value before reassigning = " + name);
        name = "WhatsApp";
        System.out.println("value after reassigning = " + name);

        System.out.println("value before reassigning = " + version);
        version = 12;
        System.out.println("value after reassigning = " + version);

        System.out.println("value before reassigning = " + downloads);
        downloads = 5000000000L; 
        System.out.println("value after reassigning = " + downloads);

        System.out.println("value before reassigning = " + size);
        size = 42.5f; 
        System.out.println("value after reassigning = " + size);

        System.out.println("value before reassigning = " + rating);
        rating = 4.6;
        System.out.println("value after reassigning = " + rating);

        System.out.println("value before reassigning = " + isFree);
        isFree = true;
        System.out.println("value after reassigning = " + isFree);

        System.out.println("value before reassigning = " + category);
        category = 'S'; 
        System.out.println("value after reassigning = " + category);
    }
}
