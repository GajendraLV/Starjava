class Pen {
    public static String brand;
    public static int price;
    public static long serialNumber;
    public static float inkLevel;
    public static double length;
    public static boolean isWorking;
    public static char qualityGrade;

    public static void info() {
        System.out.println("value before reassigning = " + brand);
        brand = "Parker";
        System.out.println("value after reassigning = " + brand);

        System.out.println("value before reassigning = " + price);
        price = 120;
        System.out.println("value after reassigning = " + price);

        System.out.println("value before reassigning = " + serialNumber);
        serialNumber = 9876543210L;
        System.out.println("value after reassigning = " + serialNumber);

        System.out.println("value before reassigning = " + inkLevel);
        inkLevel = 75.5f;
        System.out.println("value after reassigning = " + inkLevel);

        System.out.println("value before reassigning = " + length);
        length = 14.2;
        System.out.println("value after reassigning = " + length);

        System.out.println("value before reassigning = " + isWorking);
        isWorking = true;
        System.out.println("value after reassigning = " + isWorking);

        System.out.println("value before reassigning = " + qualityGrade);
        qualityGrade = 'A';
        System.out.println("value after reassigning = " + qualityGrade);
    }
}
