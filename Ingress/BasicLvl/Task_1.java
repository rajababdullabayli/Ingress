import java.util.Scanner;
public class Task_1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number 1: ");
        int a=input.nextInt();
        System.out.print("Enter number 2: ");
        int b=input.nextInt();
        System.out.println("Cəm :" + (a+b));
        System.out.println("Fərq :" + (a-b));
        System.out.println("Hasil :" + a*b);
        System.out.println("Nisbət :" + (double) (a/b));
        System.out.println("Qalıq :" + (a%b));
    }
}
