package aau.esop.tut;

import java.util.Random;
import java.util.Scanner;

public class GuessingGame {
    public static void main(String[] args) {
        Random random = new Random();

        int magicNumber = random.nextInt(0, 10);

        Scanner scanner = new Scanner(System.in);

        int maxAttempts = 5;
        int currentAttempts = 0;
        int guessedNumber;

        while(currentAttempts < maxAttempts) {
            System.out.println("Please guess the number: ");
            guessedNumber = scanner.nextInt();

            if(guessedNumber == magicNumber) {
                System.out.println("CONGRATS! You have won. " + magicNumber + " was the right number.");
                break;
            } else if(guessedNumber == magicNumber - 1 || guessedNumber == magicNumber + 1) {
                System.out.println("Close call, you almost got it! :)");
            } else {
                System.out.println("Please try again.");
            }
            currentAttempts++;
        }

        if(currentAttempts >= maxAttempts) {
            System.out.println("You have lost this time - but you should definitely try again! :-)");
            System.out.println("The correct number would have been: " + magicNumber);
        }
    }
}
