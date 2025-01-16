import java.util.Scanner;
//create a class SimpleInterestMethod
public class SimpleInterestMethod{
	//main method
	public static void main(String[] args){
	//scanner class object is created
	Scanner sc = new Scanner(System.in);
	//Enter the following details
	System.out.println("Enter details like principal, rate, time(in years): ");
	double principal = sc.nextDouble();		//pricipal amount
	double rate = sc.nextDouble();			//rate in percent
	double time = sc.nextDouble();			//time in years
	
	//in simpleinterestCalculate method is called using class name
	double interest = SimpleInterestMethod.interestCalculate(principal, rate, time);
	
	//Print the Simple Interest by computing the formula below
	System.out.println("The Simple Interest is "+interest +" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
}
	//method to calculate simple interest
	public static double interestCalculate(double principal, double rate, double time){
	//Calculate the SI value here
	double simpleInterest = (principal * rate * time) / 100;
	//return simpleInterest to main
	return simpleInterest;
	}
}
