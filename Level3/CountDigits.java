import java.util.Scanner;
//create a CountDigits
public class CountDigits {
    public static void main(String[] agrs){
        
        Scanner input = new Scanner(System.in); 
        //enter a number
        System.out.println("Enter a number: ");
        int number = input.nextInt();       
        //Create a variable originalNumber 
        int originalNumber = number;
       //Create a variable count and initialize it to 0.
        int count = 0;

        // Count digits using a while loop
        while(number != 0){
           //if the number is not equal to zero, then we increment the count variable by 1.
            count = count + 1;   
		   //now the number will get short by one digit
            number = number / 10;
        }
        //print the count and originalNumber variable.
        System.out.println("There are "+count+" digits in a number "+originalNumber);
        
        
    }
}
