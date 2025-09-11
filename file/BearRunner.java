class BearRunner {
    public static void main(String[] args) {
        Bear bear = new Bear();
        
        String name = bear.name();
        int id = bear.id();
        float number = bear.number();
        double result = bear.result();
        char rating = bear.rating();
        boolean isPassed = bear.isPassed();
        long phoneNumber = bear.phoneNumber();
    }
}
