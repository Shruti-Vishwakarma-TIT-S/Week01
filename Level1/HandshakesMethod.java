import java.util.Scanner;
//Create class name as HandshakesMethod
public class HandshakesMethod {
	//main method
    public static void main(String[] args) {
        // Create a Scanner object 
        Scanner scanner = new Scanner(System.in);
		
        //Take number of students as numberOfStudents
		System.out.println("Enter the total students : ");
        int numberOfStudents = scanner.nextInt(); 
		//create object of class
		HandshakesMethod handshake = new HandshakesMethod();
		//create variable to call method 
		int possible = handshake.handshakesDone(numberOfStudents);
        // Print the output be like
        System.out.println("The possible number of hansdshakes "+ possible);
        // Close the scanner
        scanner.close();
    }
	//create another method to count no of handshakes
	public int handshakesDone(int numberOfStudents){
		 // Find possible Handshakes
        int possibleHandshakes =  (numberOfStudents * (numberOfStudents - 1)) / 2;
		return possibleHandshakes;
	}
}