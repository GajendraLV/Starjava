class Bear {
    public String name = "Baloo";
    public int id = 303;
    public float number = 120.45f;
    public double result = 85.25;
    public char rating = 'd';
    public boolean isPassed = false;
    public long phoneNumber = 9988776655L;

    public String name() {
        System.out.println(name);
        return name;
    }

    public int id() {
        System.out.println(id);
        return id;
    }

    public float number() {
        System.out.println(number);
        return number;
    }

    public double result() {
        System.out.println(result);
        return result;
    }

    public char rating() {
        System.out.println(rating);
        return rating;
    }

    public boolean isPassed() {
        System.out.println(isPassed);
        return isPassed;
    }

    public long phoneNumber() {
        System.out.println(phoneNumber);
        return phoneNumber;
    }
}
