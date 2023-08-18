package pokerito;

import java.util.Scanner;

public class Pokerito {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*
         * Explain the rules
         */

        System.out.println("Let's play Pokerito. Type anything when you're ready.");
        scanner.nextLine();
        System.out.println("It's like Poker, but a lot simpler.\n");
        System.out.println("There are two players, you and the computer.");
        System.out.println("The dealer will give each player one card.");
        System.out.println("Then, the dealer will draw five cards (the river)");
        System.out.println("The player with the most river matches wins!");
        System.out.println("If the matches are equal, everyone's a winner!\n");
        System.out.println("Ready? Type anything if you are.");
        scanner.nextLine();

        /*
         * Present the user with a card
         */

        String userAssignedCard = randomCard();
        String comAssignedCard = randomCard();
        System.out.println("\nHere's your card:");
        System.out.println(userAssignedCard);
        System.out.println("\nHere's the computer's card:");
        System.out.println(comAssignedCard);

        int yourMatches = 0;
        int computerMatches = 0;

        /*
         * Draw five cards
         */

        System.out.println("Now, the dealer will draw five cards. Press enter to continue\n");
        for (int i = 1; i <= 5; i++) {
            scanner.nextLine();
            String draw = randomCard();

            if (userAssignedCard.equals(draw)) {
                yourMatches++;
            }

            if (comAssignedCard.equals(draw)) {
                computerMatches++;
            }

            System.out.println("Card " + i + "\n");
            System.out.println(draw);
        }

        /*
         * Task 5 - Get the winner
         */

        System.out.println("Your number of matches: " + yourMatches);
        System.out.println("Computer number of matches " + computerMatches);

        if (yourMatches > computerMatches) {
            System.out.println(" You win!");
        } else if (yourMatches < computerMatches) {
            System.out.println("The computer wins!");
        } else {
            System.out.println("Everyone Wins!");
        }

        scanner.close();
    }

    /*
     * Function randomCard()
     */

    public static String randomCard() {
        double randomNumber = Math.random() * 13;
        randomNumber += 1;

        switch ((int) randomNumber) {
            case 1:
                return "   _____\n" +
                        "  |A _  |\n" +
                        "  | ( ) |\n" +
                        "  |(_'_)|\n" +
                        "  |  |  |\n" +
                        "  |____V|\n";
            case 2:
                return "   _____\n" +
                        "  |2    |\n" +
                        "  |  o  |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____Z|\n";

            case 3:
                return "   _____\n" +
                        "  |3    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  |  o  |\n" +
                        "  |____E|\n";

            case 4:
                return "   _____\n" +
                        "  |4    |\n" +
                        "  | o o |\n" +
                        "  |     |\n" +
                        "  | o o |\n" +
                        "  |____h|\n";

            case 5:
                return "   _____ \n" +
                        "  |5    |\n" +
                        "  | o o |\n" +
                        "  |  o  |\n" +
                        "  | o o |\n" +
                        "  |____S|\n";

            case 6:
                return "   _____ \n" +
                        "  |6    |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  | o o |\n" +
                        "  |____6|\n";

            case 7:
                return "   _____ \n" +
                        "  |7    |\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |____7|\n";

            case 8:
                return "   _____ \n" +
                        "  |8    |\n" +
                        "  |o o o|\n" +
                        "  | o o |\n" +
                        "  |o o o|\n" +
                        "  |____8|\n";
            case 9:
                return "   _____ \n" +
                        "  |9    |\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |____9|\n";

            case 10:
                return "   _____ \n" +
                        "  |10  o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |o o o|\n" +
                        "  |___10|\n";
            case 11:
                return "   _____\n" +
                        "  |J  ww|\n" +
                        "  | o {)|\n" +
                        "  |o o% |\n" +
                        "  | | % |\n" +
                        "  |__%%[|\n";
            case 12:
                return "   _____\n" +
                        "  |Q  ww|\n" +
                        "  | o {(|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%O|\n";
            case 13:
                return "   _____\n" +
                        "  |K  WW|\n" +
                        "  | o {)|\n" +
                        "  |o o%%|\n" +
                        "  | |%%%|\n" +
                        "  |_%%%>|\n";
            default:
                return "This shouldn't get called.";
        }
    }

}
