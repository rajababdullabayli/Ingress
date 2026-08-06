package Task_12;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the Sentence: ");
        String sentence = scanner.nextLine();

        LongestWord longestWord = new LongestWord();
        longestWord.findLongestWord(sentence);
    }
}
