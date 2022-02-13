package HomeworkCheck;

import java.util.Scanner;

public class VehiculeCall {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter fuel amount in your vehicule :");
        float fuel = scanner.nextFloat();

        System.out.println("Enter your vehicle's fuel usage per 100 km :");
        float fuelUsage = scanner.nextFloat();

        System.out.println("Enter how many passengers will be in the vehicule :");
        int passengers = scanner.nextInt();

        char input = 'p';
        boolean airConditioner = false;

        do {
            System.out.println("Will you turn on air conditioner ? y/n");
            input = scanner.next().charAt(0);

        } while (input != 'y' && input != 'n');

        if(input == 'y'){
            airConditioner = true;
        }else if(input == 'n'){
            airConditioner = false;
        }

        /*System.out.println("Will you turn on air conditioner ? y/n");
        char input = scanner.next().charAt(0);
        boolean airConditioner = false;

        if(input == 'y'){
                airConditioner = true;
        }else if(input == 'n'){
                airConditioner = false;
        }else {
            System.out.println("Please enter y or n : ");
        }

         */




        Car car = new Car(fuel, fuelUsage, passengers, airConditioner);
        System.out.printf("Your vehicule can drive for a maximum of %.2f kilometers", car.maxDistance());

        //VehicleWithTeacher vehicule = new VehicleWithTeacher(fuel, fuelUsage, passengers);
        //System.out.printf("Your vehicule can drive for a maximum of %.2f kilometers", vehicule.maxDistance());



        /*
        String name = scanner.nextLine();
        System.out.printf("I have %d new things in my garage. My name is %s.", 10, name);



        float num = 45.6734f;
        System.out.printf("Rounding %.3f to 3 decimal places", num);
        */
    }

}
