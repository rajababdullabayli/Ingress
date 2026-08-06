import java.util.Scanner;
public class Task_8 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1: ");
        int a=input.nextInt();
        System.out.println("Enter Number 2: ");
        int b=input.nextInt();
        System.out.println("Enter The Operator : ");
        char o=input.next().charAt(0);
        if (o=='+'){
            System.out.println("a+b=" + (a+b));
        }
        if (o=='-'){
            System.out.println("a-b=" + (a-b));
        }
        if (o=='*'){
            System.out.println("a*b=" +(a*b));
        }
        if(o=='/'){
            System.out.println("a/b=" + (a/b));
        }
    }
}
