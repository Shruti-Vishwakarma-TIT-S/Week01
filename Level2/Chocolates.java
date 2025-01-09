import java.util.Scanner;
//create class Chocolates
public class Chocolates {
    public static void main(String[] args) {
        // Initialize scanner object
        Scanner sc = new Scanner(System.in);

        // User will provide the values
        System.out.print("Enter the number of chocolates and number of children ");
        int numberOfChocolates = sc.nextInt();
        int numberOfChildren = sc.nextInt();

        //To calculate chocolates distribution per child and remaining chocolates
        int chocolatesPerChild = numberOfChocolates / numberOfChildren;
        int remainingChocolates = numberOfChocolates % numberOfChildren;

        //Displaying results
        System.out.println("The number of chocolates each child gets is "+ chocolatesPerChild+ " and the number of remaining chocolates are " + remainingChocolates);
        sc.close();
    }
}