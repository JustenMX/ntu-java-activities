package activity5.vending_machine;

enum Drink {
    COKE, PEPSI, WATER
}

public class VendingMachine {
    private String location;
    private double earnings;
    private double balance;

    public VendingMachine(String location) {
        this.location = location;
        // this.earnings = earnings;
        // this.balance = balance;
    }

    public VendingMachine(VendingMachine source) {
        this.location = source.location;
        this.earnings = source.earnings;
        this.balance = source.balance;
    }

    // Getter
    public String getLocation() {
        return location;
    }

    public double getEarnings() {
        return earnings;
    }

    public double getBalance() {
        return balance;
    }

    // Setter
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

    public void insertCoin(double amt) {
        this.balance += amt;
        System.out.println("💵 Inserted $" + amt);
        System.out.println("💵 Current Balance $" + this.balance);
    }

    public void selectDrink(Drink drink) {
        double currentBalance = this.balance;
        double drinkPrice = getPrice(drink);

        if (currentBalance < drinkPrice) {
            System.out.println("🥤 Selected Beverage: " + drink);
            System.out.println("🚫 Insufficient Payment, Insert more Coins");
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        } else {
            this.earnings += drinkPrice;
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
            case WATER -> 1.50;
            default -> 0.0;
        };
    }

    public static void dispenseDrink(Drink drink) {
        System.out.println("🥤 " + drink + " Dispensing Now");
    }

    public void printEarnings() {
        System.out.println("Vending Machine Total Earnings: $" + getEarnings());
    }

}
