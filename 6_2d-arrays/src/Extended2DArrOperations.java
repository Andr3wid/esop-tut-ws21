import java.util.Scanner;

public class Extended2DArrOperations {

    static void print2DStringArray(String[][] array) {
        for(int i = 0; i < array.length; i++) {
            for(int j = 0; j < array[i].length; j++) {
                System.out.print(array[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {
        int[][] arr = {
                {1, 2, 3, 3},
                {4, 5, 6, 6},
                {7, 8, 9, 9},
                {7, 8, 9, 9},
        };

        System.out.println("Elements on diagonal: ");
        int diagonalSum = 0;
        for(int i = 0; i < arr.length; i++) {
            System.out.print(arr[i][i] + " ");
            diagonalSum = diagonalSum + arr[i][i];
        }
        System.out.println("\nSum: " + diagonalSum);

        System.out.println("Only print even rows: ");
        for(int i = 0; i < arr.length; i++) {
            if(i%2 == 0) {
                for(int j = 0; j < arr[i].length; j++) {
                    System.out.print(arr[i][j] + " ");
                }
                System.out.println();
            }
        }

        Scanner scanner = new Scanner(System.in);
        int numberOfRows;
        System.out.println("Please enter the amount of rows: ");
        numberOfRows = scanner.nextInt();

        String[][] starArray = new String[numberOfRows][numberOfRows];

        for(int i = 0; i < starArray.length; i++) {
            for(int j = 0; j < starArray[i].length; j++) {
                if(j <= i) {
                    starArray[i][j] = "*";
                } else {
                    starArray[i][j] = " ";
                }
            }
        }

        print2DStringArray(starArray);


    }
}
