import java.util.Scanner;
//create class name
public class TotalIncome {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter Salary and Bonus
        System.out.print("Enter the salary and bonus in INR: ");
        double salary = input.nextDouble();
        double bonus = input.nextDouble();

        // Calculate totalIncome
        double totalIncome = salary + bonus;

        // Print the result here
        System.out.println("The salary is INR " + salary + " and bonus is INR " + bonus + ". Hence Total Income is INR " + totalIncome);
    }
}
