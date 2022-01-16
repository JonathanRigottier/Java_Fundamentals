package basic2;

public class MathClass {
    public static void main(String[] args) {

        float num = 51.9f;

        //Max value
        System.out.println(Math.max(354,45));

        //Min value
        System.out.println(Math.min(45,76));

        //Rounding

        //Rounding up
        System.out.println(Math.ceil(num));

        //Rounding down
        System.out.println(Math.floor(num));

        //Rounding according to Math laws
        System.out.println(Math.round(num));

        //ABS Absolute number
        System.out.println(Math.abs(-100));

        //SQRT
        System.out.println(Math.sqrt(64));

        //Random
        System.out.println(Math.random());
        System.out.println((int) (Math.random() * 101));


    }
}
