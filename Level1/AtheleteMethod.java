import java.util.Scanner;
//create a class AtheleteMethod
public class AtheleteMethod{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        // Enter size of sides of triangular park
        System.out.println("Enter the length of three sides :");
        double side1 = input.nextDouble();
        double side2 = input.nextDouble();
        double side3 = input.nextDouble();
		//create a object for AtheleteMethod
		AtheleteMethod athlete = new AtheleteMethod();
        //create answer variable to store rounds value
		double answer = athlete.findRounds(side1, side2, side3);
        // Output the total number of rounds
        System.out.printf("The total number of rounds the athlete will run is "+ answer + " to complete 5 km");
		input.close();
	}	
		//create another method findRounds
		public double findRounds(double side1, double side2, double side3){
		//perimeter of the triangle
        double perimeter = side1 + side2 + side3;
		// Conversion of 5 km to meters -> 1 km = 1000m; 
        double distanceInMeters = 5 * 1000;
		// Calculate the number of rounds
		int rounds = (int)(distanceInMeters / perimeter);
		
		return rounds;
	}	 
}