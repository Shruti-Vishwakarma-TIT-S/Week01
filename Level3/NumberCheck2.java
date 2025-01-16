import java.util.Scanner;
// create a class NumberCheck2
public class NumberCheck2 {
    // Method to find factors of a number and return them as an array
    public static int[] findFactors(int number) {
        int count = 0; // Initialize count of factors
        // First loop to count the number of factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                count++; // Increment count if i is a factor
            }
        }
        int[] factors = new int[count]; // Create an array to store factors
        int index = 0; // Initialize index for factors array
        // Second loop to find and store the factors
        for (int i = 1; i <= number; i++) {
            if (number % i == 0) {
                factors[index] = i; // Store the factor
                index++; // Move to the next index
            }
        }
        return factors; // Return the array of factors
    }
    // Method to find the greatest factor of a number using the factors array
    public static int greatestFactor(int[] factors) {
        return factors[factors.length - 1]; // The last element is the greatest factor
    }
    // Method to find the sum of the factors using factors array
    public static int sumOfFactors(int[] factors) {
        int sum = 0; // Initialize sum to 0
        for (int factor : factors) {
            sum += factor; // Add each factor to the sum
        }
        return sum; // Return the sum of factors
    }
    // Method to find the product of the factors using factors array
    public static int productOfFactors(int[] factors) {
        int product = 1; // Initialize product to 1
        for (int factor : factors) {
            product *= factor; // Multiply each factor to the product
        }
        return product; // Return the product of factors
    }
    // Method to find the product of the cube of the factors using the factors array
    public static double productOfCubes(int[] factors) {
        double product = 1; // Initialize product to 1
        for (int factor : factors) {
            product *= Math.pow(factor, 3); // Multiply the cube of each factor
        }
        return product; // Return the product of cubes of factors
    }
    // Method to check if a number is a perfect number
    public static boolean isPerfect(int number) {
        int sum = sumOfFactors(findFactors(number)); // Get the sum of factors
        return sum - number == number; // Check if sum of proper divisors equals the number
    }
    // Method to check if a number is an abundant number
    public static boolean isAbundant(int number) {
        int sum = sumOfFactors(findFactors(number)); // Get the sum of factors
        return sum - number > number; // Check if sum of proper divisors is greater than the number
    }
    // Method to check if a number is a deficient number
    public static boolean isDeficient(int number) {
        int sum = sumOfFactors(findFactors(number)); // Get the sum of factors
        return sum - number < number; // Check if sum of proper divisors is less than the number
    }
    // Method to check if a number is a strong number
    public static boolean isStrong(int number) {
        int originalNumber = number; // Store the original number
        int sum = 0; // Initialize sum to 0
        // Calculate the sum of the factorial of its digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += factorial(digit); // Add the factorial of the digit to the sum
            number /= 10; // Remove the last digit
        }
        return sum == originalNumber; // Check if the sum equals the original number
    }
    // Helper method to calculate factorial of a number
    private static int factorial(int n) {
        if (n == 0 || n == 1) {
            return 1; // Factorial of 0 or 1 is 1
        }
        int result = 1; // Initialize result to 1
        for (int i = 2; i <= n; i++) {
            result *= i; // Calculate factorial
        }
        return result; // Return the factorial
    }
    public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in); // Create a Scanner object
    System.out.print("Enter a number: ");
    int number = scanner.nextInt(); // Read the number from user input
    // Find factors
    int[] factors = findFactors(number);
    System.out.print("Factors: ");
    for (int factor : factors) {
        System.out.print(factor + " "); // Print each factor
    }
    System.out.println();
    // Find greatest factor
    int greatest = greatestFactor(factors);
    System.out.println("Greatest Factor: " + greatest);
    // Find sum of factors
    int sum = sumOfFactors(factors);
    System.out.println("Sum of Factors: " + sum);
    // Find product of factors
    int product = productOfFactors(factors);
    System.out.println("Product of Factors: " + product);
    // Find product of cubes of factors
    double productOfCubes = productOfCubes(factors);
    System.out.println("Product of Cubes of Factors: " + productOfCubes);
    // Check if the number is a perfect number
    boolean isPerfect = isPerfect(number);
    System.out.println("Is Perfect Number: " + isPerfect);
    // Check if the number is an abundant number
    boolean isAbundant = isAbundant(number);
    System.out.println("Is Abundant Number: " + isAbundant);
    // Check if the number is a deficient number
    boolean isDeficient = isDeficient(number);
    System.out.println("Is Deficient Number: " + isDeficient);
    // Check if the number is a strong number
    boolean isStrong = isStrong(number);
    System.out.println("Is Strong Number: " + isStrong);
    scanner.close(); // Close the scanner
}
}