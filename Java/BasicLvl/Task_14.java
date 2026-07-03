import java.util.Scanner;
public class Task_12 {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Enter The Number :");
        int N=input.nextInt();
        int fakt=1;
        for(int i=1;i<=N;i++){
            fakt*=i;
        }
        System.out.println(N + "!=" + fakt);
    }
}
