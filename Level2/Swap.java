import java.util.Scanner;
//create Swap Class
public class Swap {
    public static void main(String[] args) {
	//take user input
		Scanner input = new Scanner(System.in);
        int number1 = input.nextInt();
        int number2 = input.nextInt();

        // Swapping using addition and subtraction i.e. without using third variable
        number1 = number1 + number2; 
        number2 = number1 - number2;  
        number1 = number1 - number2;  

        System.out.println("The swapped numbers are "+ number1 +" and "+ number2);
    }
}