package Task_15.library.model;

public class Book {
    private String author;
    private String bookName;
    private int releaseDate;
    private int bookPrice;

    public String getAuthor() {
        return author;
    }

    public String getBookName() {
        return bookName;
    }

    public int getReleaseDate() {
        return releaseDate;
    }

    public int getBookPrice() {
        return bookPrice;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public void setReleaseDate(int releaseDate) {
        this.releaseDate = releaseDate;
    }

    public void setBookPrice(int bookPrice) {
        this.bookPrice = bookPrice;
    }

    public void printInfo(){
        System.out.println("The Name of the Book's Author: "+author);
        System.out.println("Book Release Date: "+releaseDate);
        System.out.println("The Price of the Book: "+bookPrice);
    }
    public Book() {
    }
}
