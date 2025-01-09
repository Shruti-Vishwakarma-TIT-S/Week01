//import Scanner Class from Util Package
import java.util.Scanner;
//create class name PoundsToKilograms
public class PoundsToKilograms{
	public static void main(String[] args){
	
	//Initialize scanner class object
	Scanner input = new Scanner(System.in);
	System.out.println("Enter weight in pounds ");
	
	//take weight in pounds
	double weight = input.nextDouble();
	
	//take kilograms as variable name kilograms 
	double kilograms = weight * 2.2;
	
	//print the output be like
	System.out.println("The weight of the person in pound is "+ weight + " and in kg is "+ kilograms);
	input.close();
	}
}