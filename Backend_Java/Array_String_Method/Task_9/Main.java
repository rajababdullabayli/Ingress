package Task_9;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text1: ");
        String text1 = scanner.nextLine();
        System.out.println("Enter the text2: ");
        String text2 = scanner.nextLine();
        Anagram anagram = new Anagram();
        System.out.println((anagram.areAnagrams(text1,text2)));
    }
}
