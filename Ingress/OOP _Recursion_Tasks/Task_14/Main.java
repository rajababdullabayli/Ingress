package Task_14;

import java.util.Scanner;

public class Main {
    static String reverse(String text) {
        if (text == null || text.length() <= 1) {
            return text;
        }
        return reverse(text.substring(1))+text.charAt(0);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the text");
        String text = input.nextLine();
        System.out.println("The reverse of this text: " + reverse(text));
    }
}
