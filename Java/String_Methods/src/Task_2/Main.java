package Task_2;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Number-1: ");
        int numb1 = scanner.nextInt();
        System.out.println("Enter The Number-2: ");
        int numb2 = scanner.nextInt();
        System.out.println("Enter The Number-3: ");
        int numb3 = scanner.nextInt();

        Main main = new Main();
        int sum =main.calculateSum(numb1, numb2, numb3);
        System.out.println(sum);
    }

    public int calculateSum(int numb1, int numb2, int numb3) {
        int sum = numb1 + numb2 + numb3;
        return sum;
    }
}
