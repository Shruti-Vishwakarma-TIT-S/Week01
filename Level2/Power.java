import java.util.Scanner;
//create a class Power
public class Power {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Enter the base number and the power
        System.out.println("Enter the base number and exponent: ");
        int number = sc.nextInt();
        int power = sc.nextInt();
        // take the result variable as 1 otherwise it will always give 0
        int result = 1;
        // Calculate the power using a loop
        for (int i = 1; i <= power; i++) {
            //result = result * number
			result *= number; 
        }
		// Print the result
        System.out.println(number + " ^ " + power + " is: " + result);

        // Close the scanner
        sc.close();
    }
}