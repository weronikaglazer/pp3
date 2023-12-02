public class Writer {
    private String name;
    private int age;
    private Book book;

    Writer(String name, int age) {
        this.name = name;
        this.age = age;
    }

    void addBook(Book book) {
        this.book = book;
    }

    void displayInfo() {
        System.out.println("Name: " + this.name);
        System.out.println("Age: " + this.age);
        System.out.println("Book: " + this.book.getTitle());
    }

    public static void main(String[] args) {
        Book book1 = new Book("Game of thrones", 1102);

        Writer writer1 = new Writer("John Smith", 66);
        writer1.addBook(book1);

        writer1.displayInfo();
        writer1.book.displayTitle();

    }
}
