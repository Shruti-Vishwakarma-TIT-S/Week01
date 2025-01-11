import java.util.Scanner;
//create class DigitFrequency
public class DigitFrequency {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // Take input for a number
        System.out.println("Enter a number: ");
        long number = scanner.nextLong(); // Use long to accommodate large numbers
        // Convert the number to a string to easily access each digit
        String numberStr = Long.toString(number);
        int length = numberStr.length();
        // Create an array to store the frequency of each digit (0-9)
        int[] frequency = new int[10];
        // Find the frequency of each digit
        for (int i = 0; i < length; i++) {
            char digitChar = numberStr.charAt(i);
            int digit = Character.getNumericValue(digitChar); // Convert char to int
            frequency[digit]++; // Increment the frequency of the digit
        }
        // Display the frequency of each digit
        System.out.println("Digit Frequency:");
        for (int i = 0; i < frequency.length; i++) {
            if (frequency[i] > 0) { // Only display digits that appear in the number
                System.out.println("Digit " + i + ": " + frequency[i]);
            }
        }
        // Close the scanner
        scanner.close();
    }
}