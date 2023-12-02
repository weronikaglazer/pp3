public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void display() {
        System.out.println("Title: " + this.title);
        System.out.println("Author: " + this.author);
    }

    public static void main(String[] args) {
        Book book1 = new Book("Title1", "John Smith");
        Book book2 = new Book("Title2", "Adam Johnson");

        book1.display();
        book2.display();
    }
}