/*
It should display a menu like this and wait for user input:  showMenu()
1. Add an expense
2. List all expenses
3. Calculate total expenses
4. Calculate average expense
5. Exit

Add an expense
This should read user's input - an amount and stores it.

List all expenses
Displays the list of expenses input

Calculate total expenses
Sum all the expenses and display to the user

Calculate average expense
Average out the expense and display to the user

Exit
Exit the program

Concepts you will need:
- while loop
- ArrayList
- console().readLine()
- for/enhanced for loop
-  methods 
 */

package activity4;

import java.util.ArrayList;
import java.util.Scanner;

public class ExpenseApp {
    public static void main(String[] args) {

        ArrayList<Double> expenseList = new ArrayList<>();
        boolean isRunning = true;
        boolean introIsRunning = false;
        Scanner scanner = new Scanner(System.in);

        introGreet(scanner, introIsRunning);
        while (isRunning) {
            showMenu(scanner);
            int userChoice = scanner.nextInt();

            switch (userChoice) {
                case 1 -> addExpense(expenseList, scanner);
                case 2 -> showExpenses(expenseList);
                case 3 -> calcTotalExpense(expenseList);
                case 4 -> calcAvgExpense(expenseList);
                case 5 -> {
                    System.out.println("You have chosen to exit.");
                    isRunning = false;
                }
                default -> System.out.println("⛔️ You have selected an invalid choice!");
            }
        }
        scanner.close();
    }

    // introGreet()
    public static void introGreet(Scanner scanner, boolean introIsRunning) {
        do {
            System.out.println("Greetings Stranger!");
            System.out.println("How can we address you?");
            String userName = scanner.nextLine().toUpperCase().trim();
            if (userName.isEmpty()) {
                System.out.println();
                System.out.println("Invalid Entry, Please Try Again!");
                introIsRunning = true;

            } else {
                System.out.println();
                System.out.println("Greetings **" + userName + "**. Welcome to Expense Tracker 😀");
                break;
            }

        } while (introIsRunning);

    }

    // showMenu()
    public static void showMenu(Scanner scanner) {
        System.out.println();
        System.out.println("EXPENSE TRACKER APPLICATION MENU");
        System.out.println("1. Add Expense");
        System.out.println("2. Show Expenses");
        System.out.println("3. Calculate Total Expense");
        System.out.println("4. Calculate Average Expense");
        System.out.println("5. Exit");

    }

    // AddExpense()
    public static void addExpense(ArrayList<Double> expenseList, Scanner scanner) {
        System.out.println();
        System.out.println("Enter expense amount");
        Double expense = scanner.nextDouble();
        expenseList.add(expense);
        System.out.println("Added $" + expense + " as expense.");

    }

    // showExpenses()
    public static void showExpenses(ArrayList<Double> expenseList) {
        System.out.println();
        System.out.println("Listing All Expenses");
        int index = 1;
        for (double expense : expenseList) {
            System.out.println(index + ". $ " + expense);
            index++;
        }
    }

    // calcTotalExpense()
    public static void calcTotalExpense(ArrayList<Double> expenseList) {
        double totalExpense = 0;
        for (double exp : expenseList) {
            totalExpense += exp;
        }
        System.out.println();
        System.out.println("Total Sum of Expenses = $ " + totalExpense);
    }

    // calcAvgExpense()
    public static void calcAvgExpense(ArrayList<Double> expenseList) {
        double totalExpense = 0;
        for (double exp : expenseList) {
            totalExpense += exp;
        }
        double averageExpense = totalExpense / expenseList.size();
        System.out.println();
        System.out.println("Average Expense = $ " + averageExpense);
    }

}
