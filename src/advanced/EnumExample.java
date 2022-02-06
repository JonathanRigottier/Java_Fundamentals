package advanced;

enum Level{
    LOW,
    MEDIUM,
    HIGH
}



public class EnumExample {
    public static void main(String[] args) {

        Level myLVL = Level.MEDIUM;

        switch (myLVL){
            case LOW:
                System.out.println("Low level");
                break;
            case MEDIUM:
                System.out.println("Medium level");
                break;
            case HIGH:
                System.out.println("High level");
                break;
        }

    }
}
