import java.util.Random;
//create class EmployeeBonus
public class EmployeeBonus {
    // Method to determine the salary and years of service
    public static double[][] determineSalaryAndYears(int numberOfEmployees) {
        double[][] employeeData = new double[numberOfEmployees][2]; // 2D array to store salary and years of service
        Random random = new Random();

        for (int i = 0; i < numberOfEmployees; i++) {
            // Generate a random salary between 10000 and 99999
            double salary = 10000 + (random.nextDouble() * 90000);
            // Generate random years of service between 1 and 20
            double yearsOfService = 1 + random.nextInt(20);
            employeeData[i][0] = salary; // Store salary
            employeeData[i][1] = yearsOfService; // Store years of service
        }

        return employeeData; // Return the 2D array
    }
    // Method to calculate the new salary and bonus
    public static double[][] calculateNewSalaryAndBonus(double[][] employeeData) {
        double[][] updatedData = new double[employeeData.length][3]; // 2D array to store new salary and bonus
        for (int i = 0; i < employeeData.length; i++) {
            double oldSalary = employeeData[i][0];
            double yearsOfService = employeeData[i][1];
            double bonus;
            double newSalary;
            // Calculate bonus and new salary based on years of service
            if (yearsOfService > 5) {
                bonus = oldSalary * 0.05; // 5% bonus
            } else {
                bonus = oldSalary * 0.02; // 2% bonus
            }
            newSalary = oldSalary + bonus; // Calculate new salary
            // Store old salary, new salary, and bonus in the updated data array
            updatedData[i][0] = oldSalary; // Old salary
            updatedData[i][1] = newSalary; // New salary
            updatedData[i][2] = bonus; // Bonus
        }
        return updatedData; // Return the updated data array
    }
    // Method to calculate the sum of old salary, new salary, and total bonus
    public static void calculateAndDisplayTotals(double[][] updatedData) {
        double totalOldSalary = 0;
        double totalNewSalary = 0;
        double totalBonus = 0;
        // Calculate totals
        for (int i = 0; i < updatedData.length; i++) {
            totalOldSalary += updatedData[i][0];
            totalNewSalary += updatedData[i][1];
            totalBonus += updatedData[i][2];
        }
        // Display results in a tabular format
        System.out.println("Old Salary      New Salary      Bonus");
        for (int i = 0; i < updatedData.length; i++) {
            System.out.println(updatedData[i][0] + " " +  updatedData[i][1] + " " + updatedData[i][2]);
        }
        System.out.println("Total: " + totalOldSalary);
        System.out.println("Total New Salary: " + totalNewSalary);
        System.out.println("Total Bonus: " + totalBonus);
    }
    public static void main(String[] args) {
        int numberOfEmployees = 10; // Number of employees
        double[][] employeeData = determineSalaryAndYears(numberOfEmployees); // Get salary and years of service
        double[][] updatedData = calculateNewSalaryAndBonus(employeeData); // Calculate new salary and bonus
        calculateAndDisplayTotals(updatedData); // Display totals
    }
}