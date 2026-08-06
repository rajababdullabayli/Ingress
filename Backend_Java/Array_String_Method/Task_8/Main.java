package Task_8;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the text: ");
        String text = scanner.nextLine();
        TitleCase titleCase = new TitleCase();
        String titleText = titleCase.toTitleCase(text);
        System.out.println("Title Case: "+titleText);
    }
}
