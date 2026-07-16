package Task7;

import java.util.Scanner;

public class Main {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the number of computers.");
        int numb = input.nextInt();
        String[] arrayComputerModel = new String[numb];
        int[] arrayComputeCores = new int[numb];

        for (int i = 0; i < numb; i++) {
            System.out.println("Enter the Computer's Model");
            String model = input.next();
            arrayComputerModel[i] = model;
            System.out.println("Enter the Computer's Cores");
            int cores = input.nextInt();
            arrayComputeCores[i] = cores;
        }
      
        for (int i = 0; i < numb; i++) {
            Computer.Processor processor = new Computer.Processor();
            processor.setModel(arrayComputerModel[i]);
            processor.setCores(arrayComputeCores[i]);
            processor.printInfo();
        }
    }
}
