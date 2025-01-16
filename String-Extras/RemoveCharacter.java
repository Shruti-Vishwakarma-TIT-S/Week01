import java.util.Scanner;
// Create class RemoveCharacter
public class RemoveCharacter { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for input string
        System.out.print("Enter the string: "); 
        String input = sc.nextLine(); 
        // Ask user for the character to remove
        System.out.print("Enter the character to remove: "); 
        char charToRemove = sc.next().charAt(0); 
        // Call method to remove the character
        String modifiedString = removeCharacter(input, charToRemove); 
        // Display the modified string
        System.out.println("Modified String: " + modifiedString); 
        // Close the scanner object to avoid memory leaks
        sc.close(); 
    }
    // Method to remove all occurrences of the specified character
    public static String removeCharacter(String input, char charToRemove) { 
        // Create a StringBuilder to store the result
        StringBuilder result = new StringBuilder(); 
        // Loop through the string and append characters that don't match
        for (int i = 0; i < input.length(); i++) { 
            if (input.charAt(i) != charToRemove) { 
                result.append(input.charAt(i)); 
            } 
        } 
        // Return the modified string
        return result.toString(); 
    }
}
