package tut.esop.aau;

public class Methods {
    static int calculateSumOfArray(int[] arr) {
        int sum = 0;

        for(int i = 0; i < arr.length; i++) {
            sum = sum + arr[i];
        }

        return sum;
    }

    static void increaseNumberByOne(int i) {
        i = i + 1;
        System.out.println("Value of i inside the function: " + i);
    }

    static void setFirstArrayEntryToZero(int[] arr) {
        arr[0] = 0;
    }

    public static void main(String[] args) {
        int[] testArray = {35, 10, 10};
        int[] testArray2 = {100, 100, 100};

        int sumOfTestArray = calculateSumOfArray(testArray);

        System.out.println("Sum of first array: " + sumOfTestArray);
        System.out.println("Sum of second array: " + calculateSumOfArray(testArray2));

        // call by value
        int num = 10;
        increaseNumberByOne(num);
        System.out.println("Value of i after the function call: " + num);

        // call by reference
        System.out.println("First value before function call: " + testArray[0]);
        setFirstArrayEntryToZero(testArray);
        System.out.println("First value after function call: " + testArray[0]);
    }
}
