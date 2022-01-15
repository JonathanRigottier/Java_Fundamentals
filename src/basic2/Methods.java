package basic2;

public class Methods {
    public static void main(String[] args) {

        printPersonInfo("John", 1984);
        printPersonInfo("Sarah",1990);

        String[] names = new String[]{"Karlis", "Tom", "Bob" };
        System.out.println(getFirstInLine(names));

        multi(40, 7);
        multi(5, 7);
        System.out.println(divide(21,7));


    }

    static void printPersonInfo(String name, int birthYear) {

        int age;
        age = 2021 - birthYear;

        System.out.println("Your name is " + name + " and you are " + age + " years old.");
    }

    static String getFirstInLine(String[] namesList) {
        return namesList[1];
    }

    static void multi(int num1, int num2) {
        System.out.println(num1 + "*" + num2 + " = " + (num1 * num2));
    }

    static int divide(int num1, int num2){
        return num1 / num2;
    }
}

