package tut.esop.aau;

import java.util.Scanner;

public class ArrayIntro {
    public static void main(String[] args) {
        int[] arr1 = { 10, 18, 8, 789, 24, 123 };
        int[] arr2 = new int[3]; // filled with default values
        int[] emptyArray = new int[0];

        System.out.println(arr1[0]);
        arr1[0] = 101;
        System.out.println("First array element: " + arr1[0]);
        System.out.println("The length of the array: " + arr1.length);
        System.out.println("Last array element: " + arr1[arr1.length - 1]);

        // using a loop to iterate over the array
        for(int i = 0; i < arr1.length; i++) {
            System.out.println(i + " : " + arr1[i]);
        }

        Scanner scanner = new Scanner(System.in);

        System.out.println("Please enter a value for the first array item: ");
        arr1[0] = scanner.nextInt();

        System.out.println("The first array element now has the value: " + arr1[0]);
    }
}
