import java.util.Scanner;
//create class name CourseDiscountUser
public class CourseDiscountUser{
	public static void main(String[] args){
		
	Scanner sc = new Scanner(System.in);	
	//take fee variable
	double fee = sc.nextDouble();
	
	//take variable discountPercent
	double discountPercent = sc.nextDouble();
	
	//take discount variable and compute it's value
	double discount = fee * (discountPercent/100.0);
	
	//Sam's Average Percentage Mark
	double discountedFee = fee - discount;
	
	//print the output be like
	System.out.println("The discount amount is INR "+ discount + " and final discounted fee is INR "+ discountedFee);
	}
}