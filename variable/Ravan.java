class Ravan {
    public static String name;
    public static int id;
    public static long phonenumber;
    public static float percentageSSc;
    public static double percentageHsc;
    public static boolean isGraduated;
    public static char educationRating;

    public static void info() {
        System.out.println("value before reassigning = " + name);
        name = "rama";
        System.out.println("value after reassigning = " + name);

        System.out.println("value before reassigning = " + id);
        id = 2;  
        System.out.println("value after reassigning = " + id);

        System.out.println("value before reassigning = " + phonenumber);
        phonenumber = 2558365555L; 
        System.out.println("value after reassigning = " + phonenumber);

        System.out.println("value before reassigning = " + percentageSSc);
        percentageSSc = 25.14f; 
        System.out.println("value after reassigning = " + percentageSSc);

        System.out.println("value before reassigning = " + percentageHsc);
        percentageHsc = 25.25; 
        System.out.println("value after reassigning = " + percentageHsc);

        System.out.println("value before reassigning = " + isGraduated);
        isGraduated = true; 
        System.out.println("value after reassigning = " + isGraduated);

        System.out.println("value before reassigning = " + educationRating);
        educationRating = 'B'; 
        System.out.println("value after reassigning = " + educationRating);
    
    }
}
