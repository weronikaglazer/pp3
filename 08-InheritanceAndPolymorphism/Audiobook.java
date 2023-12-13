public class Audiobook extends Book {
    private int minutes;
    private int seconds;

    public Audiobook(String title, String author, Publisher publisher, int minutes, int seconds, int year, Writer writer) {
        super(title, author, publisher, year, writer);
        this.minutes = minutes;
        this.seconds = seconds;
    }

    public void display() {
        System.out.println("Title: " + getTitle());
        System.out.println("Author: " + getAuthor());
        System.out.println("Publisher: " + getPublisher().getName());
        System.out.println("Duration: " + getMinutes() + " minutes and " + getSeconds() + " seconds");
        System.out.println("Year: " + getYear());
    }

    public int getMinutes() {
        return this.minutes;
    }

    public void setMinutes(int minutes) {
        this.minutes = minutes;
    }

    public int getSeconds() {
        return this.seconds;
    }

    public void setSeconds(int seconds) {
        this.seconds = seconds;
    }

    public static void main(String[] args) {
    }
}
