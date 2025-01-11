import java.util.Scanner;
//create class Smallest
public class Smallest {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number number1, number2, number3
        System.out.println("Enter three numbers: ");
        int number1 = input.nextInt();
		int number2 = input.nextInt();
		int number3 = input.nextInt();
        
        // To find number1 is smaller than number2 and number3
        boolean yes = number1 < number2 && number1 < number3;

        // using if else statements
		//check whether number1 is smallest from other two
		if(yes)
        System.out.println("Is the first number the smallest? YES");
		//if above condition fails this will get printed out 
		else
		System.out.println("Is the first number the smallest? NO");	
	
		input.close();
    }
}
