package activity2;

/*
 * 1. Determine if a number is divisible by 3, 5 or both.
 * 2. Given a sample budget, determine what to ride given the following conditions:
    - if budget is greater than 100, ride a taxi
    - if budget is between 50 to 100, ride train
    - if budget is between 20 to 49, ride bus
    - if budget is between 0 to 19, walk
 * 3. Use a switch case to determine the zodiac animal given a number from 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
 */

public class Assignment2 {
    public static void main(String args[]) {
        // Task 1. Determine if a number is divisible by 3, 5 or both.
        int numToTest = 995;
        boolean isDivisible;
        if (numToTest % 3 == 0) {
            isDivisible = true;
            System.out.println(numToTest + " is divisible by 3: " + isDivisible);
        } else if (numToTest % 5 == 0) {
            isDivisible = true;
            System.out.println(numToTest + " is divisible by 5: " + isDivisible);

        } else if (numToTest % 5 == 0 && numToTest % 3 == 0) {
            isDivisible = true;
            System.out.println(numToTest + " is divisible by 5 and 3: " + isDivisible);

        } else {
            isDivisible = false;
            System.out.println(numToTest + " is divisible by 5 and/or 3: " + isDivisible);
        }

        /*
         * Task 2. Given a sample budget, determine what to ride given the following
         * conditions:
         * - if budget is greater than 100, ride a taxi
         * - if budget is between 50 to 100, ride train
         * - if budget is between 20 to 49, ride bus
         * - if budget is between 0 to 19, walk
         * 
         * Reference: What is enum? https://www.w3schools.com/java/java_enums.asp
         */
        float budget = 72.7f;
        enum TransportMode {
            TAXI,
            TRAIN,
            BUS,
            WALK
        }

        if (budget > 100) {
            System.out.println(TransportMode.TAXI);
        } else if (budget < 100 && budget >= 50) {
            System.out.println(TransportMode.TRAIN);
        } else if (budget < 50 && budget >= 20) {
            System.out.println(TransportMode.BUS);
        } else {
            System.out.println(TransportMode.WALK);
        }

        /*
         * Task 3. Use a switch case to determine the zodiac animal given a number from
         * 1 to 12. (1 - rat, 2 - ox, 3 - tiger, etc.)
         * 
         * Code Challenge: Delcare and use enum for your zodiac
         * 
         */

        int animalNumber = 13;
        enum Zodiac {
            RABBIT, DRAGON, SNAKE, HORSE, GOAT, MONKEY, ROOSTER, DOG, PIG, RAT, OX, TIGER
        }

        switch (animalNumber) {
            case 1 -> System.out.println(Zodiac.RABBIT);
            case 2 -> System.out.println(Zodiac.DRAGON);
            case 3 -> System.out.println(Zodiac.SNAKE);
            case 4 -> System.out.println(Zodiac.HORSE);
            case 5 -> System.out.println(Zodiac.GOAT);
            case 6 -> System.out.println(Zodiac.MONKEY);
            case 7 -> System.out.println(Zodiac.ROOSTER);
            case 8 -> System.out.println(Zodiac.DOG);
            case 9 -> System.out.println(Zodiac.PIG);
            case 10 -> System.out.println(Zodiac.RAT);
            case 11 -> System.out.println(Zodiac.OX);
            case 12 -> System.out.println(Zodiac.TIGER);
            default -> System.out.println("You are not human, greetings my fellow Alien friend");
        }
    }
}
