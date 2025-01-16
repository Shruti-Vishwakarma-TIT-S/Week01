import java.util.Scanner;
//create a class Substring
public class Substring{
    // Method to create a substring using charAt()
    public static String createSubstringUsingCharAt(String str, int start, int end) {
		// create object of substring class
        StringBuilder substring = new StringBuilder();
		//use loops
        for (int i = start; i < end-1; i++) {
			// append characters 
            substring.append(str.charAt(i));
        }
		// return substring 
        return substring.toString();
    }
	//create new method  without using charAt()
	public static String createSubstringUsingSubstring(String str, int start, int end){
		//store substring in sub variable 
		String sub = str.substring(start, end);
		return sub;
	}
	//use main method
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Taking user input
        System.out.println("Enter a two string: ");
        String str = sc.nextLine();
		//start value
        System.out.println("Enter the start index for the substring: ");
        int start = sc.nextInt();        
		//end value
        System.out.println("Enter the end index for the substring: ");
        int end = sc.nextInt();
		//call method
		String a = createSubstringUsingCharAt(str, start, end);
		String b = createSubstringUsingSubstring(str, start, end);
        
		//print output
        if (a.equals(b)) {
            System.out.println("Both substrings are equal.");
        } else {
            System.out.println("Both substrings are not equal.");
        }
        
        sc.close(); // Close the scanner
    }
}