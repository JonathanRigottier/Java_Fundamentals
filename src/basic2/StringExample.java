package basic2;

import java.util.Locale;
import java.util.Scanner;

public class StringExample {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);


        String name = scanner.nextLine().toUpperCase();
        String lastName = new String("Zars");

        String fullName = name + lastName;
        System.out.println(fullName);

        String fullName2 = name.concat(lastName);
        System.out.println(fullName2);

        //Compare String values
        System.out.println(name.equals(lastName));

        //String length
        System.out.println(lastName.length());

        //Specific symbol
        System.out.println(lastName.charAt(3));

        //Uppercase or Lowercase
        System.out.println(name.toLowerCase());
        System.out.println(name.toUpperCase());

        //indexOf
        String testValue = "That is test value";
        System.out.println(testValue.indexOf("test"));

        //Replace
        String textTest = "This car is sitt. Your shop is also sitt. This is river perse.";
        System.out.println(textTest.replaceAll("sitt","s**t").replaceAll("perse","p***e"));

        //Substrings
        System.out.println(textTest.substring(5));

        //Substring with ending
        System.out.println(textTest.substring(5,8));




    }

}
