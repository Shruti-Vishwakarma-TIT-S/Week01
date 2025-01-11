import java.util.Scanner;
//create a class ReverseNumber
public class ReverseNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // enter input for a number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();
        // Count the number of digits
        int temp = number;
        int count = 0;
        while (temp != 0) {
		// Remove the last digit
            temp /= 10; 
		// Increment the digit count
            count++; 
        }
        // Create an array to store the digits
        int[] digits = new int[count];
        temp = number; 
        // Extract digits and store them in the array
        for (int i = 0; i < count; i++) {
			// Get the last digit
            digits[i] = temp % 10; 
			// Remove the last digit
            temp /= 10; 
        }
        // Create an array to store the reversed digits
        int[] reversedDigits = new int[count];
        // Reverse the digits
        for (int i = 0; i < count; i++) {
			// Store in reverse order
            reversedDigits[i] = digits[count - 1 - i]; 
        }
        // Display the reversed digits
        System.out.println("Reversed number: ");
        for (int i = 0; i < count; i++) {
            System.out.print(reversedDigits[i]);
        }
        System.out.println();
        // Close the scanner
        scanner.close();
    }
}