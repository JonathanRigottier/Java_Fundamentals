package classTasks;

public class RectangularCall {
    public static void main(String[] args) {

        Rectangular shape1 = new Rectangular();
        //shape1.width = 4;
        //shape1.length = 2;

        shape1.setLength(2);
        shape1.setWidth(4);

        System.out.println(shape1.getLength());
        System.out.println(shape1.getWidth());

        shape1.area();
        shape1.perimeter();

    }
}
