public class Book {
    private String title;
    private String author;
    private Publisher publisher;
    private int year;
    private Writer writer;


    public Writer getWriter() {
        return this.writer;
    }

    public void setWriter(Writer writer) {
        this.writer = writer;
    }


    public int getYear() {
        return this.year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getAuthor() {
        return this.author;
    }

    public Publisher getPublisher() {
        return this.publisher;
    }

    public void setPublisher(Publisher publisher) {
        this.publisher = publisher;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public Book(String title, String author, Publisher publisher, int year, Writer writer) {
        this.title = title;
        this.author = author;
        this.publisher = publisher;
        this.year = year;
        this.writer = writer;
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher().getName());
        System.out.println("Year: " + getYear());
        System.out.println("Writer: " + getWriter().getFirstName() + " " + getWriter().getLastName());
    }

    public static void main(String[] args) {
    }
}