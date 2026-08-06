import java.util.Scanner;
public class Task_5 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the size: ");
        int size = input.nextInt();
        int[] array = new int[size];
        int countPositive = 0;
        int countNegative = 0;
        int countZero = 0;
        System.out.println("Enter the numbers");
        for(int i=0;i<size;i++){
            array[i] = input.nextInt();
            if (array[i]==0){
                countZero+=1;
            }
            else if (array[i]>0){
                countPositive+=1;
            }
            else{
                countNegative+=1;
            }
        }
        System.out.println("Positive: "+countPositive);
        System.out.println("Negative: "+countNegative);
        System.out.println("Zero: "+countZero);
    }
}
