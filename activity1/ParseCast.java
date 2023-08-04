package activity1;

class ParseCast {

    public static void main(String args[]) {

        /*
         * Task 1: Cast "price" as integer and assign it to "round".
         */
        float price = 9.9f;
        int round = (int) price; // answer

        System.out.println("round prints " + round); // prints 9

        /*
         * Task 2: Cast "price" as String and assign it to "priceAsString".
         */
        String priceAsString = String.valueOf(price); // answer

        System.out.println("priceAsString prints " + priceAsString); // prints "9.9"
        System.out.println(priceAsString instanceof String); // prints true

        /*
         * Task 3: Cast "priceAsString" as int and assign it to "number".
         */

        // priceAsString == "9.9"
        /*
         * priceAsString is string containing data type float, therefore i need to
         * convert it to that data type before converting to integer
         */

        float priceConvert = Float.valueOf(priceAsString);
        int number = (int) priceConvert;

        System.out.println("number prints " + number); // prints 9;
    }
}

// ? What is the difference between parsing and casting?
/*
 * Parsing is the process of converting data from one representation to another,
 * usually from a textual format to a structured format.
 * Casting is the process of explicitly converting a variable from one data type
 * to another, typically when you want to treat variable as a different type.
 */
