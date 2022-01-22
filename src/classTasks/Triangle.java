package classTasks;

public class Triangle {

    private double side1;
    private double side2;
    private double side3;

    public void setSide1(double side1) {
        this.side1 = side1;
    }

    public void setSide2(double side2) {
        this.side2 = side2;
    }

    public void setSize3(double side3) {
        this.side3 = side3;
    }

    public double getSide1() {
        return side1;
    }

    public double getSide2() {
        return side2;
    }

    public double getSide3() {
        return side3;
    }

    private boolean isValid(){
        if((side1 + side2 > side3) && (side1 + side3 > side2) && (side2 + side3 > side1)){
            return true;
        }else{
            return false;
        }
    }

    public void areaTriangle (){
            if(isValid()){
                double p = (side1 + side2 + side3) / 2;
                double areaTriangle = Math.sqrt(p*(p-side1)*(p-side2)*(p-side3));
                System.out.println(areaTriangle);
            }else{
                System.out.println("Triangle is not valid");

            }
    }
}
