import java.util.Scanner;
// create a class NumberFormatExceptionNew
public class NumberFormatExceptionNew {
    // Method to generate NumberFormatException
    public static void generateNumberFormatException(String text) {
        // Attempting to parse a non-numeric string
        System.out.println("Generating NumberFormatException:");
		// This will throw NumberFormatException if text is not a valid integer
        int number = Integer.parseInt(text); 
        System.out.println("Parsed number: " + number);
    }
    // Method to demonstrate handling of NumberFormatException
    public static void handleNumberFormatException(String text) {
        try {
            // Attempting to parse a non-numeric string
            System.out.println("Handling NumberFormatException:");
			 // This will throw NumberFormatException if text is not a valid integer
            int number = Integer.parseInt(text);
            System.out.println("Parsed number: " + number);
        } catch (NumberFormatException e) {
            // Handle the NumberFormatException
            System.out.println("Caught a NumberFormatException: " + e.getMessage());
        } catch (RuntimeException e) {
            // Handle any other RuntimeException
            System.out.println("Caught a RuntimeException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);       
        // Taking user input
        System.out.println("Enter a string to parse as an integer: ");
        String inputString = sc.nextLine();       
        // Call the method to generate the exception
        System.out.println("Demonstrating NumberFormatException:");
		// This will cause the program to crash if input is invalid
        try {
            generateNumberFormatException(inputString); 
        } 
		catch (NumberFormatException e) {
            System.out.println("Caught a NumberFormatException during demonstration: " + e.getMessage());
        } 
		catch (RuntimeException e) {
            System.out.println("Caught a RuntimeException during demonstration: " + e.getMessage());
        }
        // Call the method to handle the exception
        System.out.println("\nHandling NumberFormatException:");
		// This will catch the exception and handle it
        handleNumberFormatException(inputString); 
        sc.close(); // Close the scanner
    }
}