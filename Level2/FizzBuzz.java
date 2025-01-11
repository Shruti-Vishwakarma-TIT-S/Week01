import java.util.Scanner;
//create a class FizzBuzz
public class FizzBuzz {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        //Enter number 
        System.out.println("Enter a integer : ");
        int number = scanner.nextInt();

        // to check if the input is a positive integer
        if (number < 0) {
            System.out.println("Please enter a positive integer.");
        } else {
            // Loop from 0 to the entered number name 'number'
            for (int i = 1; i <= number; i++) {
                // Check for multiples of 3 and 5
                if (i % 3 == 0 && i % 5 == 0) {
                    System.out.println("FizzBuzz");
                } 
				else if (i % 3 == 0) {
                    System.out.println("Fizz");
                } 
				else if (i % 5 == 0) {
                    System.out.println("Buzz");
                } 
				else {
                    System.out.println("Not a multiple of 3 or 5 " + i);
                }
            }
        }

        // Close the scanner
        scanner.close();
    }
}