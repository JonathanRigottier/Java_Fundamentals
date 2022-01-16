import java.util.Scanner;

public class GreatestNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int listOfInteger[] = new int[3];
        int highestNumber = listOfInteger[0];

        for(int i = 0; i < 3; i++){
            System.out.println("Please enter number " + (i+1) +  " : ");
            listOfInteger[i] = scanner.nextInt();
            if (listOfInteger[i] > highestNumber){
                highestNumber = listOfInteger[i];
            }
        }

        System.out.println("The highest number is : " + highestNumber);

        //Solution 3 Math class
            int max = Math.max(listOfInteger[0],listOfInteger[1]);
            System.out.println(Math.max(max,listOfInteger[2]));

        //Solution 3 upgraded

            System.out.println(Math.max(Math.max(listOfInteger[0],listOfInteger[1]),listOfInteger[2]));

        /*Scanner scanner =  new Scanner(System.in);
        int num1,num2,num3;
        System.out.println("Please enter number 1");
        num1 = scanner.nextInt();
        System.out.println("Please enter number 2");
        num2 = scanner.nextInt();
        System.out.println("Please enter number 3");
        num3 = scanner.nextInt();

        //Solution 1
/*        if (num1 > num2) {
            if (num1 > num3){
                System.out.println("Max number: " + num1);
            } else {
                System.out.println("Max number: " + num3);
            }
        } else {
            if (num2 > num3){
                System.out.println("Max number: " + num2);
            } else {
                System.out.println("Max number: " + num3);
            }
        }*/


        //Solution 2

/*        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num1 && num2 > num3) {
            System.out.println(num2);
        }else if (num3 > num1 && num3 > num2) {
            System.out.println(num3);
        }*/

        // Solution 2 upgrade

/*        if (num1 > num2 && num1 > num3) {
            System.out.println(num1);
        } else if (num2 > num3) {
            System.out.println(num2);
        }else {
            System.out.println(num3);
        }*/

        //Solution 3 Math class
       /* int max = Math.max(num1,num2);
        System.out.println(Math.max(max,num3));

        // Solution 3 upgraded

        System.out.println(Math.max(Math.max(num1,num2),num3));
        */


    }
}

