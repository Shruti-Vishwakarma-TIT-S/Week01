import java.util.Scanner;
//create LeapYear class
public class LeapYear {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Enter year of your choice
        System.out.println("Enter a year ");
        int year = scanner.nextInt();

     
        // Using if-else statements with logical operators
        if (year % 4 == 0 && (year % 400 == 0 && year % 100 == 0)) 
            System.out.println(year + " is a Leap Year.");
                
        
		else 
            System.out.println(year + " is not a Leap Year.");
         

        // Close the scanner
        scanner.close();
    }
}