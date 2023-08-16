package com.ntu;

//
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;
//
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Hello world!
 *
 */
public class App {
    private static final Logger logger = LoggerFactory.getLogger(App.class);

    public static void main(String[] args) {
        logger.info("Application started");
        try {
            readFile("activity7/maven-log/src/main/java/com/ntu/greet.txt");
        } catch (IOException exception) {
            logger.error(" 🔴 An error occurred", exception.getMessage());
        } finally {
            logger.info("🟢 Process Complete");
        }
        // System.out.println("Hello World!");
        // logger.info("Application started");
        // logger.info("This is an informational message.");
        // logger.error("This is an error message.");
        // logger.warn("This is a warning message.");
        // logger.info("Application ended");
    }

    public static void readFile(String fileName) throws FileNotFoundException {
        FileInputStream fis = new FileInputStream("activity7/maven-log/src/main/java/com/ntu/greet.txt");
        Scanner scanner = new Scanner(fis);
        if (scanner.hasNextLine()) {
            logger.info("🟢 File Read");
            System.out.println(scanner.nextLine());
        }
        scanner.close();

    }

}