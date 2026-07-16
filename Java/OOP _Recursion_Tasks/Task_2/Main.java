package Task_2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the Book's number");
        int number = input.nextInt();
        String [] arrayTitle = new String[number];
        String [] arrayAuthor = new String[number];
        for (int i=0;i<number;i++){
            System.out.println("Enter the Book's Title");
            String title = input.next();
            arrayTitle[i] = title;
            System.out.println("Enter the Book's Author");
            String author = input.next();
            arrayAuthor[i] = author;
        }
        for (int j=0;j<number;j++){
            Book book = new Book();
            book.setAuthor(arrayAuthor[j]);
            book.setTitle(arrayTitle[j]);
            book.getInfo();
        }
        System.gc();
    }
}
