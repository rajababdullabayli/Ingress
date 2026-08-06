package Task_3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter The Array length: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        int[] arr = new int[length];
        System.out.println("Enter The Array Elements");
        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }
        Duplicates duplicates = new Duplicates();
        duplicates.findDuplicates(arr);
    }
}
