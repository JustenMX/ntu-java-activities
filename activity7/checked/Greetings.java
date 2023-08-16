package activity7.checked;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.FileHandler;
import java.util.logging.Handler;
import java.util.logging.Level;
// import java.util.logging.Level;
import java.util.logging.Logger;
import java.util.logging.SimpleFormatter;

/*
 * Use a try catch finally block to read an input from the console. Use the exception and logging to log the error in the console
 */

public class Greetings {

    public final static Logger logger = Logger.getLogger(Greetings.class.getName());

    public static void main(String[] args) {
        try {
            Handler logFileHandler = new FileHandler("activity7/checked/LogFile.log", true);
            SimpleFormatter formatter = new SimpleFormatter();
            logFileHandler.setFormatter(formatter);
            logger.addHandler(logFileHandler);
            readFile("activity7/checked/greetings.txt");
        } catch (IOException exception) {
            logger.log(Level.SEVERE, " 🔴 An error occurred", exception.getMessage());
        } finally {
            logger.info("🟢 Process Complete");
        }

        // Logging Messages
        // logger.log(Level.SEVERE, "🔴 This is a severe message.");
        // logger.log(Level.WARNING, "🟠 This is a warning message.");
        // logger.log(Level.INFO, "🟢 This is an info message.");

    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("activity7/checked/greetings.txt");
        Scanner scanner = new Scanner(fis);

        if (scanner.hasNextLine()) {
            logger.info("🟢 File Read");
            System.out.println(scanner.nextLine());
        }

        scanner.close();
    }

}
