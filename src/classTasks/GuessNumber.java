package classTasks;

import java.sql.SQLOutput;
import java.util.Scanner;

public class GuessNumber {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter max random number : ");
        int maxRandomRange = scanner.nextInt();

        System.out.println("How many tries ?");
        int guessCount = scanner.nextInt();

        int randomNumber = (int) (Math.random() * (maxRandomRange)) + 1;

        //DEV
        //System.out.println("Random = " + randomNumber);

        System.out.println("Guess the number : ");
        int guestNumber = scanner.nextInt();
        guessCount--;
        while(guestNumber != randomNumber && guessCount > 0){
            System.out.println("You have left " + guessCount + " tries");
            if(guestNumber<randomNumber){
                System.out.println("Try bigger number");
            }
            else {
                System.out.println("Try smaller number");
            }
            guestNumber = scanner.nextInt();
            guessCount--;
        }


        if(guestNumber == randomNumber){
            System.out.println("Congratulations you won !");
        }else{
            System.out.println("Sorry you lost the game");
            System.out.println("Random number was " + randomNumber);
        }

        }
}
