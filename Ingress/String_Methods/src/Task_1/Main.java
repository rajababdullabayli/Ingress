package Task_1;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter The Name: ");
        String name = scanner.next();
        System.out.println("Enter The Age: ");
        int age = scanner.nextInt();
        Main main = new Main();
    }
    public void printUserInfo(String name, int age) {
        System.out.println("Hello, My name is " + name);
        System.out.println("I am " + age + " years old");
    }
}