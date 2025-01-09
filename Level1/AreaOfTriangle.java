import java.util.Scanner;
//Create class name as AreaOfTriangle
public class AreaOfTriangle {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);

        // Take base and height values from user
        System.out.print("Enter the base value: ");
        double base = scanner.nextDouble();
        System.out.print("Enter the height value : ");
        double height = scanner.nextDouble();
		
		//calculate areaOfTraingle here
        double areaTriangle = (1/2.0)* base * height;

        // Print the output be like
        System.out.println("Area of triangle whose base "+base+ " and height is "+areaTriangle);
        // Close the scanner
        scanner.close();
    }
}