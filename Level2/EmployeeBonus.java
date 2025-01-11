import java.util.Scanner;
//create a class EmployeeBonus
public class EmployeeBonus {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        final int numberOfEmployees = 10;
		//initialization of arrays
        double[] salaries = new double[numberOfEmployees];
        double[] yearsOfService = new double[numberOfEmployees];
        double[] bonuses = new double[numberOfEmployees];
        double[] newSalaries = new double[numberOfEmployees];
        double totalBonus = 0.0;
        double totalOldSalary = 0.0;
        double totalNewSalary = 0.0;
        // Input salaries and years of service
        for (int i = 0; i < numberOfEmployees; i++) {
            while (true) {
                System.out.print("Enter salary for employee " + (i + 1) + ": ");
                double salary = scanner.nextDouble();
                System.out.print("Enter years of service for employee " + (i + 1) + ": ");
                double years = scanner.nextDouble();
                // Validate input
                if (salary < 0 || years < 0) {
                    System.out.println("Invalid input. Salary and years of service must be non-negative. Please enter again.");
                } else {
                    salaries[i] = salary;
                    yearsOfService[i] = years;
                    break; 
                }
            }
        }
        // Calculate bonuses and new salaries
        for (int i = 0; i < numberOfEmployees; i++) {
            if (yearsOfService[i] > 5) {
                bonuses[i] = salaries[i] * 0.05; // 5% bonus
            } else {
                bonuses[i] = salaries[i] * 0.02; // 2% bonus
            }
			// Calculate new salary
            newSalaries[i] = salaries[i] + bonuses[i];
			// Accumulate total bonus
            totalBonus += bonuses[i]; 
			// Accumulate total old salary
            totalOldSalary += salaries[i]; 			
			// Accumulate total new salary
            totalNewSalary += newSalaries[i]; 
        }

        // Print total bonus payout and total salaries
        System.out.println("Total bonus payout: " + totalBonus);
        System.out.println("Total old salary of all employees: " + totalOldSalary);
        System.out.println("Total new salary of all employees: " + totalNewSalary);
        // Close the scanner
        scanner.close();
    }
}