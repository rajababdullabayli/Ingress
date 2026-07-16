package Task13;

import java.util.Scanner;

public class Main {
    static int sum(int numb){
            if(numb<=1) {
                return numb;
            }
            return numb+sum(numb-1);
        }

    static void main(String[] args) {
        Scanner input  =  new Scanner(System.in);
        System.out.println("Enter The Number");
        int numb = input.nextInt();
        System.out.println(sum(numb));
        }
    }
