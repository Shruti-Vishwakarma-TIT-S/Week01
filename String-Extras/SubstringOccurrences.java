import java.util.Scanner;
// Create class SubstringOccurrences
public class SubstringOccurrences { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for the main string and the substring to find
        System.out.print("Enter the main string: "); 
        String mainString = sc.nextLine(); 
        // Ask user for the substring to search
        System.out.print("Enter the substring to find: "); 
        String substring = sc.nextLine(); 
        // Call method to count occurrences of the substring
        int count = countSubstringOccurrences(mainString, substring); 
        // Display the result
        System.out.println("The substring occurs " + count + " times."); 
        // Close the scanner object to prevent memory leaks
        sc.close(); 
    }
    // Method to count how many times the substring occurs in the main string
    public static int countSubstringOccurrences(String mainString, String substring) { 
        // Initialize the count to 0
        int count = 0; 
        // Loop through the main string
        for (int i = 0; i <= mainString.length() - substring.length(); i++) { 
            // Check if the substring matches the part of the string
            if (mainString.substring(i, i + substring.length()).equals(substring)) { 
                count++; // Increment the count
            } 
        } 
        // Return the count of occurrences
        return count; 
    }
}
