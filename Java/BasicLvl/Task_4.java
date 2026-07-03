import java.util.Scanner;
public class Task_4 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter number 1: ");
        int a = input.nextInt();
        System.out.println("Enter number 2: ");
        int b = input.nextInt();
        System.out.println("a<b " + (a < b));
        System.out.println("a>b " + (a > b));
        System.out.println("a<=b " + (a <= b));
        System.out.println("a>=b " + (a >= b));
        System.out.println("a=b " + (a == b));
    }
}
