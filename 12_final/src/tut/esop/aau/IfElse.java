package tut.esop.aau;

import java.util.Scanner;

public class IfElse {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Enter some number: ");
        int input = sc.nextInt();

        /*
            Other operators that are not used here:
                >=
                <=
         */
        if(input % 2 == 0 && input != 0 && input > 0) {
            System.out.println("You entered an even number!");
        } else if(input == 0 || input < 0) {
            System.out.println("You entered 0 or a negative number!");
        } else {
            System.out.println("The entered number was odd");
        }

    }
}
