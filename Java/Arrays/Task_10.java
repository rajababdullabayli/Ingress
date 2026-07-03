import java.util.Scanner;
public class Task_10 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers");
        int max=0;
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            if (max<array[i]){
                max=array[i];
            }
        }
        int min = array[0];
        for (int j=0;j<size;j++){
            if (min>array[j]){
                min=array[j];
            }
        }
        System.out.println("Total difference = "+(max-min));
    }
}
