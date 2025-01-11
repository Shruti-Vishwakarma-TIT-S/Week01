import java.util.Scanner;
// Create a class DayOfWeek 
public class DayOfWeek {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in); 
        //enter the month, day, and year for the date
        System.out.println("Enter month(m), day(d) and year(y): ");
        int m = input.nextInt(); 
        int d = input.nextInt(); 
        int y = input.nextInt(); 
		
        //Variables to store intermediate calculations
        int y0, x, m0, d0;
        //According to the formula for the Gregorian calendar
        y0 = y - (14 - m) / 12;
        x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        m0 = m + 12 * ((14 - m) / 12) - 2;
        d0 = (d + x + (31 * m0) / 12) % 7;

        // Print the day of the week starting from 0 for Sunday,1 for monday ...
        System.out.println("The day of the week is: " + d0);
    }
}
