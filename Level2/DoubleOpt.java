import java.util.Scanner;
//Create Class name DoubleOpt
public class DoubleOpt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter value for a, b, c: ");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        // To understand operator precedence solve these statements
        double resultOne = a + b * c;
        double resultTwo = a * b + c;
        double resultThree = c + a / b;
        double resultFour = a % b + c;

        // Printing the results
        System.out.println("The results of Int Operations are: "+ resultOne+ ", "+resultTwo+ " and "+resultThree);
        input.close();
    }
}
