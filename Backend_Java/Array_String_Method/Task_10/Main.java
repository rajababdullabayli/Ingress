package Task_10;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the array length: ");
        int length = scanner.nextInt();
        scanner.nextLine();
        System.out.print("Enter the step: ");
        int step = scanner.nextInt();
        int[] array = new int[length];
        System.out.println("Enter the array's elements");
        for (int i = 0; i < array.length; i++) {
            array[i] = scanner.nextInt();
        }
        scanner.nextLine();
        Rotate rotate = new Rotate();
        int[] result = rotate.rotateRight(array, step);
        System.out.println("Result: "+ Arrays.toString(result));
    }
}
