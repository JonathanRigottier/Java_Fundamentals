package classTasks;

public class Rectangular {

    private float length;
    private float width;

    public void area(){
        System.out.println("Area: " + length * width);
    }

    public void perimeter(){
        System.out.println("Perimeter: " + (length+width)*2);
    }

    public void setLength(float length) {
        this.length = length;
    }

    public void setWidth(float width) {
        this.width = width;
    }

    public float getLength() {
        return length;
    }

    public float getWidth() {
        return width;
    }
}
