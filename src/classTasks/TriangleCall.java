package classTasks;

public class TriangleCall {
    public static void main(String[] args) {

        Triangle triangle1 = new Triangle();

        triangle1.setSide1(3.2d);
        triangle1.setSide2(4.5d);
        triangle1.setSize3(5.2d);

        System.out.println(triangle1.getSide1());
        System.out.println(triangle1.getSide2());
        System.out.println(triangle1.getSide3());

        triangle1.areaTriangle();


    }
}
