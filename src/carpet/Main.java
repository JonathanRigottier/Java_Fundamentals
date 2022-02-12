package carpet;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter floor size :");
        System.out.println("Enter floor length :");
        double length = scanner.nextDouble();

        System.out.println("Enter floor width");
        double width = scanner.nextDouble();

        //Creating of floor object
        Floor floor = new Floor(length, width);

        System.out.println("Enter carpet price");
        double cost = scanner.nextDouble();

        //Creating carpet object
        Carpet carpet = new Carpet(cost);

        Calculator calculator = new Calculator(floor, carpet);
        System.out.println("Carpet will cost : " + calculator.getTotalCost());

    }
}
