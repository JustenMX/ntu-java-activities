package vendingmachine;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {

        VendingMachine ntuVendingMachine = new VendingMachine("NTU");
        logger.info("🟢 Application started");

        try {
            ntuVendingMachine.insertCoin(1);
            logger.info("💵 User inserts payment");
            ntuVendingMachine.selectDrink(Drink.COKE);
            logger.info("🧃 User selects drink");
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            logger.error("🔴 An error occurred", exception);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        // should not dispense, insufficient payment
        try {
            ntuVendingMachine.insertCoin(0.5);
            logger.info("💵 User inserts payment");
            ntuVendingMachine.selectDrink(Drink.COKE);
            logger.info("🧃 User selects drink");
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            logger.error("🔴 An error occurred", exception);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        try {
            ntuVendingMachine.insertCoin(0.5);
            logger.info("💵 User inserts payment");
            ntuVendingMachine.selectDrink(Drink.WATER);
            logger.info("🧃 User selects drink");
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            logger.error("🔴 An error occurred", exception);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        try {
            ntuVendingMachine.insertCoin(1);
            logger.info("💵 User inserts payment");
            ntuVendingMachine.selectDrink(Drink.WATER);
            logger.info("🧃 User selects drink");
        } catch (InsufficientPaymentException exception) {
            System.out.println(exception.getMessage());
            logger.error("🔴 An error occurred", exception);
            System.out.println(".");
            System.out.println(".");
            System.out.println(".");
        }

        ntuVendingMachine.printEarnings();
        ntuVendingMachine.printTransactions();
    }
}
