public class Chapter {
    private String title;
    private int pages;
    private int startingPage;

    public Chapter(String title, int pages, int startingPage) {
        this.title = title;
        this.pages = pages;
        this.startingPage = startingPage;
    }


    public String getTitle() {
        return this.title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPages() {
        return this.pages;
    }

    public void setPages(int pages) {
        this.pages = pages;
    }

    public int getStartingPage() {
        return this.startingPage;
    }

    public void setStartingPage(int startingPage) {
        this.startingPage = startingPage;
    }

}   
