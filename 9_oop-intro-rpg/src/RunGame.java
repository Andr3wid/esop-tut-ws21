import java.util.Scanner;

public class RunGame {
    public static void main(String[] args) {

        RPGCharacter char1 = new RPGCharacter("Almighty Carl", 30, 5, 1);
        char1.setName("Bob the Builder");

        RPGCharacter char2 = new RPGCharacter("Dangerous Larry", 20, 7, 2);

        Scanner sc = new Scanner(System.in);

        RPGCharacter winner = null;
        RPGCharacter loser = null;

        int turnCounter = 0;
        int menuChoice;
        while(char1.getHp() > 0 && char2.getHp() > 0) {
            System.out.println("+++ STATS +++");
            char1.printCharacterStats();
            char2.printCharacterStats();

            System.out.println("+++ TURN ACTIONS +++");
            System.out.println("1 ..... attack");
            System.out.println("2 ..... heal");

            if(turnCounter % 2 == 0) {
                System.out.println(char1.getName() + "'s turn");
                menuChoice = sc.nextInt();

                switch(menuChoice) {
                    case 1:
                        System.out.println("Attacking " + char2.getName());
                        char1.attack(char2);
                        break;
                    case 2:
                        System.out.println(char1.getName() + " is healing himself");
                        char1.heal(char1.getDp());
                        break;
                    default:
                        System.out.println("Invalid input - skipping turn");
                }
            } else {
                System.out.println(char2.getName() + "'s turn");
                menuChoice = sc.nextInt();

                switch(menuChoice) {
                    case 1:
                        System.out.println("Attacking " + char1.getName());
                        char2.attack(char1);
                        break;
                    case 2:
                        System.out.println(char2.getName() + " is healing himself");
                        char2.heal(char2.getDp());
                        break;
                    default:
                        System.out.println("Invalid input - skipping turn");
                }
            }

            turnCounter++;

            if(char1.getHp() <= 0) {
                // character 2 won
                winner = char2;
                loser = char1;
            }

            if(char2.getHp() <= 0) {
                // character 1 won
                winner = char1;
                loser = char2;
            }
        }

        RPGCharacter.resetAllCharacters();

        System.out.println(winner.getName() + " won!");
    }
}
