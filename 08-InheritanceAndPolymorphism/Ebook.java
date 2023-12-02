public class Ebook extends Book {
    private String fileName;

    public Ebook(String title, String author, String fileName) {
        super(title, author);
        this.fileName = fileName;
    }

    public String getFileName() {
        return this.fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public void display() {
        System.out.println("Title: " + this.getTitle());
        System.out.println("Author: " + this.getAuthor());
        System.out.println("Filename: " + this.fileName);

    }

    public static void main(String[] args) {
        Ebook ebook1 = new Ebook("Yellowface", "Rebecca F. Kuang", "yellowface.mobi");
        Ebook ebook2 = new Ebook("The Witcher", "Andrzej Sapkowski", "thewitcher.mobi");

        ebook1.display();
        ebook2.display();
    }

}
