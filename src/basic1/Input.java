package basic1;

import java.util.Scanner;

public class Input {
    public static void main(String[] args) {

        //Declare input object
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter your name");
        String name = scanner.nextLine();
        System.out.println("Your name is - " + name);

        System.out.println("Enter your birth year");
        int birthYear = scanner.nextInt();
        System.out.println("Your birth year - " + birthYear);

        //Version 1
        System.out.println("Your name is - " + name + " and you are " + (2021-birthYear) + " years old");

        //Version 2
        int Age = 2021 - birthYear;
        String name1 = "Your name is " + name;
        String age1 = " and you are " + Age + " y.o.";
        System.out.println(name1 + age1);

        //Version 3
        int currentYear = 2021;
        int age = currentYear - birthYear;

        System.out.println("Your name is - " + name + " and you are " + age + " years old");

        //Version 4
        int myAge = 2021 - birthYear;
        System.out.println(myAge);
        System.out.println("Your name is - " + name + " and you are " +myAge + " years old" );

    }
}
