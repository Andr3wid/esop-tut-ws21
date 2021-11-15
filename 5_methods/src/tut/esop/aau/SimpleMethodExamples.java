package tut.esop.aau;

public class SimpleMethodExamples {

    // simple method - no parameters - no return value
    static void simpleMethod() {
        System.out.println("Simple method got called");
    }

    // simple method - two parameters - no return value
    static void methodWithParams(String name, int age) {
        System.out.println("-------------------------");
        System.out.println("Hello your name is: " + name);
        System.out.println("The entered age is: " + age);
        System.out.println("-------------------------");
    }

    // simple method - two parameters - int return value
    static int methodWithReturnValue(int a, int b) {
        int result = a * b;
        return result; // needs to match the specified return type
    }

    // method that changes value of a primitive type
    // "call by value"
    static void changeValueOfPrimitives(int a, boolean b) {
        a = 100;
        b = false;
        System.out.println("=== INSIDE METHOD ===");
        System.out.println("a=" + a + " | b=" + b);
    }

    // method that changes a complex data type or array
    // "call by reference"
    static void changeFirstArrayValue(int[] arr) {
        if(arr.length > 0) {
            arr[0] = -1;
        }
    }

    public static void main(String[] args) {
        simpleMethod();

        methodWithParams("Hugo", 20);
        methodWithParams("Susi", 30);

        int areaOfRectangle = methodWithReturnValue(10, 20);
        System.out.println("The result of the calculation was: " + areaOfRectangle);

        int outerA = 3;
        boolean outerB = true;
        changeValueOfPrimitives(outerA, outerB);
        System.out.println("=== AFTER METHOD ===");
        System.out.println("outerA=" + outerA + " | outerB=" + outerB);

        int[] outerArray = {100, 200, 300, 400};
        changeFirstArrayValue(outerArray);
        System.out.println("=== AFTER METHOD ===");
        System.out.println("First index: " + outerArray[0]);
    }
}
