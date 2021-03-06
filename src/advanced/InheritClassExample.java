package advanced;

class Parent{
    protected int num1;
    protected int num2;
    public Parent(int num1, int num2){
        this.num1 = num1;
        this.num2 = num2;
    }
    public void printInfo(){
        System.out.println("This is parent class");
    }
    public void printValues(){
        System.out.println(num1 + num2);
    }
}

class Child extends Parent{
    public Child (int num1, int num2){
        super(num1, num2);
    }

    public void printChildInfo(){
        System.out.println("This is child class");
    }
}

public class InheritClassExample {
    public static void main(String[] args) {

        Parent parent = new Parent(10,5);
        Child child = new Child(10,30);

        parent.printInfo();
        child.printInfo();
        child.printChildInfo();

        parent.printValues();
        child.printValues();
    }
}
