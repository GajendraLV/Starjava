class Book {
    public static String title;
    public static int pages;
    public static long isbn;
    public static float price;
    public static double rating;
    public static boolean isPublished;
    public static char category;

    public static void info() {
        System.out.println("value before reassigning = " + title);
        title = "Java Programming";
        System.out.println("value after reassigning = " + title);

        System.out.println("value before reassigning = " + pages);
        pages = 500;
        System.out.println("value after reassigning = " + pages);

        System.out.println("value before reassigning = " + isbn);
        isbn = 9780134685991L; 
        System.out.println("value after reassigning = " + isbn);

        System.out.println("value before reassigning = " + price);
        price = 499.99f; 
        System.out.println("value after reassigning = " + price);

        System.out.println("value before reassigning = " + rating);
        rating = 4.8; 
        System.out.println("value after reassigning = " + rating);

        System.out.println("value before reassigning = " + isPublished);
        isPublished = true; 
        System.out.println("value after reassigning = " + isPublished);

        System.out.println("value before reassigning = " + category);
        category = 'A'; 
        System.out.println("value after reassigning = " + category);
    }
}
