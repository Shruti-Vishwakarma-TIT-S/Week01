import java.util.Scanner;
//create a class Athelete
public class Athelete{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter size of sides of triangular park
        System.out.println("Enter the length of three sides :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();

        //perimeter of the triangle
        double perimeter = side1 + side2 + side3;

        // Conversion of 5 km to meters -> 1 km = 1000m; 
        double distanceInMeters = 5 * 1000;

        // Calculate the number of rounds
        double rounds = distanceInMeters / perimeter;

        // Output the total number of rounds
        System.out.printf("The total number of rounds the athlete will run is "+ rounds + " to complete 5 km");

        input.close();
    }
}