package Task_6;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        CountLetters countLetters = new CountLetters();
        countLetters.countLetters(text);

    }
}
