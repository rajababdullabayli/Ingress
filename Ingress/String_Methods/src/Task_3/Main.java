package Task_3;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name");
        String name = scanner.next();
        Main main = new Main();
        String upperName = main.toUpperCase(name);
        System.out.println("Upper Name "+upperName );
    }
    public String toUpperCase(String name){
        return name.toUpperCase();
    }
}
