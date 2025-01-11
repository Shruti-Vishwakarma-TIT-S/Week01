import java.util.Scanner;
// Create a class HarshadNumber
public class HarshadNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        // enter a number 
        System.out.print("Enter a number: ");
        int number = input.nextInt(); 
        // Create a variable to store the sum of digits
        int sum = 0; 
        int originalNumber = number;
		
        //create a while loop to access each digit of the number
        while (number > 0) {
            // store the last digit of the number
            int digit = number % 10; 
			//add digit to sum
            sum += digit; 
			//omit the last digit
            number = number / 10; 
        }

        // Check if the original number is divisible by the sum of its digits
        if (originalNumber % sum == 0) {
            // If the number is divisible by the sum of digits, it's a Harshad number
            System.out.println("Harshad Number");
        } 
		else {
            // If the number is not divisible by the sum of digits, it's not a Harshad number
            System.out.println("Not a Harshad Number");
        }
    }
}
