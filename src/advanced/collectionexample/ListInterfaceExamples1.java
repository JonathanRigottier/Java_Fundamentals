package advanced.collectionexample;

import java.util.ArrayList;

public class ListInterfaceExamples1 {
    public static void main(String[] args) {

        //ArrayList

        ArrayList<String> car = new ArrayList<String>();

        //Add values
        car.add("Volvo");
        car.add("Mercedes");
        car.add("BMW");
        car.add("Jeep");
        car.add("Opel");
        car.add("Opel");

        //Print values
        System.out.println(car);

        //Add elements at specific index
        car.add(2, "Ford");
        System.out.println(car);

        //Get element by index
        System.out.println(car.get(4));

        //Change elements value
        car.set(1,"Toyota");
        System.out.println(car);

        //Remove element by index
        car.remove(5);
        System.out.println(car);

        //Size
        System.out.println(car.size());

        //Delete all elements
        car.clear();
        System.out.println(car);

    }
}
