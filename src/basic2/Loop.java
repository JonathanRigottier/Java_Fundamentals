package basic2;

import java.util.Scanner;

public class Loop {
    public static void main(String[] args) {

        //for loop

        for (int i = 0; i < 20; i++){
            //System.out.println(i);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter number please");
        int input = scanner.nextInt();

        for(int i = 1; i <= input; i++){
            System.out.print(i + " ");
        }
        System.out.println();

        System.out.println("Enter number please");
        int input2 = scanner.nextInt();

        for(int i = input2; i >= 0; i--){
            System.out.print(i + " ");
        }

    }
}
