package advanced;

public class ExceptionExample {
    public static void main(String[] args) {


        try {
           int[] num = {1,2,3,4};
            System.out.println(num[4]);
            int num1 = 5 / 0;
        }catch (ArithmeticException e){
            System.out.println(e);
        }catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Array problems");
        }catch (Exception e){
            System.out.println("Something else");
        } finally {
            System.out.println("In the finally block");
        }

    }
}
