package Task_11;

import java.util.Scanner;

public class Main {

    static int factorial(int numb) {
        if (numb <= 1) {
            return 1;
        }

        return numb * factorial(numb - 1);
    }
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Factorial's Number");
        int numb = input.nextInt();
        int result = factorial(numb);

        System.out.println("result: " + result);
    }
}
