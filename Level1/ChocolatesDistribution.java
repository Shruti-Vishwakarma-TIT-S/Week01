import java.util.Scanner;
//create class ChocolatesDistribution
public class ChocolatesDistribution {
    public static void main(String[] args) {
        // Initialize scanner object
        Scanner sc = new Scanner(System.in);
        // User will provide the values
        System.out.print("Enter the number of chocolates and number of children ");
        int number = sc.nextInt();
        int divisor = sc.nextInt();
		//method call
		int[] result = findRemainderAndQuotient(number, divisor); 
        //Displaying results
        System.out.println("The number of chocolates each child gets is "+ result[0]+ " and the number of remaining chocolates are " + result[1]);
        sc.close();
    }
	public static int[] findRemainderAndQuotient(int number, int divisor){
		//To calculate chocolates distribution per child and remaining chocolates
        int chocolatesPerChild = number / divisor;
        int remainingChocolates = number % divisor;
		//return the values
		return new int[]{chocolatesPerChild, remainingChocolates};
	}

}