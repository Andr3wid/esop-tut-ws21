package tut.esop.aau;

import java.util.Scanner;

public class MeasurementAnalyzer {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter the amount of measurement values: ");
        int arraySize = scanner.nextInt();

        int[] values = new int[arraySize];

        for (int i = 0; i < values.length; i++) {
            System.out.println("Please enter a value for index " + i + " : ");
            values[i] = scanner.nextInt();
        }

        int totalSum = 0;
        // calculate sum and average of the array
        for (int i = values.length-1; i >= 0; i--) {
            // totalSum = totalSum = values[i];
            totalSum += values[i];
        }

        System.out.println("The total sum of the array is: " + totalSum);

        float average = (float) totalSum / (float) values.length;
        System.out.println("The average of the array is: " + average);
    }
}
