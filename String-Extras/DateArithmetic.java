import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Create class DateArithmetic
public class DateArithmetic { 
    public static void main(String[] args) { 
        // Ask user for a date input
        java.util.Scanner sc = new java.util.Scanner(System.in); 
        System.out.print("Enter a date (yyyy-MM-dd): "); 
        String dateInput = sc.nextLine(); 
        LocalDate date = LocalDate.parse(dateInput, DateTimeFormatter.ISO_LOCAL_DATE); 
        // Add 7 days, 1 month, and 2 years
        LocalDate newDate = date.plusDays(7).plusMonths(1).plusYears(2); 
        // Subtract 3 weeks from the new date
        newDate = newDate.minusWeeks(3); 
        // Display the result
        System.out.println("Resulting date: " + newDate); 
        sc.close(); 
    }
}
