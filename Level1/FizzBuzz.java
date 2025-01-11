import java.util.Scanner;
//create a class FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a positive integer: ");
		//Entering a positive number
        int number = scanner.nextInt();
        // Create a String array to store results with length number + 1
        String[] results = new String[number + 1];

        //Iterate from 1 to the number and store Fizz, Buzz, or FizzBuzz
        for (int i = 1; i <= number; i++) {
            if (i % 3 == 0 && i % 5 == 0) {
                results[i] = "FizzBuzz";
            } 
			else if (i % 3 == 0) {
                results[i] = "Fizz";
            } 
			else if (i % 5 == 0) {
                results[i] = "Buzz";
            } 
			else {
				// Store the number as a string
                results[i] = String.valueOf(i); 
            }
        }

        // Print the results
        for (int i = 1; i <= number; i++) {
            System.out.println("Position " + i + " = " + results[i]);
        }

        scanner.close();
    }
}