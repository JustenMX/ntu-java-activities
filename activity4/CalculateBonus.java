package activity4;

/*
 * ### 👨‍💻 Activity 1 - Calculate Bonus

Create another overloaded method for `bonusCalc` that takes in the salary as well as an `enum` `Position` with the following values: `STAFF`, `MANAGER`, `CEO`.
The bonuses should be calculated as follows:

- Staff: 10% of salary
- Manager: 20% of salary
- CEO: 300% of salary

 * ### 👨‍💻 Activity 2 - Calculate Bonus for Variable Wage Worker

Now we have a variable wage worker, and we store his salary in an array. We want to calculate his bonus based on his monthly average salary. The worker should only get a bonus if he has worked for at least 6 months.
Create an overloaded method that takes in an array of salaries and calculates the bonus based on the average salary.
 */

enum Position {
    STAFF, MANAGER, CEO
};

public class CalculateBonus {
    public static void main(String[] args) {
        double[] salaries1 = { 2000, 3000, 5000, 2000, 3000, 5000 };
        double[] salaries2 = { 2000, 3000, 5000, 2000, 3000, };
        System.out.println("Staff Bonus: " + bonusCalc(5000, Position.STAFF));
        System.out.println("Manager Bonus: " + bonusCalc(6500, Position.MANAGER));
        System.out.println("CEO Bonus: " + bonusCalc(20000, Position.CEO));
        //
        System.out.println("Bonus based on average Salary: " + bonusCalc(salaries1));
        System.out.println("Bonus based on average Salary: " + bonusCalc(salaries2));
    }

    // Activity 1
    public static double bonusCalc(double salary, Position position) {
        switch (position) {
            case STAFF: {
                return salary * 0.1;
            }
            case MANAGER: {
                return salary * 0.2;
            }
            case CEO: {
                return salary * 3.0;
            }
            default: {
                return 0;
            }
        }
    }

    // Activity 2

    public static double bonusCalc(double[] arr) {
        double avg = 0;
        double totalSum = 0;
        for (double salary : arr) {
            totalSum += salary;
            salary++;
        }
        avg = totalSum / arr.length;
        return avg * 0.1;

    }

}
