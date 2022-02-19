package RockPaperScissors;

import java.util.Scanner;

public class RockPaperScissors {

    //Fields
    private String inputPlayer1;
    private String inputPlayer2;

    //Method
    public void rockPaperScissors (){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Choice of player 1 - rock, paper or scissors : ");
        String inputPlayer1 = scanner.nextLine().toLowerCase();

        while (!inputPlayer1.equals("rock") && !inputPlayer1.equals("paper") && !inputPlayer1.equals("scissors")){
            System.out.println("Player 1, please choose only from rock, paper or scissors : ");
            inputPlayer1 = scanner.nextLine().toLowerCase();
        }

        System.out.println("Choice of player 2 - rock, paper or scissors : ");
        String inputPlayer2 = scanner.nextLine().toLowerCase();

        while (!inputPlayer2.equals("rock") && !inputPlayer2.equals("paper") && !inputPlayer2.equals("scissors")){
            System.out.println("Player 2, please choose only from rock, paper or scissors : ");
            inputPlayer2 = scanner.nextLine().toLowerCase();
        }

        System.out.println("The result is : ");

        if(inputPlayer1.equals("rock")){
            if(inputPlayer2.equals("rock")){
                System.out.println("Tie");
            }
            if(inputPlayer2.equals("paper")){
                System.out.println("Player 2 wins");
            }
            if(inputPlayer2.equals("scissors")){
                System.out.println("Player 1 wins");
            }
        }

        if(inputPlayer1.equals("paper")){
            if(inputPlayer2.equals("rock")){
                System.out.println("Player 1 wins");
            }
            if(inputPlayer2.equals("paper")){
                System.out.println("Tie");
            }
            if(inputPlayer2.equals("scissors")){
                System.out.println("Player 2 wins");
            }
        }

        if(inputPlayer1.equals("scissors")){
            if(inputPlayer2.equals("rock")){
                System.out.println("Player 2 wins");
            }
            if(inputPlayer2.equals("paper")){
                System.out.println("Player 1 wins");
            }
            if(inputPlayer2.equals("scissors")){
                System.out.println("Tie");
            }
        }
    }

}
