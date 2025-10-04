class Producer {
    public Producer() {
        this(2000, "Producer");
        System.out.println("Producer: Default constructor");
    }

    public Producer(int budget, String producerName) {
        this(2000, "Producer", 15.5f);
        System.out.println("Producer budget: " + budget);
    }

    public Producer(int budget, String producerName, float rating) {
        this(2000, "Producer", 15.5f, 15000000d);
        System.out.println("Producer name: " + producerName);
    }

    public Producer(int budget, String producerName, float rating, double boxOffice) {
        this(2000, "Producer", 15.5f, 15000000d, 1000000L);
        System.out.println("Producer rating: " + rating);
    }

    public Producer(int budget, String producerName, float rating, double boxOffice, long fans) {
        this(2000, "Producer", 15.5f, 15000000d, 1000000L, 'P');
        System.out.println("Producer box office: " + boxOffice);
    }

    public Producer(int budget, String producerName, float rating, double boxOffice, long fans, char grade) {
        this(2000, "Producer", 15.5f, 15000000d, 1000000L, 'P', true);
        System.out.println("Producer fans: " + fans);
    }

    public Producer(int budget, String producerName, float rating, double boxOffice, long fans, char grade, boolean isFamous) {
        System.out.println("Producer grade: " + grade);
        System.out.println("Producer famous: " + isFamous);
    }
}
