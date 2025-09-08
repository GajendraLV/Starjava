class Store {
    public static String name;
    public static int id;
    public static char rating;
    public static float result;
    public static double percentage;
    public static long phoneNumber;
    public static boolean isPassed;

    public Store(String name, int id, char rating, float result, double percentage, long phoneNumber, boolean isPassed) {
        this.name = name;
        this.id = id;
        this.rating = rating;
        this.result = result;
        this.percentage = percentage;
        this.phoneNumber = phoneNumber;
        this.isPassed = isPassed;

        System.out.println("Name = " + name);
        System.out.println("id = " + id);
        System.out.println("rating = " + rating);
        System.out.println("result = " + result);
        System.out.println("percentage = " + percentage);
        System.out.println("phoneNumber = " + phoneNumber);
        System.out.println("isPassed = " + isPassed);
    }
}
