package classTasks;

import java.util.Scanner;

public class ChristmasTree {
    public static void main(String[] args) {

        //Scanner to ask the input tree size
        Scanner scanner = new Scanner((System.in));
        System.out.println("Input tree size");

        int inputTreeSize = scanner.nextInt();

        //Creation of tree upper part

        for (int i = 1;i <= inputTreeSize;i++){

            //Creation of the loop for space for each line
            for (int j = 1;j <= (inputTreeSize - i);j++){
                System.out.print(" ");
            }

            //Creation of the loop for the number of star for each line
            for (int k = 1;k <= i*2-1;k++){
                System.out.print("*");
            }

            System.out.println();
        }

        //Creation of the base of the tree
        for (int l = 0;l < (inputTreeSize - 1);l++){
            System.out.print(" ");
        }
        System.out.print("#");
    }
}
