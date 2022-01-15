package basic1;

public class Conditions {
    public static void main(String[] args) {

        //IF STATEMENT
        boolean birthday = false;

        if (!birthday) {
            System.out.println("Not Happy Birthday!");
        }
        System.out.println("Hello");

        float temp = 36.7f;
        if (temp > 36.7f) {
            System.out.println("Sick");
        }

        //IF ELSE
        if (temp > 36.7f) {
            System.out.println("Sick");
        } else {
            System.out.println("Healthy");
        }


        //IF... ELSE IF... ELSE
        if (temp > 36.7f) {
            System.out.println("Sick1");
        } else if (temp < 36.5f) {
            System.out.println("Sick2");
        } else {
            System.out.println("Healthy");
        }

        // Multi else if

        //low temp < 36.4
        //ok temp 36.4 - 36.5
        //Normal temp == 36.6
        //high temp > 36.6

        temp = 36.400f;

        if(temp  < 36.4f){
            System.out.println("Low temp");
        } else if(temp >= 36.4f && temp <= 36.5f){
            System.out.println("Ok temp");
        } else if (temp == 36.6f){
            System.out.println("Normal");
        } else {
            System.out.println("High temp");
        }

        // 0-2 - baby
        // 3 - 10 - kid
        // 11 - 17 - teen
        // 18 - 18
        // 19 - 120 - adult

        int age = 121;

        if(age >= 0 && age <= 2){
            System.out.println("baby");
        } else if (age >= 3 && age <= 10){
            System.out.println("kid");
        } else if (age >= 11 && age <= 17){
            System.out.println("teen");
        } else if (age == 18){
            System.out.println("18");
        } else if (age > 1 && age <=120){
            System.out.println("adult");
        } else if(age < 0 || age > 120){
            System.out.println("Not in the range");
        }
    }
}
