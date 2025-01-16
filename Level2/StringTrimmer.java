import java.util.Scanner;
//create a class StringTrimmer 
public class StringTrimmer {
    // Method to trim leading and trailing spaces from a string
    public static int[] trimSpaces(String str) {
        int start = 0;
        int end = str.length() - 1;
        // Find the first non-space character
        while (start <= end && str.charAt(start) == ' ') {
            start++;
        }
        // Find the last non-space character
        while (end >= start && str.charAt(end) == ' ') {
            end--;
        }
		// Return the start and end indices
        return new int[]{start, end}; 
    }
    // Method to create a substring using charAt() method
    public static String createSubstring(String str, int start, int end) {
        StringBuilder substring = new StringBuilder();
        for (int i = start; i <= end; i++) {
			// Append each character to the substring
            substring.append(str.charAt(i)); 
        }
		// Return the substring
        return substring.toString(); 
    }
    // Method to compare two strings using charAt() method
    public static boolean compareStrings(String str1, String str2) {
        if (str1.length() != str2.length()) {
			// If lengths are not equal, return false
            return false; 
        }
        for (int i = 0; i < str1.length(); i++) {
            if (str1.charAt(i) != str2.charAt(i)) {
				// Return false if any character does not match
                return false; 
            }
        }
		// Return true if all characters match
        return true; 
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in); 
        // Taking user input
        System.out.println("Enter a string with leading and trailing spaces: ");
        String inputString = sc.nextLine(); // Read the complete line of text
        // Trim leading and trailing spaces
        int[] indices = trimSpaces(inputString);
        String trimmedString = createSubstring(inputString, indices[0], indices[1]);
        // Use the built-in trim() method
        String builtInTrimmedString = inputString.trim();
        // Compare the two trimmed strings
        boolean areEqual = compareStrings(trimmedString, builtInTrimmedString);
        // Display the results
        System.out.println("Trimmed String (using charAt): '" + trimmedString + "'");
        System.out.println("Trimmed String (using built-in trim): '" + builtInTrimmedString + "'");
        System.out.println("Are both trimmed strings equal? " + areEqual);
        sc.close(); // Close the scanner
    }
}