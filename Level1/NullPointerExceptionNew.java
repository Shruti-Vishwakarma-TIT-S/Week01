//crerate a class NullPointerExceptionNew
public class NullPointerExceptionNew {
    // Method to generate NullPointerException
    public static void generateNullPointerException() {
        String text = null; // Initialize the variable to null
        // This will throw NullPointerException
		// Attempting to access length of a null string
        System.out.println("Length of text: " + text.length()); 
    }
    // Method to demonstrate handling of NullPointerException
    public static void handleNullPointerException() {
        String text = null; // Initialize the variable to null
        try {
            // Attempting to access a method on a null string
			// This will throw NullPointerException
            System.out.println("Length of text: " + text.length()); 
        } 
		catch (NullPointerException e) {
            // Handle the exception
            System.out.println("Caught a NullPointerException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        // Call the method to generate the exception
        System.out.println("Demonstrating NullPointerException:");
        try {
            generateNullPointerException(); 
			// This will cause the program to crash
        } 
		catch (NullPointerException e) {
            System.out.println("Caught a NullPointerException during demonstration: " + e.getMessage());
        }
        // Refactor the code to handle the exception
        System.out.println("\nHandling NullPointerException:");
		// This will catch the exception and handle it
        handleNullPointerException(); 
    }
}