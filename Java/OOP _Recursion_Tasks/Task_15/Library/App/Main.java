package Task_15.library.app;

import Task15.library.model.Book;

import Task15.library.service.LibraryService.Statistics;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Books' number:");
        int numbBook = input.nextInt();

        String[] myBooks = new String[numbBook];

        for (int i = 0; i < numbBook; i++) {

            System.out.println("Enter the Name of the Book's Author.");
            String author = input.next();

            input.nextLine();

            System.out.println("Enter the name of the Book");
            String bookName = input.nextLine();

            System.out.println("Enter the publication date of the book.");
            int releaseDate = input.nextInt();

            System.out.println("Enter the price of the book.");
            int bookPrice = input.nextInt();

            Book book = new Book();
            book.setAuthor(author);
            book.setBookName(bookName);
            book.setReleaseDate(releaseDate);
            book.setBookPrice(bookPrice);
            book.printInfo();
            myBooks[i] = book.getBookName();
        }
        Statistics stats = new Statistics();
        stats.getBookCount(myBooks, 0);
        stats.printBookRecursive(myBooks, 0);
        System.gc();
    }
}
