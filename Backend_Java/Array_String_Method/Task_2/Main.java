package Task_2;

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
        Reverse reverse = new Reverse();
        reverse.reverseArray(arr);
    }
}
