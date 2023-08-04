package activity2;

/* 
* Use the do while loop to prompt the user to enter the user name. If the user name is not "admin", prompt the user to enter the user name again. 
* We will use the command line to compile and run this program as the IDE blocks readline().
 */

public class AdminUser {
    public static void main(String[] args) {
        // int budget = 1000;
        // int expense = 90;

        // // if else
        // if (budget > expense) {
        // System.out.println("You are within budget");
        // } else {
        // System.out.println("You are over budget");
        // }

        boolean isValidUser = false;
        int attempts = 0;
        do {
            String userName = System.console().readLine("Enter your user name: ");
            // System.out.println("You are over budget");
            if (userName.equals("admin")) {
                System.out.println("😊 Welcome Admin");
                isValidUser = true;
                //
            } else {
                System.out.println("😡 Unauthorized user!");
                attempts++;
                // if (attempts == 3) {
                // System.out.println("Too many attempts");
                // break;
                // }
            }
            // strickly based on true vs false -> if true it runs the loop,
            // or else it exits the loop

        } while (!isValidUser && attempts < 3);
        // false && true == false // if false it exits loop
        // attempt = 1 // true && true == true // if true runs the loops
        // attempt = 3 // true && false == false // exits the loop
    }
}
