package activity7.exception;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class LearnExceptions {
    public static void main(String[] args) {

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        int x = 10;
        int y = 0;

        // LBYL Method
        // if (y == 0) {
        // System.out.println("Cannot divide by zero");
        // } else {
        // int result = divide(x, y);
        // System.out.println(result);
        // }

        // Try-Catch-Finally Method
        try {
            int result = divide(x, y);
            System.out.println(result);
        } catch (ArithmeticException exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Code Completed");
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        // Array Example
        int[] numbers = { 1, 2, 3, 4, 5 };
        int index = 5;

        try {
            if (index < 0 || index >= numbers.length - 1) {
                throw new InvalidArrayIndexException(index + " is not a valid index!");
            }
            System.out.println(numbers[index]);
        } catch (InvalidArrayIndexException exception) {
            System.out.println(exception);
        }

        // LBYL Method
        // if (index >= 0 && index < numbers.length) {
        // System.out.println(numbers[index]);
        // } else {
        // System.out.println("Index is out of bounds");
        // }

        // EAFP Try-Catch-Finally Method
        try {
            System.out.println(numbers[index]);
        } catch (ArrayIndexOutOfBoundsException exception) {
            System.out.println(exception);
        } finally {
            System.out.println("Code Completed");
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        // Scanner Example
        // Scanner scanner = new Scanner(System.in);
        // System.out.print("Enter a number: ");
        // int number = scanner.nextInt();
        // System.out.println("You have entered: " + number);
        // scanner.close();

        // LBYL Method
        // if (scanner.hasNextInt()) {
        // int number = scanner.nextInt();
        // System.out.println(number);
        // } else {
        // System.out.println("Input is not an integer");
        // scanner.close();
        // }

        // EAFP Method
        // try {
        // int number = scanner.nextInt();
        // System.out.println(number);
        // } catch (InputMismatchException exception) {
        // System.out.println(exception);
        // } finally {
        // scanner.close();
        // }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        // FileInputStream
        // EAFP Method
        try {
            // Create a new FileInputStream object
            FileInputStream f = new FileInputStream("test.txt");
            // Create a new Scanner object and pass the FileInputStream object
            Scanner s = new Scanner(f);
            // Print the first line of the file
            System.out.println(s.nextLine());
            // Close the file
            s.close();
        } catch (FileNotFoundException exception) {
            System.out.println(exception.getMessage());
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        try {
            int result = dividePositiveNumbers(10, -2);
            System.out.println(result);
        } catch (NegativeNumberException exception) {
            System.out.println(exception);
        }

        // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

        int[] numbersList = { 1, 2, 3, 4, 5 };
        checkNegativeElement(numbersList);

    }

    public static void readFileFirstLine(String filename) throws FileNotFoundException {
        // Create a new FileInputStream object
        FileInputStream f = new FileInputStream(filename);
        // Create a new Scanner object and pass the FileInputStream object
        Scanner scanner = new Scanner(f);
        System.out.println(scanner.nextLine());
        scanner.close();
    }

    public static int divide(int x, int y) {
        return x / y;
    }

    public static int dividePositiveNumbers(int a, int b) {
        if (a < 0 || b < 0) {
            throw new NegativeNumberException("Negative numbers are not allowed.");
        }
        return a / b;
    }

    // ~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~~ //

    public static boolean checkNegativeElement(int[] numbers) {
        for (int number : numbers) {
            if (number < 0) {
                throw new noNegativeElementException("Negative numbers are not allowed");
            }

        }
        return true;
    }

}