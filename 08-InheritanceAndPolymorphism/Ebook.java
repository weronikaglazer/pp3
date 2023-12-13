public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, Publisher publisher, String fileName, int year, Writer writer) {
        super(title, author, publisher, year, writer);
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher().getName());
        System.out.println("Filename: " + getFileName());
        System.out.println("Year: " + getYear());
    }

    public static void main(String[] args) {
    }

}
