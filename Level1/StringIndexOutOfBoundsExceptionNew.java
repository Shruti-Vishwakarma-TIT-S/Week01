import java.util.Scanner;
//create class StringIndexOutOfBoundsExceptionNew
public class StringIndexOutOfBoundsExceptionNew {
    // Method to generate StringIndexOutOfBoundsException
    public static void generateStringIndexOutOfBoundsException(String str) {
        // Attempting to access an index beyond the length of the string
		// This will throw StringIndexOutOfBoundsException
        System.out.println("Accessing character at index 100: " + str.charAt(100)); 
    }
    // Method to demonstrate handling of StringIndexOutOfBoundsException
    public static void handleStringIndexOutOfBoundsException(String str) {
        try {
            // Attempting to access an index beyond the length of the string
			// This will throw StringIndexOutOfBoundsException
            System.out.println("Accessing character at index 100: " + str.charAt(100)); 
        } 
		catch (StringIndexOutOfBoundsException e) {
            // Handle the exception
            System.out.println("Caught a StringIndexOutOfBoundsException: " + e.getMessage());
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);        
        // Taking user input
        System.out.println("Enter a string: ");
        String inputString = sc.nextLine();  
        // Call the method to generate the exception
        System.out.println("\nDemonstrating StringIndexOutOfBoundsException:");
        try {
			//This will cause the program to crash
            generateStringIndexOutOfBoundsException(inputString); 
        } 
		catch (StringIndexOutOfBoundsException e) {
            System.out.println("Caught a StringIndexOutOfBoundsException : " + e.getMessage());
        }
        // Call the method to handle the exception
        System.out.println("\nHandling StringIndexOutOfBoundsException:");
		// This will catch the exception and handle it
        handleStringIndexOutOfBoundsException(inputString); 
        sc.close(); // Close the scanner
    }
}