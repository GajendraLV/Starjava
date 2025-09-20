 class Library {
    public String libraryName;
    public int numberOfSections;
    public Book book;
    public Magazine magazine;
    public Newspaper newspaper;

    public Library(String libraryName, int numberOfSections, Book book, Magazine magazine, Newspaper newspaper) {
        this.libraryName = libraryName;
        this.numberOfSections = numberOfSections;
        this.book = book;
        this.magazine = magazine;
        this.newspaper = newspaper;
    }

    public void displayLibraryInfo() {
        System.out.println("This is Library class.");
        System.out.println("Library Name = " + libraryName);
        System.out.println("Number of sections = " + numberOfSections);
        System.out.println("Book Title = " + book.bookTitle + " " + book.bookPrice);
        System.out.println("Magazine Name = " + magazine.magazineName + " " + magazine.magazinePrice);
        System.out.println("Newspaper Name = " + newspaper.newspaperName + " " + newspaper.newspaperPrice);
    }
}