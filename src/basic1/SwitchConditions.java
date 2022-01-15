package basic1;

public class SwitchConditions {
    public static void main(String[] args) {

        //0 - test0
        //1 - test1
        //2 - test2
        //3 - test3
        //4 - test4
        //5 - test5

        int age = 5;

        switch (age) {
            case 0:
                System.out.println("test0");
            break;
            case 1:
                System.out.println("test1");
            break;
            case 2:
                System.out.println("test2");
            break;
            case 3:
                System.out.println("test3");
            break;
            case 4:
                System.out.println("test4");
            break;
            case 5:
                System.out.println("test5");
            break;
            default:
                System.out.println("Wrong");
            break;
        }


    }
}
