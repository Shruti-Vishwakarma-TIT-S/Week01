import java.util.Scanner;
//create class FactorialCalculatorFor
public class FactorialCalculatorFor {
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
            int factorial = 1; 
            int counter = 1; 

            // Calculate factorial using a while loop
            for(int i = counter;i<= number ; i++) {
                factorial *= i; // Multiply current counter to factorial
               
            }

            // Print the result
            System.out.println("The factorial of " + number + " is: " + factorial);
        }

        // Close the scanner
        scanner.close();
    }
}