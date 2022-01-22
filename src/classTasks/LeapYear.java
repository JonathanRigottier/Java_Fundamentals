package classTasks;

import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter any year :");
        int yearFromUser = scanner.nextInt();

        String textAnswer = determinLeapYear2(yearFromUser);

        System.out.println(textAnswer);

    }

    public static void determinLeapYear(int year){

        //The function && has priority over ||
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            System.out.println(year + " is a leap year.");
        } else {
            System.out.println(year + " is not a leap year.");
        }

    }

    public static String determinLeapYear2(int year){

        //The function && has priority over ||
        if((year % 4 == 0 && year % 100 != 0) || year % 400 == 0){
            return (year + " is a leap year.");
        } else {
            return (year + " is not a leap year.");
        }

    }

}


