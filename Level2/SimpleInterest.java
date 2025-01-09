import java.util.Scanner;
//create a class SimpleInterest
public class SimpleInterest{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//Enter the following details
	System.out.println("Enter details like principal, rate, time(in years): ");
	double principal = sc.nextDouble();
	double rate = sc.nextDouble();
	double time = sc.nextDouble();
	
	//Print the Simple Interest by computing the formula below
	double SI = (principal * rate * time) / 100;
	System.out.println("The Simple Interest is "+SI+" for Principal "+principal+", Rate of Interest "+rate+" and Time "+time);
}
}
