import java.util.Scanner;
// Create class ToggleCase
public class ToggleCase { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user to enter a string
        System.out.print("Enter a string: "); 
        String input = sc.nextLine(); 
        // Call method to toggle case of the string
        String toggledString = toggleCase(input); 
        // Display the string after toggling the case
        System.out.println("Toggled Case String: " + toggledString); 
        // Close the scanner object to avoid memory leak
        sc.close(); 
    }
    // Method to toggle the case of each character in the string
    public static String toggleCase(String input) { 
        // Create an empty string to store the result
        StringBuilder result = new StringBuilder(); 
        // Loop through each character of the input string
        for (int i = 0; i < input.length(); i++) { 
            // Get the character at the current index
            char ch = input.charAt(i); 
            // If character is uppercase, convert to lowercase
            if (Character.isUpperCase(ch)) { 
                result.append(Character.toLowerCase(ch)); 
            } else { 
                result.append(Character.toUpperCase(ch)); // If lowercase, convert to uppercase
            } 
        } 
        // Return the toggled case string
        return result.toString(); 
    }
}
