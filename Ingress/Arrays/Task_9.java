import java.util.Scanner;
public class Task_9 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
        }
        for(int j=size-1;j>=0;j--){
            System.out.print(array[j]+" ");
        }
    }
}
