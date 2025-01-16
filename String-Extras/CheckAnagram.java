import java.util.Scanner;
// Create class CheckAnagram
public class CheckAnagram { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Ask user for the first string
        System.out.print("Enter the first string: "); 
        String str1 = sc.nextLine(); 
        // Ask user for the second string
        System.out.print("Enter the second string: "); 
        String str2 = sc.nextLine(); 
        // Call method to check if the strings are anagrams
        boolean result = areAnagrams(str1, str2); 
        if (result) { 
            System.out.println("The strings are anagrams."); 
        } else { 
            System.out.println("The strings are not anagrams."); 
        } 
        // Close the scanner object to avoid memory leaks
        sc.close(); 
    }
    // Method to check if two strings are anagrams
    public static boolean areAnagrams(String str1, String str2) { 
        // If lengths are different, they cannot be anagrams
        if (str1.length() != str2.length()) { 
            return false; 
        } 
        // Convert strings to char arrays
        char[] arr1 = str1.toCharArray(); 
        char[] arr2 = str2.toCharArray(); 
        // Sort both arrays
        java.util.Arrays.sort(arr1); 
        java.util.Arrays.sort(arr2); 
        // Return true if the sorted arrays are equal
        return java.util.Arrays.equals(arr1, arr2); 
    }
}
