public class Book {
    private String title;
    private int pages;

    public Book(String title, int pages) {
        if (pages > 0) {
            this.title = title;
            this.pages = pages;
        } else {
            System.out.println("Number of pages cannot be negative");
        }
    }

    public String getTitle() {
        return this.title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setPages(int pages) {
        if (pages > 0)
            this.pages = pages;
        else
            System.out.println("Number of pages cannot be negative");
    }

    public static void main(String[] args) {
        Book b = new Book("Gra o tron", 956);

        System.out.println(b.getPages());
        System.out.println(b.getTitle());
        b.setPages(345);
        b.setTitle("Wiedźmin");
        System.out.println(b.getPages());
        System.out.println(b.getTitle());
    }
}
