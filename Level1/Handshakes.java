import java.util.Scanner;
//Create class name as Handshakes
public class Handshakes {
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);
		
        //Take number of students as numberOfStudents
		System.out.print("Enter the total students : ");
        int numberOfStudents = scanner.nextInt();
		
		 // Find possible Handshakes
       
        int possibleHandshakes =  (numberOfStudents * (numberOfStudents - 1)) / 2;
        
        // Print the output be like
        System.out.println("The possible number of hansdshakes "+ possibleHandshakes);
        // Close the scanner
        scanner.close();
    }
}