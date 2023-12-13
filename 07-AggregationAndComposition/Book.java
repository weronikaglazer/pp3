import java.util.ArrayList;

public class Book {
    private String title;
    private int pages;
    private ArrayList<Chapter> chapters;

    public Book(String title, int pages) {
        this.title = title;
        this.pages = pages;
        this.chapters = new ArrayList<>();
    }

    public void addChapter(Chapter chapter) {
        chapters.add(chapter);
    }

    public void displayChapters() {
        for (Chapter chapter : chapters) {
            System.out.println(chapter.getTitle());
        }
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
        Chapter chapter1 = new Chapter("The story begins", 29, 1);
        book2.addChapter(chapter1);

        Chapter chapter2 = new Chapter("The story continues", 51, 30);
        book2.addChapter(chapter2);

        book2.displayChapters();

    }
}
