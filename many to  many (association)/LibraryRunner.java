class LibraryRunner {
    public static void main(String[] args) {
        Book book = new Book("The 48 Laws of Power", 500);
        Magazine magazine = new Magazine("Tech World", 120);
        Newspaper newspaper = new Newspaper("The Hindu", 10);

        Library library = new Library("City Central Library", 5, book, magazine, newspaper);

        library.displayLibraryInfo();
    }
}