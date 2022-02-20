package advancedquizz;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    // For storing all the question in one ArrayList
    private static ArrayList<Question> questions = new ArrayList<Question>();
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        init();
        loop();

    }

    //Initialize game
    private static void init(){

        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data1.txt"));

            for (int i = 0; i < lines.size(); i += 4){
                Question q;
                q = new Question(lines.get(i), lines.get(i+1), lines.get(i+2), lines.get(i+3));
                questions.add(q);
            }

        }catch (Exception e){
            System.out.println(e);
            System.out.println("Could not load file");
            System.out.println(-1);
        }

    }

    //Game play loop

    private static void loop(){

        int score = 0;

        while (questions.size() > 0){
            Question currentQuestion = questions.remove(0);

            //Printing question
            System.out.println(currentQuestion.text);

            //Printing all answers
            for (int i = 0; i < currentQuestion.answers.length; i++){
                System.out.println(i+1 + ") " + currentQuestion.answers[i]);
            }

            //Asking for right answer
            System.out.println("Answer :");
            int input = scanner.nextInt();

            //Validating input from user
            if(input < 0 || input > currentQuestion.answers.length){
                System.out.println("Input is invalid");
                System.exit(-2);
            }

            //Checking if answer is correct
            if(currentQuestion.rightAnswer.equals(currentQuestion.answers[input-1])){
                System.out.println("Right");
                score++;
            }else{
                System.out.println("Wrong");
            }

        }

        System.out.println("You got " + score + " questions right");

    }


}
