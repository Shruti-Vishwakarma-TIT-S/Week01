import java.util.Scanner;
//create class RecursiveSum
public class RecursiveSum {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //Enter user input for n
        System.out.print("Enter a natural number (n): ");
        int n = scanner.nextInt();
        // Check if the input is a natural number
        if (n < 1) {
            System.out.println("Please enter a natural number greater than 0.");
			// Exit the program if the input is not a natural number
            return; 
        }
        // Calculate the sum using recursion
        int recursiveSum = sumOfNaturalNumbers(n);
        // Calculate the sum using the formula
        int formulaSum = sumUsingFormula(n);
        // Display the results
        System.out.println("Sum of first " + n + " natural numbers (using recursion): " + recursiveSum);
        System.out.println("Sum of first " + n + " natural numbers (using formula): " + formulaSum);

        // Compare the results
        if (recursiveSum == formulaSum) {
            System.out.println("Both methods give the same result.");
        } else {
            System.out.println("There is a discrepancy between the two methods.");
        }
        scanner.close(); // Close the scanner
    }
    // Method to find the sum of n natural numbers using recursion
    public static int sumOfNaturalNumbers(int n) {
        // Base case: if n is 1, return 1
        if (n == 1) {
            return 1;
        }
        // Recursive case: n + sum of (n-1)
        return n + sumOfNaturalNumbers(n - 1);
    }
    // Method to find the sum of n natural numbers using the formula
    public static int sumUsingFormula(int n) {
		// Formula for the sum of first n natural numbers
        return n * (n + 1) / 2; 
    }
}