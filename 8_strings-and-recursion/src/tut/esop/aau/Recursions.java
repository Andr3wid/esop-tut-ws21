package tut.esop.aau;

public class Recursions {

    /*
        static [DATATYPE] myRecursion(...) {
            if() {
                // 'recursion step'
                // 1. calculations / manipulations
                // 2. call to itself happens here
            } else {
                // 'base case'
                // does not call itself here!
                // ends the recursion
            }
        }
     */

    static void countDownIterative(int start) {
        for(int i = start; i >= 0; i--) {
            System.out.println(i);
        }
    }

    static void countDownRecursive(int start) {
        if(start >= 0) {
            System.out.println(start);
            countDownRecursive(start - 1); // IMPORTANT! parameter needs to change!
        } else {
            System.out.println("Recursion end");
        }
    }

    // n! = n * (n-1) * (n-2) ... * 1
    // 3*2*1 = 6
    // 5*4*3*2*1 = 120
    static int factorial(int n) {
        if(n > 1) {
            return n * factorial(n - 1);
        } else {
            return 1;
        }
    }

    static int fib(int n) {
        if(n > 1) {
            return fib(n-1) + fib(n - 2);
        } else {
            return n;
        }
    }

    static String reverseStringRecursive(String str) {
        if(! str.isEmpty()) {
            return reverseStringRecursive(str.substring(1)) + str.charAt(0);
        } else {
            return str;
        }
    }

    public static void main(String[] args) {
        int result = factorial(3);
        /*
            call-chain with factorial(3)
            initial: factorial(3) ---> 3 * factorial(2) WAITS FOR 2 --> factorial(1) --> 1
            factorial(3) --> 6 ---> FINAL RESULT
            factorial(2) --> 2
            factorial(1) --> 1
         */

        int fibResult = fib(6);

        System.out.println(fibResult);
        System.out.println("Reversed string: " + reverseStringRecursive("ESOP"));
    }


}
