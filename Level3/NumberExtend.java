import java.util.Scanner;
//create class NumberExtend
public class NumberExtend {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
		// Initialize count to 0
        int count = 0; 
        while (number != 0) {
			// Remove the last digit
            number /= 10; 
			// Increment count
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
            digits[i] = number % 10; 
			// Remove the last digit
            number /= 10; 
        }
		// Return the array of digits
        return digits; 
    }
    // Method to reverse the digits array
    public static int[] reverseArray(int[] digits) {
		// Create an array for reversed digits
        int[] reversed = new int[digits.length]; 
        for (int i = 0; i < digits.length; i++) {
			// Reverse the order of digits
            reversed[i] = digits[digits.length - 1 - i]; 
        }
        return reversed; 
    }
    // Method to compare two arrays and check if they are equal
    public static boolean compareArrays(int[] array1, int[] array2) {
        if (array1.length != array2.length) {
			// Arrays are not equal if lengths differ
            return false; 
        }
        for (int i = 0; i < array1.length; i++) {
            if (array1[i] != array2[i]) {
				// Return false if any digit differs
                return false; 
            }
        }
        return true; // Return true if all digits are equal
    }
    // Method to check if a number is a palindrome
    public static boolean isPalindrome(int number) {
		// Get the digits of the number
        int[] digits = storeDigits(number); 
		// Reverse the digits
        int[] reversed = reverseArray(digits); 
		// Check if original and reversed arrays are equal
        return compareArrays(digits, reversed); 
    }
    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int number) {
		// Get the digits of the number
        int[] digits = storeDigits(number); 
        for (int digit : digits) {
            if (digit != 0) {
				// Return true if a non-zero digit is found
                return true; 
            }
        }
        return false; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
		// Create a Scanner object
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
        // Reverse the digits array
        int[] reversedDigits = reverseArray(digits);
        System.out.print("Reversed Digits: ");
        for (int digit : reversedDigits) {
            System.out.print(digit + " "); // Print each reversed digit
        }
        System.out.println();
        // Check if the number is a palindrome
        boolean isPalin = isPalindrome(number);
        System.out.println("Is Palindrome: " + isPalin);
        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(number);
        System.out.println("Is Duck Number: " + isDuck);
        scanner.close(); // Close the scanner
    }
}