
import java.util.Scanner;
//Create class ConversionFToC
public class ConversionFToC{
	public static void main(String[] args){
		
	System.out.println("Enter temperature in Fahrenheit ");
	Scanner sc = new Scanner(System.in);

	//Take farhrenheit and celciusResult in double
	double fahrenheit = sc.nextDouble();
	double celsiusResult = (fahrenheit - 32) * (5/9.0);

	//Print result 
	System.out.print("The "+ fahrenheit + " fahrenheit is " +  celsiusResult + " celsius");
	}
}