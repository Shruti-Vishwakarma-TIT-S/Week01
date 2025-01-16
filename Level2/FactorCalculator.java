import java.util.Scanner;
//create a calculator
public class FactorCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Enter input for a number
        System.out.print("Enter a number to find its factors: ");
        int number = scanner.nextInt();
        // Finding the factors of the number
        int[] factors = findFactors(number);
        // Displaying the factors
        System.out.print("Factors of " + number + " are: ");
        for (int factor : factors) {
            System.out.print(factor + " ");
        }
        System.out.println(); 
        // Calculating and displaying the sum of factors
        int sum = sumOfFactors(factors);
        System.out.println("Sum of factors: " + sum);
        // Calculating and displaying the product of factors
        long product = productOfFactors(factors);
        System.out.println("Product of factors: " + product);
        // Calculating and displaying the sum of squares of factors
        double sumOfSquares = sumOfSquaresOfFactors(factors);
        System.out.println("Sum of squares of factors: " + sumOfSquares);
		// Closing the scanner
        scanner.close(); 
    }
    // Method to find the factors of a number
    public static int[] findFactors(int number) {
        // First loop to count the number of factors
        int count = 0;
        for (int i = 1; i <= number; i++) {
			// Check if i is a factor
            if (number % i == 0) { 
				// Increment count if i is a factor
                count++; 
            }
        }
        // Initialize the array with the count of factors
        int[] factors = new int[count];
        int index = 0; 
        // Second loop to save the factors into the array
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) { 
				// Store the factor in the array
                factors[index] = i; 
                index++; 
            }
        }
		// Return the array of factors
        return factors; 
    }
    // Method to find the sum of the factors
    public static int sumOfFactors(int[] factors) {
        int sum = 0; // Initialize sum
        for (int factor : factors) {
            sum += factor; // Add each factor to the sum
        }
		// Return the total sum
        return sum; 
    }
    // Method to find the product of the factors
    public static long productOfFactors(int[] factors) {
        long product = 1; 
        for (int factor : factors) {
            product *= factor; // Multiply each factor to the product
        }
		// Return the total product
        return product; 
    }
    // Method to find the sum of squares of the factors
    public static double sumOfSquaresOfFactors(int[] factors) {
        double sumOfSquares = 0; 
        for (int factor : factors) {
            sumOfSquares += Math.pow(factor, 2); 
        }
		// Return the total sum of squares
        return sumOfSquares; 
    }
}