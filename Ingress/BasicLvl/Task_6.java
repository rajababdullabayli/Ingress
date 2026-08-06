import java.util.Scanner;
public class Task_6 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number:");
        int numb = input.nextInt();
        if (numb % 2 == 0) {
            System.out.println("Even");
        } else {
            System.out.println("Odd");
        }
    }
}
