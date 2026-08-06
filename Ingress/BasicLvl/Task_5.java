import java.util.Scanner;
public class Task_5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your birth year:");
        int birthYear=input.nextInt();
        int thisYear=2026;
        int age=thisYear-birthYear;
        System.out.println("Your age: " + age);
    }
}
