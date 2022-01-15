package basic1;

public class IFExample {
    public static void main(String[] args) {

        //low temp < 36.4
        //Normal temp 36.4 - 36.8
        //high temp > 36.8

        float temp = 36.7f;
        if (temp < 36.4f || temp > 36.8f) {
            System.out.println("Sick");
        } else {
            System.out.println("Healthy");
        }
    }
}
