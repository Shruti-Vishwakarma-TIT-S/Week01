import java.util.Scanner;
// Create class CompareStrings
public class CompareStrings { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for the first string
        System.out.print("Enter the first string: "); 
        String str1 = sc.nextLine(); 
        // Ask user for the second string
        System.out.print("Enter the second string: "); 
        String str2 = sc.nextLine(); 
        // Call method to compare the strings lexicographically
        compareStrings(str1, str2); 
        // Close the scanner object to avoid memory leak
        sc.close(); 
    }
    // Method to compare two strings lexicographically
    public static void compareStrings(String str1, String str2) { 
        // Find the shorter length to avoid index out of bounds
        int length = Math.min(str1.length(), str2.length()); 
        // Loop through the characters of both strings
        for (int i = 0; i < length; i++) { 
            // If a character of str1 is smaller than str2, str1 comes first
            if (str1.charAt(i) < str2.charAt(i)) { 
                System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"."); 
                return; 
            } else if (str1.charAt(i) > str2.charAt(i)) { 
                // If a character of str1 is greater than str2, str1 comes after
                System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"."); 
                return; 
            } 
        } 
        // If the strings are equal length, check for equality
        if (str1.length() < str2.length()) { 
            System.out.println("\"" + str1 + "\" comes before \"" + str2 + "\"."); 
        } else if (str1.length() > str2.length()) { 
            System.out.println("\"" + str1 + "\" comes after \"" + str2 + "\"."); 
        } else { 
            System.out.println("Both strings are equal."); 
        } 
    }
}
