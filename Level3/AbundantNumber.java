import java.util.Scanner;
// Create AbundantNumber class 
public class AbundantNumber {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        //enter a number to check if it's an abundant number
        System.out.println("Enter a number: ");
        int number = input.nextInt(); 
        int sum = 0; 
		
        //Run a for loop to find divisors of the number
        for (int i = 1; i < number; i++) { 
		
            // Check if condition
            if (number % i == 0) { 
				//if i divides number completely then add it to sum variable
                sum += i; 
            }
        }

        //print if the condition is true else print else statement
        if (sum > number) {
            System.out.println(number +" is Abundant Number");
        } 
		else {
            System.out.println(number + " is not an Abundant Number");
        }
    }
}
