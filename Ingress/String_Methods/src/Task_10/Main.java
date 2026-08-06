package Task_10;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Name Count: ");
        int nameCount = scanner.nextInt();
        scanner.nextLine();
        String [] arrayFirstName = new String[nameCount];
        String [] arrayLastName = new String[nameCount];

        for (int i = 0;i<nameCount;i++){
            System.out.println("Enter the First name: ");
            arrayFirstName[i] = scanner.nextLine();
            System.out.println("Enter the Last name: ");
            arrayLastName[i] = scanner.nextLine();
        }

        for (int i=0;i<nameCount;i++){
            TextFormatter textFormatter = new TextFormatter();
            textFormatter.setFirstName(arrayFirstName[i]);
            textFormatter.setLastName(arrayLastName[i]);
            textFormatter.trimText();
            textFormatter.capitalize();
            textFormatter.createEmail();
            textFormatter.createUsername();
        }
    }
}
