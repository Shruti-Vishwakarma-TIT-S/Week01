import java.util.Scanner;
//create class NumberCheckExtend
public class NumberCheckExtend {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
		// Initialize count to 0
        int count = 0; 
        while (number != 0) {
			// Remove the last digit
            number /= 10; 
            count++; 
        }
		// Return the count of digits
        return count; 
    }
    // Method to store the digits of the number in a digits array
    public static int[] storeDigits(int number) {
		// Get the count of digits
        int digitCount = countDigits(number); 
		// Create an array to store digits
        int[] digits = new int[digitCount]; 
        for (int i = digitCount - 1; i >= 0; i--) {
			// Store the last digit
            digits[i] = number % 10; 
			// Remove the last digit
            number /= 10; 
        }
		// Return the array of digits
        return digits; 
    }
    // Method to find the sum of the digits of a number
    public static int sumOfDigits(int[] digits) {
        int sum = 0; 
        for (int digit : digits) {
			// Add each digit to the sum
            sum += digit; 
        }
		// Return the sum of digits
        return sum;
    }
    // Method to find the sum of the squares of the digits of a number
    public static double sumOfSquares(int[] digits) {
        double sum = 0;
        for (int digit : digits) {
			// Add the square of each digit to the sum
            sum += Math.pow(digit, 2); 
        }
		// Return the sum of squares of digits
        return sum; 
    }
    // Method to check if a number is a Harshad number
    public static boolean isHarshadNumber(int number) {
        int[] digits = storeDigits(number); 
		// Get the digits of the number
        int sum = sumOfDigits(digits); 
		// Get the sum of the digits
		// Return true if the number is divisible by the sum of its digits
        return number % sum == 0; 
    }
    // Method to find the frequency of each digit in the number
    public static int[][] digitFrequency(int number) {
		// Get the digits of the number
        int[] digits = storeDigits(number); 
        int[][] frequency = new int[10][2];
        // Initialize frequency array
        for (int i = 0; i < 10; i++) {
			// First column is the digit
            frequency[i][0] = i;
			// Initialize frequency to 0
            frequency[i][1] = 0; 
        }
        // Count frequency of each digit
        for (int digit : digits) {
			// Increment the frequency for the digit
            frequency[digit][1]++; 
        }
		// Return the frequency array
        return frequency; 
    }
    public static void main(String[] args) {
		//Create a Scanner object
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
		// Read the number from user input
        int number = scanner.nextInt(); 
        // Count digits
        int digitCount = countDigits(number);
        System.out.println("Count of digits: " + digitCount);
        // Store digits
        int[] digits = storeDigits(number);
        System.out.print("Digits: ");
        for (int digit : digits) {
			// Print each digit
            System.out.print(digit + " "); 
        }
        System.out.println();
        // Find sum of digits
        int sum = sumOfDigits(digits);
        System.out.println("Sum of digits: " + sum);
        // Find sum of squares of digits
        double sumOfSquares = sumOfSquares(digits);
        System.out.println("Sum of squares of digits: " + sumOfSquares);
        // Check if the number is a Harshad number
        boolean isHarshad = isHarshadNumber(number);
        System.out.println("Is Harshad Number: " + isHarshad);
        // Find frequency of each digit
        int[][] frequency = digitFrequency(number);
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i][1] > 0) { 
                System.out.println("Digit " + frequency[i][0] + ": " + frequency[i][1] + " time(s)");
            }
        }

        scanner.close(); 
	}
}		