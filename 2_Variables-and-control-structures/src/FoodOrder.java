import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {

        Scanner ourScanner = new Scanner(System.in);

        System.out.println("=== OUR MENU ===");
        System.out.println("Burger ..... b");
        System.out.println("Pizza ...... p");
        System.out.println("Salad ...... s");
        System.out.println("Fries ...... f");

        System.out.print("Please enter your choice: ");
        String choice = ourScanner.nextLine();

        /*
        if(choice.equals("b")) {
            System.out.println("You ordered a juicy burger!");
        } else if(choice.equals("p")) {
            System.out.println("Crispy pizza is on its way.");
        } else if(choice.equals("s")) {
            System.out.println("Fresh salad ahead!");
        } else if(choice.equals("f")) {
            System.out.println("Hot fries comin' in!");
        } else {
            System.out.println("Invalid choice! Please try again ...");
        }
        */

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

            default:
                System.out.println("Invalid choice! Please try again ...");
        }

    }
}
