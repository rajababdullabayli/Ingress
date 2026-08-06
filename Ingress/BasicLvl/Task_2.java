import java.util.Scanner;
public class Task_2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter Celsius degree :");
        double tempC = input.nextDouble();
        double tempF;
        tempF = tempC * 9 / 5 + 32;
        System.out.println("Conversion to Fahrenheit :" + tempF);
    }
}
