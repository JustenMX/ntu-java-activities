package vendingmachine;

import java.util.ArrayList;

enum Drink {
    COKE, PEPSI, WATER

}

record VendingTransaction(Drink drink, double amount) {
    //
}

public class VendingMachine {
    private String location;
    private double earnings;
    private double balance;
    private ArrayList<VendingTransaction> transactions;

    // Constructor
    public VendingMachine(String location) {
        this.location = location;
        this.earnings = 0;
        this.balance = 0;
        this.transactions = new ArrayList<>();
    }

    // Copy Constructor
    public VendingMachine(VendingMachine source) {
        this.location = source.location;
        this.earnings = source.earnings;
        this.balance = source.balance;
    }

    // Getters
    public String getLocation() {
        return location;
    }

    public double getEarnings() {
        return earnings;
    }

    public double getBalance() {
        return balance;
    }

    // Setters
    public void setLocation(String location) {
        this.location = location;
    }

    public void setEarnings(double earnings) {
        this.earnings = earnings;
    }

    public void setBalance(double balance) {
        this.balance = balance;
    }

    // Methods

    public void insertCoin(double amount) {
        this.balance += amount;
        System.out.println("💵 Inserted $" + amount);
        System.out.println("💵 Current Balance $" + this.balance);
    }

    public void selectDrink(Drink drink) {
        double currentBalance = this.balance;
        double drinkPrice = getPrice(drink);

        if (currentBalance < drinkPrice) {
            double moreBal = drinkPrice - currentBalance;
            System.out.println("🥤 Selected Beverage: " + drink);
            System.out.println("🚫 Insufficient Payment, Insert $" + moreBal + " more.");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        } else if (currentBalance > drinkPrice) {
            this.earnings += drinkPrice;
            this.transactions.add(new VendingTransaction(drink, drinkPrice));
            double returnBal = currentBalance - drinkPrice;
            System.out.println("❗️ Balance amount $ " + returnBal + " returned.");
            this.balance = 0;
            dispenseDrink(drink);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        } else {
            this.earnings += drinkPrice;
            this.transactions.add(new VendingTransaction(drink, drinkPrice));
            this.balance = 0;
            dispenseDrink(drink);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

    }

    public double getPrice(Drink drink) {

        return switch (drink) {
            case COKE -> 1.50;
            case PEPSI -> 1.50;
            case WATER -> 1.00;
            default -> 0.0;
        };
    }

    public static void dispenseDrink(Drink drink) {
        System.out.println("🥤 " + drink + " Dispensing Now");
    }

    public void printEarnings() {
        System.out.println("🤖 Vending Machine Total Earnings: $" + getEarnings());
        System.out.println(".");
        System.out.println(".");
        System.out.println(".");
    }

    public void printTransactions() {
        System.out.println("🧾 Transactions:");
        for (VendingTransaction transaction : this.transactions) {
            System.out.println(transaction.drink() + " - $" + transaction.amount());
        }
    }

}
