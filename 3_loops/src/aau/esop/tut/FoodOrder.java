package aau.esop.tut;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("=== OUR MENU ===");
        System.out.println("Burger ..... b");
        System.out.println("Pizza ...... p");
        System.out.println("Salad ...... s");
        System.out.println("Fries ...... f");

        String choice = "";

        while(!choice.equals("s") && !choice.equals("f") && !choice.equals("p") && !choice.equals("b")) {
            System.out.print("Please enter your choice: ");
            choice = ourScanner.nextLine();
        }

        switch(choice) {
            case "b":
                System.out.println("You ordered a juicy burger!");
                break;

            case "p":
                System.out.println("Crispy pizza is on its way.");
                break;

            case "s":
                System.out.println("Fresh salad ahead!");
                break;

            case "f":
                System.out.println("Hot fries comin' in!");
                break;
        }

    }
}
