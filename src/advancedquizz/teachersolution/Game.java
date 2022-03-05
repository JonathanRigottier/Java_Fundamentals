package advancedquizz.teachersolution;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
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

        char again = 'y';
        char option = 'p';

        while (again == 'y') {
            System.out.println("Please choose quiz topic");
            System.out.println("1 - Capitals");
            System.out.println("2 - Countries population");
            System.out.println("3 - Cities population");
            System.out.println("Topic: ");
            int input = scanner.nextInt();
            //Fix
            //scanner.nextLine();

            System.out.println("Do you want to play (p) or add (a) new question?");
            scanner.nextLine();
            option = scanner.nextLine().charAt(0);

            if (option == 'p') {
                init(input);
                loop();
                System.out.println("Do you want to do something else? y/n");
                scanner.nextLine();
                again = scanner.nextLine().charAt(0);
            } else {
                addQuestion(input);
                System.out.println("Do you want to do something else? y/n");
                again = scanner.nextLine().charAt(0);
            }




        }

    }

    //Initialize game
    private static void init(int number) {

        try {
            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data" + number + ".txt"));

            //First lines value
            int temp = Integer.parseInt(lines.get(0));

            for (int i = 1; i < lines.size(); i += temp + 1) {
                Question q;

                if (temp == 3) {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3));
                } else {
                    q = new Question(lines.get(i), lines.get(i + 1), lines.get(i + 2), lines.get(i + 3), lines.get(i + 4));
                }

                questions.add(q);
            }


        } catch (Exception e) {
            System.out.println(e);
            System.out.println("Could not load file");
            System.exit(-1);
        }

    }

    //Game play loop

    private static void loop() {

        int score = 0;

        while (questions.size() > 0) {
            Question currentQuestion = questions.remove(0);

            //Printing question
            System.out.println(currentQuestion.text);

            //Printing all answers
            for (int i = 0; i < currentQuestion.answers.length; i++) {
                System.out.println(i + 1 + ") " + currentQuestion.answers[i]);
            }

            //Asking for right answer
            System.out.println("Answer :");
            int input = scanner.nextInt();

            //Validating input from user
            if (input < 0 || input > currentQuestion.answers.length) {
                System.out.println("Input is invalid");
                System.exit(-2);
            }

            //Checking if answer is correct
            if (currentQuestion.rightAnswer.equals(currentQuestion.answers[input - 1])) {
                System.out.println("Right");
                score++;
            } else {
                System.out.println("Wrong");
            }


        }

        System.out.println("You got " + score + " questions right");

    }


    //Adding question

    private static void addQuestion(int number) {

        Question q = new Question();

        System.out.println("Please enter question");
        String text = scanner.nextLine();
        //Adding Question text to question object field
        q.text = text;

        try {

            List<String> lines = Files.readAllLines(Paths.get("Quiz\\data" + number + ".txt"));
            String[] answers = new String[Integer.parseInt(lines.get(0))];

            System.out.println("INFO: Please notice that first answer should be the right one");
            for (int i = 0; i < answers.length; i++) {
                System.out.println("Please enter " + (i + 1) + ") answer");
                answers[i] = scanner.nextLine();
            }

            //Adding answers array to question object field
            q.answers = answers;

            //Writing info to quiz file

            File file = new File("Quiz\\data" + number + ".txt");
            FileWriter fr = new FileWriter(file, true);
            BufferedWriter br = new BufferedWriter(fr);

            br.write("\n" + q.text);
            for (int i = 0; i < q.answers.length; i++) {
                br.write("\n" + q.answers[i]);
            }

            br.close();
            fr.close();


        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
