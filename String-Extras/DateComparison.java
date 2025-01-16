import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
// Create class DateComparison
public class DateComparison { 
    public static void main(String[] args) { 
        // Ask user for two date inputs
        java.util.Scanner sc = new java.util.Scanner(System.in); 
        System.out.print("Enter the first date (yyyy-MM-dd): "); 
        String dateInput1 = sc.nextLine(); 
        System.out.print("Enter the second date (yyyy-MM-dd): "); 
        String dateInput2 = sc.nextLine(); 
        // Parse the dates
        LocalDate date1 = LocalDate.parse(dateInput1, DateTimeFormatter.ISO_LOCAL_DATE); 
        LocalDate date2 = LocalDate.parse(dateInput2, DateTimeFormatter.ISO_LOCAL_DATE); 
        // Compare the dates and display the result
        if (date1.isBefore(date2)) { 
            System.out.println("The first date is before the second date."); 
        } else if (date1.isAfter(date2)) { 
            System.out.println("The first date is after the second date."); 
        } else { 
            System.out.println("The two dates are the same."); 
        } 
        sc.close(); 
    }
}
