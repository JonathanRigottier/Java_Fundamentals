package classTasks;

import java.util.Scanner;

public class AverageGradeArray {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        float sum = 0f;

        System.out.println("Enter the required size of the array : ");
        int arraySize = scanner.nextInt();
        float storageArray[] = new float[arraySize];

        System.out.println("Enter the elements of the array one by one");

        for (int i = 0; i < arraySize ; i++){
            System.out.println("Please enter grade number: " + (i+1));
            storageArray[i] = scanner.nextFloat();
            sum += storageArray[i];
        }

        System.out.println("Average grade : " + (sum/arraySize));
        System.out.println("There was passed " + arraySize + " values");

    }
}
