class StoryoRunner {
    public static void main(String[] args) {
        int drama = Storyo.drama(25);
        System.out.println("Drama: " + drama);

        double produce = Storyo.produce(199.99);
        System.out.println("Produce: " + produce);

        char grade = Storyo.grade('A');
        System.out.println("Grade: " + grade);

        String title = Storyo.title("The Avenger");
        System.out.println("Story title: " + title);

        boolean interesting = Storyo.isInteresting(true);
        System.out.println("Interesting: " + interesting);

        long pages = Storyo.pages(1454L);
        System.out.println("Pages: " + pages);

        float rating = Storyo.rating(4.8f);
        System.out.println("Rating: " + rating);
    }
}
