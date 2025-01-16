import java.util.Scanner;
//create a class NumberCheckNew
public class NumberCheckNew {
    // Method to find the count of digits in the number
    public static int countDigits(int number) {
        int count = 0; // Initialize count to 0
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
        int[] digits = new int[digitCount]; 
		// Create an array to store digits
        for (int i = digitCount - 1; i >= 0; i--) {
            digits[i] = number % 10; 
			// Store the last digit
            number /= 10; 
			// Remove the last digit
        }
		// Return the array of digits
        return digits; 
    }

    // Method to check if a number is a duck number
    public static boolean isDuckNumber(int[] digits) {
        for (int digit : digits) {
            if (digit != 0) {
			// Return true if a non-zero digit is found
                return true; 
            }
        }
		// Return false if no non-zero digit is found
        return false; 
    }
    // Method to check if the number is an Armstrong number
    public static boolean isArmstrongNumber(int number) {
        int[] digits = storeDigits(number); // Get the digits of the number
        int sum = 0; // Initialize sum to 0
        int power = digits.length; // Get the number of digits
        for (int digit : digits) {
		// Calculate the sum of digits raised to the power
            sum += Math.pow(digit, power); 
        }
        return sum == number; 
    }
    // Method to find the largest and second largest elements in the digits array
    public static int[] findLargest(int[] digits) {
		// Initialize largest and second largest to minimum value
        int largest = Integer.MIN_VALUE; 
        int secondLargest = Integer.MIN_VALUE; 
        for (int digit : digits) {
            if (digit > largest) {
                secondLargest = largest; 
                largest = digit; 
            } else if (digit > secondLargest && digit != largest) {
				// Update second largest if it's not equal to largest
                secondLargest = digit; 
            }
        }
        return new int[]{largest, secondLargest}; 
    }
    // Method to find the smallest and second smallest elements in the digits array
    public static int[] findSmallest(int[] digits) {
        int smallest = Integer.MAX_VALUE; 
		// Initialize second smallest to maximum value
        int secondSmallest = Integer.MAX_VALUE; 
        for (int digit : digits) {
            if (digit < smallest) {
                secondSmallest = smallest;
                smallest = digit; 
            } else if (digit < secondSmallest && digit != smallest) {
                secondSmallest = digit; 
            }
        }
		// Return smallest and second smallest
        return new int[]{smallest, secondSmallest}; 
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); 
        System.out.print("Enter a number: ");
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
        // Check if the number is a duck number
        boolean isDuck = isDuckNumber(digits);
        System.out.println("Is Duck Number: " + isDuck);
        // Check if the number is an Armstrong number
        boolean isArmstrong = isArmstrongNumber(number);
        System.out.println("Is Armstrong Number: " + isArmstrong);
        // Find largest and second largest
        int[] largest = findLargest(digits);
        System.out.println("Largest: " + largest[0]);
	}
}	