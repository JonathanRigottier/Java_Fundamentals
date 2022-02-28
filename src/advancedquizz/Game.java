package advancedquizz;

import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Game {

    // For storing all the question in one ArrayList
    private static ArrayList<Question> questions = new ArrayList<Question>();
    private static Scanner scanner = new Scanner(System.in);
    private static int choice;
    private static int numberOfAnswers;

    public static void main(String[] args) throws IOException {

        start();
        init();
        loop();
        addQuestion();

    }

    //Start of the game
    private static void start(){
        System.out.println("Please enter which quiz would like to play : ");
        System.out.println("Type '1' for a quiz about capital's of a country -->");
        System.out.println("Type '2' for a quiz about a country's population size -->");
        System.out.println("Type '3' for a quiz about a city's population size -->");
    }

    //Initialize game
    private static void init() {

        choice = scanner.nextInt();
        //Fix
        scanner.nextLine();

        BufferedReader br = null;
        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data" + choice + ".txt"));
            br = new BufferedReader(new FileReader("Quiz\\data" + choice + ".txt"));
            numberOfAnswers = Integer.parseInt(br.readLine());

            if (numberOfAnswers == 3) {
                for (int i = 1; i < lines.size(); i += 4) {
                    Question q;
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                    questions.add(q);
                }
            } else if (numberOfAnswers == 4) {
                for (int i = 1; i < lines.size(); i += 5) {
                    Question q;
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
                    questions.add(q);
                }
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.out.println(-1);
        }
    }

    //Add a question in the quiz
    private static void addQuestion() throws IOException {

        char answer;
        String data;
        do {
            System.out.println("Would you like to add a question to the quiz : y/n ");
            answer = scanner.next().charAt(0);
            scanner.nextLine();

        } while (answer != 'y' && answer != 'n');


        if(answer == 'y'){

            System.out.println("Add your new question :");
            String newQuestion = scanner.nextLine();

            FileOutputStream out = new FileOutputStream("Quiz\\data" + choice + ".txt", true);
            out.write('\n');
            for(char ch: newQuestion.toCharArray()){
                out.write(ch);
            }

            for (int i = 0; i < numberOfAnswers; i++) {
                System.out.println("Add your new answer here : ");
                String possibleAnswer = scanner.nextLine();

                //FileOutputStream out = new FileOutputStream("Quiz\\data" + choice + ".txt", true);

                out.write('\n');
                for(char ch: possibleAnswer.toCharArray()){
                    out.write(ch);
                }
            }

        }else{

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
