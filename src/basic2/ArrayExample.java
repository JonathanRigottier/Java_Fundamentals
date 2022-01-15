package basic2;

public class ArrayExample {
    public static void main(String[] args) {

        // Declare array that will have 3 elements of type String
        String[] childNames = new String[3];
        // Setting element value by reffering to element's index
        childNames[0] = "Ben";
        childNames[1] = "Tom";
        childNames[2] = "Bob";


        // Getting values for some elements
        System.out.println(childNames[0]);
        System.out.println(childNames[1]);
        System.out.println(childNames[2]);
        System.out.println("-----------");

        //Second way to declare array and give values
        String [] dreamCars = new String[]{"BMW", "Audi", "Opel", "Lada"};

        System.out.println(dreamCars[0]);
        System.out.println(dreamCars[1]);
        System.out.println(dreamCars[2]);
        System.out.println(dreamCars[3]);

        System.out.println("-----------");
        //int data type array

        int[] age = new int[4];

        age[0] = 5;
        age[3] = 10;
        age[1] = 14;
        age[2] = 3;

        System.out.println(age[0]);
        System.out.println(age[1]);
        System.out.println(age[2]);
        System.out.println(age[3]);

        System.out.println(age[0] + ", " + age[1] + ", " + age[2] + ", " + age[3] + ", ");

        //Getting the array size
        System.out.println(childNames.length);
        System.out.println(dreamCars.length);
        System.out.println(age.length);

        //Loog through all elements in array
        for(int i = 0; i < age.length; i++){
            System.out.println("Element with index " + i + " - " + age[i]);
        }
    }
}
