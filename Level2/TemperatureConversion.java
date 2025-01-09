
import java.util.Scanner;
//Create class TemperatureConversion
public class TemperatureConversion{
	public static void main(String[] args){
		
	System.out.println("Enter temperature in Celsius ");
	Scanner sc = new Scanner(System.in);

	//Take celcius and farhrenheitResult in double
	double celsius = sc.nextDouble();
	double fahrenheitResult = (celsius * (9.0/5.0))+32;

	//Print result 
	System.out.print("The "+ celsius + " celsius is " +  fahrenheitResult + " fahrenheit");
	}
}