class Director {
    public Director() {
        this(1000, "Director"); 
        System.out.println("Director: Default constructor");
    }

    public Director(int salary, String directorName) {
        this(1000, "Director", 12.5f);
        System.out.println("Director salary: " + salary);
    }

    public Director(int salary, String directorName, float rating) {
        this(1000, "Director", 12.5f, 99.9);
        System.out.println("Director name: " + directorName);
    }

    public Director(int salary, String directorName, float rating, double boxOffice) {
        this(1000, "Director", 12.5f, 99.9, 5000000L);
        System.out.println("Director rating: " + rating);
    }

    public Director(int salary, String directorName, float rating, double boxOffice, long fans) {
        this(1000, "Director", 12.5f, 99.9, 5000000L, 'D');
        System.out.println("Director box office: " + boxOffice);
    }

    public Director(int salary, String directorName, float rating, double boxOffice, long fans, char grade) {
        this(1000, "Director", 12.5f, 99.9, 5000000L, 'D', true);
        System.out.println("Director fans: " + fans);
    }

    public Director(int salary, String directorName, float rating, double boxOffice, long fans, char grade, boolean isFamous) {
        System.out.println("Director grade: " + grade);
        System.out.println("Director famous: " + isFamous);
    }
}
