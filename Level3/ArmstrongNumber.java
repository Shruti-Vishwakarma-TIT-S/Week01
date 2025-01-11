import java.util.Scanner;
// create a ArmstrongNumber class 
public class ArmstrongNumber {
    public static void main(String[] agrs){
		
        Scanner input = new Scanner(System.in); 
        // enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt(); 
        // Create a variable of originalNumber 
        int originalNumber = number;
        //take a variable sum and initialize it to 0.
        int sum = 0;

        // Compute Armstrong using a while loop 
        while(number != 0){
            int remainder = number % 10;

            //find the cube of the of the remainder and add to sum of the variable
            sum = sum + (int)Math.pow(remainder,3);
            number = number / 10;
        }
        //check the condition and print the values
        if(originalNumber == sum){
            //if this condition is true,then print 
            System.out.println("The number "+originalNumber+" is an Armstrong number");
        }
		else{
            //if this condition is false,then print 
            System.out.println("The number "+originalNumber+" is not an Armstrong number");
        }
    }
}


