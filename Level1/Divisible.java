import java.util.Scanner;
//create class Divisible
public class Divisible {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter a number
        System.out.println("Enter the number: ");
        int number = input.nextInt();
        
        // To find divisibility of number
        int divisibility = number % 5;

        // using if else statements
		//check whether number is divisible by 5 or not
		if(divisibility == 0)
        System.out.println("Is the number "+ number +" divisible by 5? "+ "YES");
		//if above condition fails this will get printed out 
		else
		System.out.println("Is the number "+ number +" divisible by 5? "+ "NO");	
	
		input.close();
    }
}
