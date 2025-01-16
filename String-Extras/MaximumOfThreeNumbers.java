import java.util.Scanner;
// Create class MaximumOfThreeNumbers
public class MaximumOfThreeNumbers { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get three numbers from the user
        int num1 = getInput(sc, "Enter the first number: "); 
        int num2 = getInput(sc, "Enter the second number: "); 
        int num3 = getInput(sc, "Enter the third number: "); 
        // Call method to find the maximum number
        int max = findMax(num1, num2, num3); 
        // Display the maximum number
        System.out.println("The maximum of the three numbers is: " + max); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to take user input for a number
    public static int getInput(Scanner sc, String prompt) { 
        System.out.print(prompt); 
        return sc.nextInt(); 
    }

    // Method to find the maximum of three numbers
    public static int findMax(int num1, int num2, int num3) { 
        int max = num1; 
        if (num2 > max) { 
            max = num2; 
        } 
        if (num3 > max) { 
            max = num3; 
        } 
        return max; 
    }
}
