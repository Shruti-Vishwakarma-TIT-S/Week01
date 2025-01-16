import java.util.Scanner;
// Create class PrimeNumberChecker
public class PrimeNumberChecker { 
    public static void main(String[] args) { 
        // Create scanner object for user input
        Scanner sc = new Scanner(System.in); 
        // Get the number from the user
        System.out.print("Enter a number to check if it's prime: "); 
        int number = sc.nextInt(); 
        // Call method to check if the number is prime
        boolean isPrime = checkPrime(number); 
        // Display the result
        if (isPrime) { 
            System.out.println(number + " is a prime number."); 
        } else { 
            System.out.println(number + " is not a prime number."); 
        } 
        // Close the scanner object
        sc.close(); 
    }

    // Method to check if a number is prime
    public static boolean checkPrime(int number) { 
        // If number is less than 2, it's not prime
        if (number < 2) { 
            return false; 
        } 
        // Check divisibility by numbers from 2 to the square root of the number
        for (int i = 2; i <= Math.sqrt(number); i++) { 
            if (number % i == 0) { 
                return false; 
            } 
        } 
        return true; // Number is prime if no divisors were found
    }
}
