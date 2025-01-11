import java.util.Scanner;
//create class IntegerCheck
public class IntegerCheck {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter number
        System.out.println("Enter a number: ");
        double number = input.nextDouble();
        

        // using if else statements
		//check whether number is positive, negative or zero
		if(number > 0)
        System.out.println("Positive");
		//if above condition fails this will get printed out 
		else if(number < 0)
		System.out.println("Negative");	
		//if above statements are false the else will be executed
		else
		System.out.println("Zero");
		input.close();
    }
}
