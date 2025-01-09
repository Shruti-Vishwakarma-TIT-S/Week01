//create a class  CalculateProfit
public class CalculateProfit{
	public static void main(String[] args){
		//create variables like costPrice ad sellingPrice
		
		int costPrice = 129;
		int sellingPrice = 191;
		
		//make one variable profit 
		int profit = sellingPrice-costPrice;
		
		//make profitPercentage = profit/costPrice * 100
		double profitPercentage = (profit/(double)costPrice)*100;
		
		//print profitPercentage
		System.out.println("The Cost Price is INR " + costPrice+ " and selling Price is INR "+ sellingPrice+ "\nThe Profit is INR "+ profit + " and the Profit Percentage is "+ profitPercentage);
	}
}