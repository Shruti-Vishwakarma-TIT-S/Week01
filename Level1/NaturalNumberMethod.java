import java.util.Scanner;
//craete a class name NaturalNumberMethod
public class NaturalNumberMethod {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        // Take a number from the user
        System.out.println("Enter a natural number: ");
        int number = sc.nextInt();
		//create a natural object of class
		NaturalNumberMethod natural = new NaturalNumberMethod();
		//method call
		int num = natural.naturalNumber(number);
		
		// Output the result for if statement if it is true
        System.out.println("The sum of " + number + " natural numbers is " + num);
        // Close the scanner
        sc.close();
    }
	public int naturalNumber(int number){
            // Calculate the sum of n natural numbers
			//Convert floating point values in integer
            int n = (int) number;
            int sum = n * (n + 1) / 2;
			//return sum
			return sum;
		
	}	
}