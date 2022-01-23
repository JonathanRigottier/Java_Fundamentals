package classTasks;

public class TriangleCall {
    public static void main(String[] args) {

        //Create object
        Triangle triangle1 = new Triangle();

        triangle1.setSide1(10.5d);
        triangle1.setSide2(12.0d);
        triangle1.setSize3(13.0d);

        System.out.println(triangle1.getSide1());
        System.out.println(triangle1.getSide2());
        System.out.println(triangle1.getSide3());

        System.out.println(triangle1.areaTriangle());


    }
}
