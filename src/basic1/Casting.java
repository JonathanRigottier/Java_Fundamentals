package basic1;

public class Casting {
    public static void main(String[] args) {
        //CONVERSION
        int age = 30;

        double preciseAge = age;
        preciseAge += 0.5d;
        System.out.println(preciseAge);

        //CASTING

        float temperature = 24.4f;

        byte newTemp = (byte) temperature;
        System.out.println(newTemp);
    }
}
