//create class name CourseDiscount
public class CourseDiscount{
	public static void main(String[] args){
	//take fee variable
	int fee = 125000;
	
	//take variable discountPercent
	int discountPercent = 10;
	
	//take discount variable and compute it's value
	double discount = fee * (10/100.0);
	
	//discounted fee would be
	double discountedFee = fee - discount;
	
	//print the output be like
	System.out.println("The discount amount is INR "+ discount + "and final discounted fee is INR "+ discountedFee);
	}
}