import java.util.Scanner;
//Create Class name IntOperation
public class IntOperation {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Taking input from the user
        System.out.print("Enter value for a, b, c: ");
        int a = input.nextInt();
        int b = input.nextInt();
        int c = input.nextInt();

        // To understand operator precedence solve these statements
        int resultOne = a + b * c;
        int resultTwo = a * b + c;
        int resultThree = c + a / b;
        int resultFour = a % b + c;

        // Printing the results
        System.out.println("The results of Int Operations are: "+ resultOne+ ", "+resultTwo+ " and "+resultThree);
       input.close();
    }
}
