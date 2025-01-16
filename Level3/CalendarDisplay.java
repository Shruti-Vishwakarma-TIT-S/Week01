import java.util.Scanner;
//create class CalendarDisplay
public class CalendarDisplay {
    // Method to get the name of the month
    public static String getMonthName(int month) {
        String[] months = {
            "January", "February", "March", "April", "May", "June",
            "July", "August", "September", "October", "November", "December"
        };
        return months[month - 1]; // Return the month name
    }
    // Method to get the number of days in the month
    public static int getNumberOfDays(int month, int year) {
        int[] days = {31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31}; // Days in each month
        if (month == 2 && isLeapYear(year)) {
            return 29; // February in a leap year
        }
        return days[month - 1]; // Return the number of days for the month
    }
    // Method to check if a year is a leap year
    public static boolean isLeapYear(int year) {
        return (year % 4 == 0 && year % 100 != 0) || (year % 400 == 0);
    }
    // Method to get the first day of the month using the Gregorian calendar algorithm
    public static int getFirstDayOfMonth(int month, int year) {
        int y0 = year - (14 - month) / 12;
        int x = y0 + y0 / 4 - y0 / 100 + y0 / 400;
        int m0 = month + 12 * ((14 - month) / 12) - 2;
        return (1 + x + 31 * m0 / 12) % 7; // Return the day of the week (0 = Sunday, 1 = Monday, ...)
    }
    // Method to display the calendar
    public static void displayCalendar(int month, int year) {
        System.out.println("Calendar for " + getMonthName(month) + " " + year);
        System.out.println("Sun Mon Tue Wed Thu Fri Sat");
        int firstDay = getFirstDayOfMonth(month, year); // Get the first day of the month
        int numberOfDays = getNumberOfDays(month, year); // Get the number of days in the month
        // Print leading spaces for the first week
        for (int i = 0; i < firstDay; i++) {
            System.out.print("    "); // Print 4 spaces for each day before the first day
        }
        // Print the days of the month
        for (int day = 1; day <= numberOfDays; day++) {
            System.out.printf("%3d ", day); // Print the day right-justified in a field of width 3
            if ((day + firstDay) % 7 == 0) {
                System.out.println(); // Move to the next line after Saturday
            }
        }
        System.out.println(); // Print a new line at the end
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in); // Create a Scanner object
        System.out.print("Enter month (1-12): ");
        int month = scanner.nextInt(); // Read the month
        System.out.print("Enter year: ");
        int year = scanner.nextInt(); // Read the year

        displayCalendar(month, year); // Display the calendar
        scanner.close(); // Close the scanner
    }
}