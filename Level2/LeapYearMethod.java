import java.util.Scanner;
//create LeapYearMethod class
public class LeapYearMethod {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter year of your choice
        System.out.println("Enter a year ");
        int year = scanner.nextInt();
		//create object of class
		LeapYearMethod leap = new LeapYearMethod();
		//method call
		leap.leapYearCheck(year);
        // Close the scanner
        scanner.close();
    }
	//method to check leap year
	public void leapYearCheck(int year){
		if(year >= 1582){
			// Using if-else statements with logical operators
			if ((year % 4 == 0 && year % 100 != 0) || (year % 400 == 0)) 
				System.out.println(year + " is a Leap Year.");
			else 
				System.out.println(year + " is not a Leap Year.");
		}
		else{
			System.out.println("Enter year greater than 1582");
		}
		return;
	}	
}