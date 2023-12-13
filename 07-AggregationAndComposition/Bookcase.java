import java.util.ArrayList;

public class Bookcase {
    private ArrayList<Book> books;

    public Bookcase() {
        this.books = new ArrayList<>();
    }

    public void addBook(Book book) {
        books.add(book);
    }

    public void removeBook(Book book) {
        books.remove(book);
    }

    public void displayBooks() {
        for (Book book : books) {
            System.out.println(book.getTitle());
            System.out.println();
        }
    }

    public static void main(String[] args) {
        Bookcase bookcase = new Bookcase();
        Book book1 = new Book("Game of thrones", 1199);
        Book book2 = new Book("Yellowface", 415);

        bookcase.addBook(book1);
        bookcase.addBook(book2);

        bookcase.displayBooks();
    }
}
