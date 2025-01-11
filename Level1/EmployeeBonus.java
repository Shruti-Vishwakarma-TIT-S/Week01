import java.util.Scanner;
// Create a class EmployeeBonus
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter salary and year
        System.out.println("Enter the employee's salary and year: ");
        double salary = scanner.nextDouble();
        int years = scanner.nextInt();

        //take bonus variable
        double bonus = 0.0;

        // Calculate bonus based on years of service
        if (years > 5) {
            bonus = salary * 0.05; // 5% bonus
        }

        // Print the bonus amount
        System.out.println("The bonus amount is: " + bonus);

        // Close the scanner
        scanner.close();
    }
}