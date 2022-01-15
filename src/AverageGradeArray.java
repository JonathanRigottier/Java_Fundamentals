import java.util.Scanner;

public class AverageGradeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of the array : ");
        int arraySize = scanner.nextInt();
        float storageArray[] = new float [arraySize];

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < arraySize ; i++){
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = scanner.nextFloat();

        }

        System.out.print("Average grade : ");

        float sum = 0;
        for ( int i = 0; i < arraySize; i++){
            sum += storageArray[i];

        }
        sum /= arraySize;
        System.out.print(sum);
        System.out.println();
        System.out.println("There was passed " + arraySize + " values");

    }
}
