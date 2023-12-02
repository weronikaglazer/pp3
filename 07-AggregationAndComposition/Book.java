public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
    }

    public void displayTitle() {
        System.out.println("Book title: " + this.title);
    }

    public String getTitle() {
        return this.title;
    }

    public static void main(String[] args) {
        Book book2 = new Book("Title", 345);
        book2.displayTitle();
    }
}
