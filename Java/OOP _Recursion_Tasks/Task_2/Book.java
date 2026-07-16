package Task2;

public class Book {
    private String title;
    private String author;

    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void getInfo() {
        System.out.println("This Book's title " + title);
        System.out.println("This Book's author " + author);
    }

    public Book() {
    }
}
