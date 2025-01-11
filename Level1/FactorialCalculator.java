import java.util.Scanner;
//create class FactorialCalculator
public class FactorialCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter a positive integer to find its factorial: ");
        int number = scanner.nextInt();

        // Check if the user entered a positive integer
        if (number < 0) {
            System.out.println("Factorial is not defined for negative numbers.");
        } 
		else {
            // Initialize variables for factorial calculation
            long factorial = 1; 
            int counter = 1; 

            // Calculate factorial using a while loop
            while (counter <= number) {
                factorial *= counter; // Multiply current counter to factorial
                counter++; // Increment counter
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}