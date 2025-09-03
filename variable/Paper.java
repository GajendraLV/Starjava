class Paper {
    public static String brand;
    public static int pages;
    public static long batchNumber;
    public static float thickness;
    public static double weight;
    public static boolean isRuled;
    public static char qualityGrade;

    public static void info() {
        System.out.println("value before reassigning = " + brand);
        brand = "Classmate";
        System.out.println("value after reassigning = " + brand);

        System.out.println("value before reassigning = " + pages);
        pages = 200;
        System.out.println("value after reassigning = " + pages);

        System.out.println("value before reassigning = " + batchNumber);
        batchNumber = 9876543211L;
        System.out.println("value after reassigning = " + batchNumber);

        System.out.println("value before reassigning = " + thickness);
        thickness = 0.25f;
        System.out.println("value after reassigning = " + thickness);

        System.out.println("value before reassigning = " + weight);
        weight = 1.5;
        System.out.println("value after reassigning = " + weight);

        System.out.println("value before reassigning = " + isRuled);
        isRuled = true;
        System.out.println("value after reassigning = " + isRuled);

        System.out.println("value before reassigning = " + qualityGrade);
        qualityGrade = 'A';
        System.out.println("value after reassigning = " + qualityGrade);
    }
}
