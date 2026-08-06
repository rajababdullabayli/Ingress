import java.util.Scanner;
public class Task_1 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int sum=0;
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            sum+=array[i];
        }
        System.out.println("This is Array's sum = "+sum);
    }
}
