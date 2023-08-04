package activity3;

/*
* 1. Create a while loop that prints all the odd numbers from 1 to 50
* 2. Create a do-while loop that prints the following pattern from 1 to 20
```
    1 - Pop
    2 - Pop
    3 - Fizz
    4 - Pop
    5 - Buzz
    6 - Fizz
    ...
    11 - Pop
    12 - Fizz
    13 - Pop
    14 - Pop
    15 - FizzBuzz
    ...
    20 - Buzz
```
* 3. Use an enhanced for-loop to compute for the average of the given array
 */

public class Assignment3 {
    public static void main(String args[]) {
        // Task 1. Create a while loop that prints all the odd numbers from 1 to 50
        int i = 1;
        while (i <= 50) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
            i++;
        }

        System.out.println("######");

        /*
         * Task 2. Create a do-while loop that prints the following pattern from 1 to
         * 30:
         * If the number is divisible by 3, print "Fizz"
         * If the number is divisible by 5, print "Buzz"
         * If the number is divisible by 3 AND 5, print "FizzBuzz"
         * If the number is not divisible by 3 nor 5, print "Pop"
         */
        int n = 1;
        do {
            if (n % 3 == 0 && n % 5 == 0) {
                System.out.println("FizzBuzz");
            } else if (n % 3 == 0) {
                System.out.println("Fizz");
            } else if (n % 5 == 0) {
                System.out.println("Buzz");
            } else {
                System.out.println("Pop");
            }
            n++;
        } while (n <= 30);

        System.out.println("######");

        // Task 3. Use an enhanced for-loop to compute for the average of the given
        // array

        int expenses[] = { 120, 130, 114, 112, 132, 154, 123, 112, 165, 144, 188, 200 };
        float average = 0.0f;
        int sum = 0;
        for (int expense : expenses) {
            sum += expense;
        }

        average = (float) sum / expenses.length;
        System.out.println("Total sum of expenses in array: " + sum);
        System.out.println("Average of the given Expenses Array: " + average);

    }
}
