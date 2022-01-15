package basic2;

import java.util.Scanner;

public class WhileLoop {
    public static void main(String[] args) {


        int i = 5;
        while (i < 10){
            //System.out.println("Hello World!");
            i++;
        }

        Scanner scanner = new Scanner(System.in);
        char input = 'y';
        while (input == 'y'){
            System.out.println("Hello World");
            System.out.println("Do you want to run again? (y/n)");

            input = scanner.next().charAt(0);
        }

        //Do while loop
        int a = 13;

        do {
            System.out.println("Hello World!");
            a++;
        } while (a < 15);
    }
}
