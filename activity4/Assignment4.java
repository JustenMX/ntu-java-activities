package activity4;

/*
 * 1. Create a method called checkOddEven that gets an integer and prints
 * "The number is odd/even" depending on the result.
 * 2. Create a method called capsCombine that gets two strings and converts both
 * to uppercase and joins them with a space.
 * 3. Create a method called getAverage that gets an array of numbers and
 * returns the average of the values in the array.
 */

public class Assignment4 {
    public static void main(String args[]) {
        // Uncomment these to test:
        System.out.println("The number is: " + checkOddEven(998));
        System.out.println("The number is: " + checkOddEven(1237));

        // Uncomment these to test:
        System.out.println(capsCombine("john", "smith"));
        System.out.println(capsCombine("charlize", "doe"));

        // Uncomment these to test:
        int test_arr1[] = { 1, 2, 3, 4, 5 };
        int test_arr2[] = { 99, 100, 77, 62, 87, 92, 91, 100 };
        System.out.println("This is the average: " + getAverage(test_arr1));
        System.out.println("This is the average:  " + getAverage(test_arr2));

    }

    // 1. Create a method called checkOddEven that gets an integer and prints "The
    // number is odd/even" depending on the result.

    public static String checkOddEven(int num) {
        if (num % 2 == 0) {
            return "even";
        } else {
            return "odd";
        }
    }

    // 2. Create a method called capsCombine that gets two strings and converts both
    // to uppercase and joins them with a space.

    public static String capsCombine(String a, String b) {
        String newWord = a.toUpperCase() + " " + b.toUpperCase();
        return newWord;
    }

    // 3. Create a method called getAverage that gets an array of numbers and
    // returns the average of the values in the array.

    public static double getAverage(int[] arr) {
        double avg = 0;
        double totalSum = 0;
        for (double num : arr) {
            totalSum += num;
            num++;
        }
        avg = totalSum / (double) arr.length;
        return avg;
    }
}