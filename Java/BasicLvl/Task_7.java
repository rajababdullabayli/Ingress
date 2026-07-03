import java.util.Scanner;
public class Task_7 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Number 1");
        int a = input.nextInt();
        System.out.println("Enter Number 2");
        int b = input.nextInt();
        System.out.println("Enter Number 3");
        int c = input.nextInt();
        int max=a;
        if (max<b){
            max=b;
        }
        if (max<c){
            max=c;
        }
        System.out.println("Maximum Number :" + max);
    }
}
