import java.util.Scanner;
//create a class StringLength
public class StringLength {
    // Method to find and return the length of a string without using length() method
    public static int findStringLength(String str) {
        int count = 0;
        try {
            // Infinite loop to count characters
            while (true) {
				// Accessing each character
                str.charAt(count);
				// Increment count for each character				
                count++; 
            }
        } catch (StringIndexOutOfBoundsException e) {
            // Catch the exception when the index is out of bounds
            // Return the count of characters
            return count; 
        }
    }
	//Main method to execute the code initially
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);  
        // Taking user input
        System.out.println("Enter a string: ");
		// Using nextLine() to take a input
        String input= sc.nextLine();         
        // Call the user-defined method to find the length
        int customLength = findStringLength(input);
        // Call the built-in length() method to find the length
        int builtInLength = input.length();
        // Display the results
        System.out.println("Custom Length: " + customLength);
        System.out.println("Built-in Length: " + builtInLength);
        
        sc.close(); // Close the scanner
    }
}