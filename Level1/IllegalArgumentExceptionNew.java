import java.util.Scanner;
// create a  class IllegalArgumentExceptionNew
public class IllegalArgumentExceptionNew {
    // Method to generate IllegalArgumentException
    public static void generateIllegalArgumentException(String str) {
        // Attempting to call substring with start index greater than end index
        System.out.println("Generating IllegalArgumentException:");
		// This will throw IllegalArgumentException
        String result = str.substring(5, 2); 
        System.out.println("Substring: " + result);
    }
    // Method to demonstrate handling of IllegalArgumentException
    public static void handleIllegalArgumentException(String str) {
        try {
            // Attempting to call substring with start index greater than end index
            System.out.println("Handling IllegalArgumentException:");
            String result = str.substring(5, 2); // This will throw IllegalArgumentException
            System.out.println("Substring: " + result);
        } catch (IllegalArgumentException e) {
            // Handle the IllegalArgumentException
            System.out.println("Caught an IllegalArgumentException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
	// Main method 
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();       
        // Call the method to generate the exception
        System.out.println("Demonstrating IllegalArgumentException:");
        try {
            generateIllegalArgumentException(inputString); // This will cause the program to crash
        } catch (IllegalArgumentException e) {
            System.out.println("Caught an IllegalArgumentException during demonstration: " + e.getMessage());
        } catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException during demonstration: " + e.getMessage());
        }
        // Call the method to handle the exception
        System.out.println("\nHandling IllegalArgumentException:");
		// This will catch the exception and handle it
        handleIllegalArgumentException(inputString); 
        // Close the scanner
        sc.close(); 
    }
}