// This is the lecturers code, he has used record and enum to habdle the display of expenses
// I am including this in the repository so that it can be used as reference.

package activity4;

import java.util.ArrayList;

// enum ExpenseType {
//   FOOD, TRANSPORT, ENTERTAINMENT, OTHERS
// }

// Attaching Values to Enum : https://www.baeldung.com/java-enum-values
enum ExpenseType {
  FOOD("🍔 Food"), TRANSPORT("🚗 Transport"), ENTERTAINMENT("🍿 Entertainment"), OTHERS("🌈 Others");

  public final String displayName;

  ExpenseType(String displayName) {
    this.displayName = displayName;
  }
}

// Optional: Use Record
// https://www.developer.com/java/java-record-class/
record CustomExpense(ExpenseType description, double amount) {
  @Override
  public String toString() {
    return String.format("%s: %.2f", description, amount);
  }
}

public class ExpenseAppAdv {

  public static void main(String[] args) {
    ArrayList<CustomExpense> expenses = new ArrayList<>();

    boolean isRunning = true;

    while (isRunning) {
      showMenu();
      int choice = Integer.parseInt(System.console().readLine());

      switch (choice) {
        case 1 -> addExpense(expenses);
        case 2 -> showExpenses(expenses);
        case 3 -> calcTotalExpense(expenses);
        case 4 -> calcAverageExpense(expenses);
        case 5 -> isRunning = false;
        default -> System.out.println("Invalid choice");
      }

    }
  }

  public static void showMenu() {
    System.out.println("\n💸 Welcome to Expense Tracker");
    System.out.println("1. Add Expense");
    System.out.println("2. Show Expenses");
    System.out.println("3. Calculate Total Expense");
    System.out.println("4. Calculate Average Expense");
    System.out.println("5. Exit");
  }

  public static void addExpense(ArrayList<CustomExpense> expenses) {
    System.out.println("Enter expense amount");
    double expense = Double.parseDouble(System.console().readLine());
    System.out.println("Enter expense description");
    ExpenseType description = ExpenseType.valueOf(System.console().readLine().toUpperCase());
    expenses.add(new CustomExpense(description, expense));
  }

  public static void calcTotalExpense(ArrayList<CustomExpense> expenses) {
    double total = 0;
    for (CustomExpense expense : expenses) {
      total += expense.amount();
    }
    System.out.println("Total expense: " + total);
  }

  public static void calcAverageExpense(ArrayList<CustomExpense> expenses) {
    double total = 0;
    for (CustomExpense expense : expenses) {
      total += expense.amount();
    }
    System.out.println("Average expense: " + total / expenses.size());
  }

  public static void showExpenses(ArrayList<CustomExpense> expenses) {

    // expenses.forEach(expense -> {
    // System.out.println(expense.description() + ": " + expense.amount());
    // });

    System.out.println("\nYour expenses: ");

    expenses.forEach(expense -> {
      System.out.printf("%s: $%.2f\n", expense.description().displayName,
          expense.amount());
      // System.out.printf("%s: $%.2f\n", expense.description(), expense.amount());
    });
  }

}
