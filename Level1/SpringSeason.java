import java.util.Scanner;
//create class SpringSeason
public class SpringSeason {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter two numbers
        System.out.println("Enter two numbers for month between 1 to 12 and for day ");
        int month = input.nextInt();
		int day = input.nextInt(); 
        
        // using if else statements
		//check whether it is spring season
		if(month == 3 && (day >= 20 && day <=31))
        System.out.println("Spring Season");
		//if above condition fails this will get printed out 
		else if(month == 6 && (day >= 1 && day <= 20))
		System.out.println("Spring Season");	
		//if above statements are false the else if will be executed
		else if (month > 3 && month < 6 && day >= 1 && day <= 31)
		System.out.println("It's a Spring Season");
		//execution of else statement
		else
		System.out.println("Not a Spring Season");	
		input.close();
    }
}
