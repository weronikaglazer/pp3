public class Book {
    String title;
    String author;
    int yearWritten;
    boolean isOpen;

    void open() {
        isOpen = true;
    }

    void close() {
        isOpen = false;
    }

    void displayTitleAndAuthor() {
        System.out.println(title + " written by " + author);
    }

    void isNew() {
        String isNew = yearWritten > 2018 ? "This is a new book." : "This is not a new book.";
        System.out.println(isNew);
    }

    public static void main(String[] args) {
        Book firstBook = new Book();
        Book secondBook = new Book();

        firstBook.title = "Game of Thrones";
        firstBook.author = "George R. R. Martin";
        firstBook.yearWritten = 1996;
        firstBook.isOpen = false;

        secondBook.title = "Pachinko";
        secondBook.author = "Min Jin Lee";
        secondBook.yearWritten = 2017;
        secondBook.isOpen = true;

        firstBook.displayTitleAndAuthor();
        secondBook.isNew();
        firstBook.open();
    }
}
