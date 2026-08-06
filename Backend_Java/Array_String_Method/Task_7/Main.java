package Task_7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        Reverse reverse = new Reverse();
        String reverseString = reverse.recerseString(text);
        System.out.println("Reverse Text: "+reverseString);
    }
}
