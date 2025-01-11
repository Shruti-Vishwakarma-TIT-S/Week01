import java.util.Scanner;
//create a Calculator class 
public class Calculator{
    public static void main(String[] agrs){
        Scanner input = new Scanner(System.in); 
        //enter first number
        System.out.println("Enter a two numbers: ");
        double first = input.nextDouble(); 
        double second = input.nextDouble(); 
        //enter the operator sign and store it in the op variable.
        System.out.println("Enter operator sign: ");
        String op = input.next(); // Read the number entered by the user        
        //Create the result variable and store the final result.
        double result;
		
        //Write the switch case for doing the operation Addition, Subtraction, Multiplication and Division
        switch(op){
				case "+":
                result = first + second;
                System.out.println("The addition of two number "+first+" and "+second+" is "+result);
                break;
                
				case "-":
                result = first - second;
                System.out.println("The subtraction of two number "+first+" and "+second+" is "+result);
                break; 
				
				case "*":
                result = first * second;
                System.out.println("The multipication of two number "+first+" and "+second+" is "+result);
                break; 
				
				case "/":
                result = first / second;
                System.out.println("The division of two number "+first+" and "+second+" is "+result);
                break; 

				default:
                System.out.println("Invalid Operator");
                break; 
        }
        
        
    }
}
