package activity3;

/* 
Write a program to do the following:
- Allow a user to enter a list of suspect names
- Print out the list of suspect names
- Allow the user to enter the suspects with alibis
- Print out the updated list of suspects
 - Find the suspect with the longest name
- Print out the suspect with the longest name 
*/

import java.util.ArrayList;
import java.util.Scanner;

public class SuspectAnalysis {
    public static void main(String[] args) {
        ArrayList<String> suspectList = new ArrayList<>();
        ArrayList<String> suspectAlibiList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Program Initiation
        System.out.println("Welcome to the CIA Database. What is your name?");
        String myName = scanner.nextLine().toUpperCase().trim();
        System.out.println("Thank you " + myName
                + ". We shall now proceed by accessing the Suspects Analysis Framework. Please enter suspect names for Analysis");
        System.out.println("Type 'exit' to exit the program. ❌");
        System.out.println("Type 'done' to exit suspect name input. ✅");

        // new line
        System.out.println("******************************");

        // Enter Suspect Names
        String suspectName;
        boolean exitLoop = false; // Flag to control loop termination
        do {
            suspectName = scanner.nextLine().toUpperCase().trim();
            if (suspectName.equalsIgnoreCase("exit")) {
                exitLoop = true;
                break;
            } else if (suspectName.equalsIgnoreCase("done")) {
                break;
            } else if (suspectList.contains(suspectName)) {
                System.out.println("You have already inserted this name, please try again!");
            } else if (suspectName.isEmpty()) {
                System.out.println("Invalid Entry, please try again!");
            } else {
                suspectList.add(suspectName);
                int suspectListLength = suspectList.size();
                System.out
                        .println("### Received Encryted Message -> " + suspectListLength + ". " + suspectName + " ###");
            }
        } while (true);

        // Check the flag before executing the code outside the loop
        // if flag is not true -> prints out and continue
        if (!exitLoop) {
            System.out.println("These are the suspects: ");
            // implementing a running number when printing out suspects name
            int index = 1;
            for (String suspect : suspectList) {
                System.out.println(index + ". " + suspect);
                index++;
            }
        }

        // new line
        System.out.println("******************************");

        // Enter Suspects with Alibi
        System.out.println("Stage 2 Analysis: Please insert names of suspects with alibis");
        System.out.println("Type 'exit' to exit the program. ❌");
        System.out.println("Type 'done' to exit suspect name input. ✅");

        // new line
        System.out.println("******************************");

        String suspectAlibi;
        do {
            suspectAlibi = scanner.nextLine().toUpperCase().trim();
            if (suspectAlibi.equalsIgnoreCase("exit")) {
                exitLoop = true;
                break;
            } else if (suspectAlibi.equalsIgnoreCase("done")) {
                break;
            } else if (suspectAlibiList.contains(suspectAlibi)) {
                System.out.println("You have already inserted this name, please try again!");
            } else if (suspectAlibi.isEmpty()) {
                System.out.println("Invalid Entry, please try again!");
            } else {
                suspectAlibiList.add(suspectAlibi);
                int suspectAlibiListLength = suspectAlibiList.size();
                System.out
                        .println("### Received Encryted Message -> " + suspectAlibiListLength + ". " + suspectAlibi
                                + " ###");
            }

        } while (true);

        if (!exitLoop) {
            System.out.println("These are the suspects with alibis");
            for (String alibi : suspectAlibiList) {
                int index = 1;
                System.out.println(index + ". " + alibi);
                index++;
            }
        }

        // new line
        System.out.println("******************************");

        // Analysis
        System.out.println("+++ ANALYSIS COMMENCING NOW +++");

        // new line
        System.out.println("******************************");

        // print suspect list
        System.out.println("These are the suspects before analysis");
        int index;
        for (String suspect : suspectList) {
            index = 1;
            System.out.println(index + ". " + suspect);
            index++;
        }
        // print alibi list
        System.out.println("These are the suspects with alibis");
        for (String alibi : suspectAlibiList) {
            index = 1;
            System.out.println(index + ". " + alibi);
            index++;
        }

        // new line
        System.out.println("******************************");

        // analysis completed
        System.out.println("+++ ANALYSIS COMPLETED +++");

        // new line
        System.out.println("******************************");

        suspectList.removeAll(suspectAlibiList);
        System.out.println("These are the suspects without alibis");
        for (String newList : suspectList) {
            index = 1;
            System.out.println(index + ". " + newList);
            index++;
        }
        System.out.println("This is the criminal mastermind");
        String criminalMastermind = "";
        for (String criminal : suspectList) {
            if (criminal.length() > criminalMastermind.length()) {
                criminalMastermind = criminal;
            }
        }
        System.out.println("The Criminal Mastermind is: " + criminalMastermind);

        // new line
        System.out.println("******************************");

        // Analysis
        System.out.println("+++ SHUTTING DOWN +++");

        // new line
        System.out.println("*************BYE**************");

        // close scanner
        scanner.close();

    }
}