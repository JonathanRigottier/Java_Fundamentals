package basic2;

public class BreakCon {
    public static void main(String[] args) {

        //Break
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
            if (i == 5) {
                    break;
            }
        }
        System.out.println("---------------");
        //CONTINUE

        for (int i = 0; i < 10; i++) {
            if (i == 8 || i == 5) {
                continue;
            }
            System.out.println(i);
        }
    }
}
