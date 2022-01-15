package basic2;

import java.sql.SQLOutput;

public class CallCarCLass {
    public static void main(String[] args) {

    //Create new object
    Car car1 = new Car();

    //Assign values to object fields
    //car1.brand = "Volvo";
    car1.setBrand("Volvo");
    car1.color = "Black";
    car1.maxSpeed = 240;

    //Access object values
    System.out.println(car1.getBrand());

    Car car2 = new Car();
    car2.color = "Red";
    car2.maxSpeed = 255;
    //car2.brand = "BMW";
    car2.setBrand("BMW");

    car2.printInfo();
    car1.printInfo();


    //Test 2


    }
}
