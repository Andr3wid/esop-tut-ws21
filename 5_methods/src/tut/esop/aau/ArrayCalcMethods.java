package tut.esop.aau;

public class ArrayCalcMethods {
    static int getSumOfArray(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    static int getAverageOfArray(int[] arr) {
        int calculatedSum = getSumOfArray(arr);
        int average = calculatedSum / arr.length;
        return average;
    }

    static int[] createCopyOfArray(int[] arr) {
        int[] copyOfArr = new int[arr.length];

        for(int i = 0; i < arr.length; i++) {
            copyOfArr[i] = arr[i];
        }

        return copyOfArr;
    }

    static int[] multiplyArrayWithFactor(int[] arr, int factor, boolean inPlace) {

        if(inPlace) {
            for(int i = 0; i < arr.length; i++) {
                arr[i] = arr[i] * factor;
            }
            return arr;
        } else {
            int[] copiedArray = createCopyOfArray(arr);
            for(int i = 0; i < copiedArray.length; i++) {
                copiedArray[i] = copiedArray[i] * factor;
            }
            return copiedArray;
        }
    }

    static int[] multiplyArrayWithFactor(int[] arr) {
        return multiplyArrayWithFactor(arr, 2, true);
    }

    public static void main(String[] args) {
        int[] testArray1 = {10, 20, 30, 40};
        int averageOfArray1 = getAverageOfArray(testArray1);
        System.out.println("Average of array1: " + averageOfArray1);

        int[] testArray2 = {50, 50, 50, 50};
        int averageOfArray2 = getAverageOfArray(testArray2);
        int sumOfArray2 = getSumOfArray(testArray2);
        System.out.println("Average of array2: " + averageOfArray2);
        System.out.println("Sum of array2: " + sumOfArray2);

        int[] tripledValues = multiplyArrayWithFactor(testArray2, 3, false);
        multiplyArrayWithFactor(testArray2);

        System.out.println("=== PROGRAM END ===");
    }
}
