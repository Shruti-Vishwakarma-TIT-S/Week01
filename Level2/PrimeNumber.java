import java.util.Scanner;
//create class PrimeNumber
public class PrimeNumber {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter the number
        System.out.println("Enter a number: ");
        int number = scanner.nextInt();

        // boolean variable to store if the number is prime
        boolean isPrime = true;

        // Check if the number is greater than 1
        if (number <= 1) {
            isPrime = false;
        } else {
            // Loop from 2 to number/2
            for (int i = 2; i <= number / 2; i++) {
                // If the number is divisible by any number other than 1 and itself
                if (number % i == 0) {
                    isPrime = false;
                    break; // Exit the loop
                }
            }
        }

        // print the result
        if (isPrime) {
            System.out.println(number + " is a prime number.");
        } else {
            System.out.println(number + " is not a prime number.");
        }

        scanner.close();
    }
}