package vendingmachine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    public static void main(String[] args) {
        private static final Logger logger = LoggerFactory.getLogger(App.class);

        VendingMachine ntuVendingMachine = new VendingMachine("NTU");

        try {
            ntuVendingMachine.insertCoin(1);
            ntuVendingMachine.selectDrink(Drink.COKE);
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        // should not dispense, insufficient payment
        try {
            ntuVendingMachine.insertCoin(0.5);
            ntuVendingMachine.selectDrink(Drink.COKE);
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        try {
            ntuVendingMachine.insertCoin(0.5);
            ntuVendingMachine.selectDrink(Drink.WATER);
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        try {
            ntuVendingMachine.insertCoin(1);
            ntuVendingMachine.selectDrink(Drink.WATER);
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        ntuVendingMachine.printEarnings();
        ntuVendingMachine.printTransactions();
    }
}
