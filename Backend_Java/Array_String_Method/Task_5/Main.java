package Task_5;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        Palindrome palindrome = new Palindrome();
        boolean isPalindrome = palindrome.isPalindrome(text);
        System.out.println(isPalindrome);
    }
}
