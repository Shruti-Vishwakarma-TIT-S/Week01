//import Scanner Class from Util Package
import java.util.Scanner;
//create class name HeightConversion
public class HeightConversion{
	public static void main(String[] args){
	
	//Initialize scanner class object
	Scanner input = new Scanner(System.in);
	
	//take height variable and take user input
	System.out.println("Enter height in cms: ");
	double height = input.nextDouble();
	
	//take height in feet and inches
	
	double heightInches = (1/2.54)* height;
	double heightFeet = (1/12.0) * heightInches;
	
	//print the output be like
	System.out.println("Your Height in cm is "+height+" while in feet is "+heightFeet+ " and inches is "+ heightInches);
	input.close();
	}
}