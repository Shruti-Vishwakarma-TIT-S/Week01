import java.util.Scanner;
//Create class name as Price
public class Price {
        public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Take unit price and quantity from user
        System.out.print("Enter the unit price: ");
        double unitPrice = scanner.nextDouble();
        System.out.print("Enter the quantity : ");
        double quantity = scanner.nextDouble();
		
		//calculate totalPrice here
        double totalPrice = unitPrice * quantity;

        // Print the output be like
        System.out.println("The total purchase price is INR " + totalPrice+ " if the quantity "+ quantity+ " and unit price is INR "+ unitPrice);
        // Close the scanner
        scanner.close();
    }
}