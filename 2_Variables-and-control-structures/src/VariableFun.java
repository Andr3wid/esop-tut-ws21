import java.util.Scanner;

public class VariableFun {
    public static void main(String[] args) {
        int a;
        a = 5;

        int b;
        b = 10;

        int area;
        int perimeter;

        area = a*b;
        perimeter = a+a+b+b;

        System.out.println("Area: " + area);
        System.out.println("Perimeter: " + perimeter);

        // saving "text" in variables
        String myText = "Hello esop";
        System.out.println(myText);

        // floating point values
        double pi = 3.141592654;
        double r = 4.3;

        double circle_area = r*r*pi;
        System.out.println("Circle area: " + circle_area);

        // boolean - truth values
        boolean itIsSunny = false;
        boolean itIsRainy = true;

        // some calculation examples
        int sum = a+b;
        int sub = a-b;
        int div = a/b;
        int mul = a*b;
        int mod = 10%3;

        System.out.println("Remainder: " + mod);

        Scanner scanner = new Scanner(System.in);
        int userInput = scanner.nextInt();

        System.out.println(userInput);

    }
}