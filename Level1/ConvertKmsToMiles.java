//import Scanner Class from Util Package
import java.util.Scanner;
//create class name ConvertKmsToMiles
public class ConvertKmsToMiles{
	public static void main(String[] args){
	
	//Initialize scanner class object
	Scanner input = new Scanner(System.in);
	
	//take kilometers as km variableand take user input
	double km = input.nextDouble();
	
	//take miles as variable and assign km * 1.6
	double miles = km * 1.6;
	
	//print the output be like
	System.out.println("The total miles is " + miles+ " mile for the given km "+ km);
	input.close();
	}
}