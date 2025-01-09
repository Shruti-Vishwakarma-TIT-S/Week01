//import Scanner Class from Util Package
import java.util.Scanner;
//create class name YardsAndMiles
public class YardsAndMiles{
	public static void main(String[] args){
	
	//Initialize scanner class object
	Scanner input = new Scanner(System.in);
	
	System.out.println("Enter distance in feet: ");
	//take feet variable and take user input
	double distanceInFeet = input.nextDouble();
	
	//yards distance and miles distance
	double distanceInYards = distanceInFeet / 3; 
    double distanceInMiles = distanceInYards / 1760; 
	
	//print the output be like
	System.out.println("The total yards is " + distanceInYards+ " yards and miles "+ distanceInMiles+ " miles for the given feet "+ distanceInFeet);
	input.close();
	}
}