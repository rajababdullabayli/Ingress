import java.util.Scanner;
public class Task_3 {
    public static void main (String[] args) {
        Scanner input =new Scanner(System.in);
        System.out.println("Enter the width of the rectangle: ");
        double width= input.nextDouble();
        System.out.println("Enter the length of the rectangle: ");
        double length = input.nextDouble();
        double area = width * length;
        double perimeter = (width+length)*2;
        System.out.println("Area " + area);
        System.out.println("Perimeter " + perimeter);
    }
}

