import java.util.Scanner;
//Create class name as PerimeterOfSquare
public class PerimeterOfSquare {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Take perimeter of a square value
        System.out.print("Enter the perimeter : ");
        double perimeter = scanner.nextDouble();
        

        //side of Suare
        double sideSquare = perimeter / 4;
        
        // Print the output be like
        System.out.println("The length of the side is "+ sideSquare+" whose perimeter is "+perimeter);
        // Close the scanner
        scanner.close();
    }
}