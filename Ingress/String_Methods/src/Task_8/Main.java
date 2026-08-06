package Task_8;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text:");
        String text = scanner.nextLine();
        StringUtils stringUtils = new StringUtils();
        stringUtils.setText(text);
        int countLetter = stringUtils.countLetters(text);
        int countDigit =stringUtils.countDigits(text);
        int countSpace =stringUtils.countSpaces(text);
        int countSpecialCharacter =stringUtils.countSpecialCharacters(text);
        System.out.println("Letter: "+countLetter);
        System.out.println("Digit: "+countDigit);
        System.out.println("Space: "+countSpace);
        System.out.println("Special: "+countSpace);
    }
}
