package tut.esop.aau;

public class Arrays {
    public static void main(String[] args) {
        int[] measurementValues = new int[10];

        int[] measurementValues2 = { 10, 20, 30, 40, 50 };

        System.out.println("First element: " + measurementValues2[0]);
        measurementValues2[0] = -100;
        System.out.println("First element after assignment: " + measurementValues2[0]);
        System.out.println("Length of array: " + measurementValues2.length);
        System.out.println("Last element: " + measurementValues2[measurementValues2.length - 1]);

        System.out.println("===ARRAY CONTENT===");
        for(int i = 0; i < measurementValues2.length; i++) {
            System.out.println("Index " + i + ": " + measurementValues2[i]);
        }

        int sum = 0;
        for(int i = 0; i < measurementValues2.length; i++) {
            sum = sum + measurementValues2[i];
        }
        System.out.println("SUM: " + sum);

        // find average password length
        int[] passwordLengths = {8, 17, 20};
        int sum2 = 0;
        for(int i = 0; i < passwordLengths.length; i++) {
            sum2 = sum2 + passwordLengths[i];
        }

        float averageLength = (float) sum2 / passwordLengths.length;
        System.out.println("Average password length: " + averageLength);
    }
}
