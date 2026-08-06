package Task_12;

import java.util.Scanner;

public class Main {
    static int fibonacci(int numb) {
        if (numb <= 1) {
            return numb;
        }
        return fibonacci(numb - 1) + fibonacci(numb - 2);
    }

    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number to find it ");
        int numb = input.nextInt();
        for (int i = 0; i < numb; i++) {
            System.out.println(fibonacci(i) + " ");
        }
    }
}
