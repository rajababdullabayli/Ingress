import java.util.Scanner;
public class Task_10 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number N:");
        int N=input.nextInt();
        int Sum=0;
        for (int i=1;i<=N;i++){
            Sum+=i;
        }
        System.out.println("Sum=" + Sum);
    }
}
