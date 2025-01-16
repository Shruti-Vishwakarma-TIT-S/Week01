import java.util.Scanner;
//crteate class NumberCheck1
public class NumberCheck1 {
    // Method to check if a number is a prime number
    public static boolean isPrime(int number) {
        if (number <= 1) {
            return false; // Numbers less than or equal to 1 are not prime
        }
        for (int i = 2; i <= Math.sqrt(number); i++) {
            if (number % i == 0) {
                return false; // If divisible by any number other than 1 and itself
            }
        }
        return true; // The number is prime
    }
    // Method to check if a number is a neon number
    public static boolean isNeon(int number) {
        int square = number * number; // Calculate the square of the number
        int sum = 0; // Initialize sum to 0
        // Calculate the sum of the digits of the square
        while (square != 0) {
            sum += square % 10; // Add the last digit to the sum
            square /= 10; // Remove the last digit
        }
        return sum == number; // Return true if the sum equals the original number
    }
    // Method to check if a number is a spy number
    public static boolean isSpy(int number) {
        int sum = 0; // Initialize sum to 0
        int product = 1; // Initialize product to 1

        // Calculate the sum and product of the digits
        while (number != 0) {
            int digit = number % 10; // Get the last digit
            sum += digit; // Add to sum
            product *= digit; // Multiply to product
            number /= 10; // Remove the last digit
        }
        return sum == product; // Return true if sum equals product
    }
    // Method to check if a number is an automorphic number
    public static boolean isAutomorphic(int number) {
        int square = number * number; // Calculate the square of the number
        String squareStr = String.valueOf(square); // Convert square to string
        String numberStr = String.valueOf(number); // Convert number to string

        // Check if the square ends with the number
        return squareStr.endsWith(numberStr);
    }
    // Method to check if a number is a buzz number
    public static boolean isBuzz(int number) {
        return number % 7 == 0 || number % 10 == 7; // Check if divisible by 7 or ends with 7
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter a number: ");
        int number = scanner.nextInt(); // Read the number from user input
        // Check if the number is prime
        boolean prime = isPrime(number);
        System.out.println("Is Prime: " + prime);
        // Check if the number is a neon number
        boolean neon = isNeon(number);
        System.out.println("Is Neon: " + neon);
        // Check if the number is a spy number
        boolean spy = isSpy(number);
        System.out.println("Is Spy: " + spy);
        // Check if the number is an automorphic number
        boolean automorphic = isAutomorphic(number);
        System.out.println("Is Automorphic: " + automorphic);
        // Check if the number is a buzz number
        boolean buzz = isBuzz(number);
        System.out.println("Is Buzz: " + buzz);
        scanner.close(); // Close the scanner
    }
}