import java.util.Scanner;
// Create class GcdAndLcmCalculator
public class GcdAndLcmCalculator { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get two numbers from the user
        System.out.print("Enter the first number: "); 
        int num1 = sc.nextInt(); 
        System.out.print("Enter the second number: "); 
        int num2 = sc.nextInt(); 
        // Call method to calculate GCD
        int gcd = calculateGCD(num1, num2); 
        // Call method to calculate LCM
        int lcm = calculateLCM(num1, num2, gcd); 
        // Display the results
        System.out.println("GCD of " + num1 + " and " + num2 + " is: " + gcd); 
        System.out.println("LCM of " + num1 + " and " + num2 + " is: " + lcm); 
        // Close the scanner object
        sc.close(); 
    }

    // Method to calculate the Greatest Common Divisor (GCD)
    public static int calculateGCD(int a, int b) { 
        while (b != 0) { 
            int temp = b; 
            b = a % b; 
            a = temp; 
        } 
        return a; 
    }

    // Method to calculate the Least Common Multiple (LCM)
    public static int calculateLCM(int a, int b, int gcd) { 
        return (a * b) / gcd; 
    }
}
