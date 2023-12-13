import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;

    public Library() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            book.display();
        }
    }

    public static void main(String[] args) {
        Publisher publisher = new Publisher("Penguin", "Boston");
        Writer writer = new Writer("John", "Green", "young adult");
        Book book = new Book("Game of thrones", "George R.R. Martin", publisher, 1992, writer);
        Ebook ebook = new Ebook("Yellowface", "Rebecca Kuang", publisher, "yellowface.epub", 2022, writer);
        Audiobook audiobook = new Audiobook("The Poppy War", "Rebecca Kuang", publisher, 590, 32, 2019, writer);

        Library library = new Library();

        library.addBook(book);
        library.addBook(audiobook);
        library.addBook(ebook);

        library.displayBooks();
    }
}
