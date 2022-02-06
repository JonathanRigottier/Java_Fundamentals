package advanced;

import org.w3c.dom.css.Rect;

class Rectangular {
    protected float length;
    protected float width;

    public void area() {
        System.out.println("Area : " + length * width);
    }

    public void perimeter() {
        System.out.println("Perimeter : " + (length + width) * 2);
    }

    public Rectangular(float lenght, float width) {
        this.width = width;
        this.length = lenght;
    }

}


class Square extends Rectangular {
    private float side;
    public Square(float side){
        super(side,side);
        this.side = side;
    }

    public float getSide(){
        return side;
    }

}


public class Geometry {
    public static void main(String[] args) {
        Rectangular rectangular = new Rectangular(10,20);
        rectangular.perimeter();
        rectangular.area();

        Square square = new Square(4);
        square.area();
        square.perimeter();
        System.out.println(square.getSide());
    }
}
