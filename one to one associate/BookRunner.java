public class BookRunner {
    public static void main(String[] args) {
        Author author = new Author("R.K. Narayan", 80);
        Book book = new Book("Malgudi Days", author);

        book.displayBook();
        author.displayAuthor();
    }
}
