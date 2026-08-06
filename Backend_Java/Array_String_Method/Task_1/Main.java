package Task_1;

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
        Max_Min max_min = new Max_Min();
        int max = max_min.findMax(arr);
        int min = max_min.findMin(arr);
        System.out.println("This is array's maximum element: "+max);
        System.out.println("This is array's minimum element: "+min);
    }

}
