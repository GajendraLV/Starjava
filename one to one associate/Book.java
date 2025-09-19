class Book {
    public String title;
    public Author author;

    public Book(String title, Author author) {
        this.title = title;
        this.author = author;
    }

    public void displayBook() {
        System.out.println("This is Book class");
        System.out.println("Book title: " + title);
        System.out.println("Written by: " + author.authorName + " (Age: " + author.age + ")");
    }
}