import java.util.Scanner;
public class Task_9 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Year");
        int year = input.nextInt();
        if ((year % 4 == 0 & year % 100 != 0) | (year % 400 == 0)) {
            System.out.println("A year is a full year");
        } else {
            System.out.println(("A year is not a full year"));
        }
    }
}
