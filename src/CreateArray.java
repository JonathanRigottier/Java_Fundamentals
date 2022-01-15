import java.util.Scanner;

public class CreateArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter the required size of the array");
        int arraySize = scanner.nextInt();
        int storageArray[] = new int [arraySize];

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < arraySize ; i++){
            System.out.println("Please enter element number: " + (i+1));
            storageArray[i] = scanner.nextInt();

        }
        System.out.print("list number of Array is : ");
        for ( int i = 0; i < arraySize; i++){
            System.out.print(storageArray[i] + " ");
        }

        System.out.println();
        System.out.print("Sum of array is : ");

        int sum = 0;
        for ( int i = 0; i < arraySize; i++){
            sum += storageArray[i];

        }

        System.out.print(sum);


    }
}
