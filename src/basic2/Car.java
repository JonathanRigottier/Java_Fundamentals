package basic2;

public class Car {
    //Fields
    String color;
    int maxSpeed;
    private String brand;

    //Methods

    // Setter method
    public void setBrand (String brand){
        this.brand = brand;
    }

    // Getter method
    public String getBrand (){
        return brand;
    }

    // Info method
    public void printInfo(){
        System.out.println("Brand : " + brand);
        System.out.println("Max Speed : " + maxSpeed);
        System.out.println("Color : " + color);
    }

    //Test
}
git diff