import java.util.Scanner;
//create a class GreatestFactor
public class GreatestFactor {

    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);

        // take a number as input
        System.out.println("Enter an integer: ");
        int number = sc.nextInt();
        // Initialize the greatestFactor variable
        int greatestFactor = 1;
        // Loop to find the greatest factor (other than the number itself)
		for (int i = number - 1; i >= 1; i--) {
            if (number % i == 0) { 
                greatestFactor = i; 
                //break the loop
				break; 
            }
        }

        //Print the greatest factor
        System.out.println("The greatest factor of " + number + " is: " + greatestFactor);

        sc.close();
    }
}