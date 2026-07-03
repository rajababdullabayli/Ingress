import java.util.Scanner;
public class Task_3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            }
        int min = array[0];
        for (int j=0;j<size;j++){
            if (min>array[j]){
                min=array[j];
            }
        }
        System.out.println("This is Array's minimum number="+min);
    }
}
