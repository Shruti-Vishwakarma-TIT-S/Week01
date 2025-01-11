import java.util.Scanner;
//create class Largest
public class Largest {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);     
        //Enter user input for the number
        System.out.println("Enter a number: ");
        long number = scanner.nextLong(); // Change to nextLong() to handle larger numbers
        // Define an array to store the digits
        int maxDigits = 10; // Change long to int
        long[] digits = new long[maxDigits];
        int index = 0; // Change long to int
        // Extract digits and store them in the array
        while (number != 0) {
            if (index < maxDigits) {
                digits[index] = number % 10; 
                // Get the last digit
                number /= 10; 
                // Remove the last digit
                index++;
            } else {
                // Increase the size of the array if maxDigits is reached
                // Increase maxDigits by 10
                maxDigits += 10; 
                // Create a new array with the new size
                long[] temp = new long[maxDigits];                 
                // Copy the existing digits to the new array
                for (int i = 0; i < digits.length; i++) { // Change long to int here
                    temp[i] = digits[i];
                }              
                digits = temp; 
            }
        }

        // Variables to store the largest and second largest digits
        long largest = -1;
        long secondLargest = -1;

        // Loop through the array to find the largest and second largest digits
        for (int i = 0; i < index; i++) { // Keep i as int
            if (digits[i] > largest) {
                secondLargest = largest; 
                largest = digits[i]; 
            } else if (digits[i] > secondLargest && digits[i] != largest) {
                secondLargest = digits[i]; 
            }
        }
        // Display the results
        if (largest != -1) {
            System.out.println("Largest digit: " + largest);
        } else {
            System.out.println("No digits found.");
        }
        if (secondLargest != -1) {
            System.out.println("Second largest digit: " + secondLargest);
        } else {
            System.out.println("No second largest digit found.");
        }
        scanner.close();
    }
}