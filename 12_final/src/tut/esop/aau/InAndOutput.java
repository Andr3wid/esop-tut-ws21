package tut.esop.aau;

import java.util.Scanner;

public class InAndOutput {
    public static void main(String[] args) {
        System.out.println("Hello ESOP TUT!");

        Scanner myScanner = new Scanner(System.in);

        System.out.println("Enter some number: ");
        int userInput = myScanner.nextInt();

        System.out.println("Enter some other number: ");
        int userInput2 = myScanner.nextInt();

        int result = userInput + userInput2;
        String resultLine = "Result" + result;
        System.out.println(resultLine);

        boolean testBoolean = true;
        char myLetter = 'a';

        /*
            int - Ganzzahlen
            boolean - Wahrheitswerte
            float - Fliesskommazahlen
            double - groessere Fliesskommazahlen
            String - Texte
            char - einzelne Zeichen
         */
    }
}
