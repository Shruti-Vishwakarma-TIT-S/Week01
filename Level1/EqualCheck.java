import java.util.Scanner;
//create a class name EqualCheck
public class EqualCheck{
	//create a method to use charAt() method
	public static boolean userDefinedMethod(String one, String two){
	if(one.length() != two.length())
	return false;
	for(int i=0; i < one.length(); i++){
		if(one.charAt(i) != two.charAt(i)){
			return false;
		}
	}
	//return staement
	return true;
	}
	//use another method to check equal string using buil in method
	public static boolean builtInMethod(String one, String two){
	return one.equals(two);
	}
	//main method where the flow of program starts
	public static void main(String[] args){
	//scanner object ctreated
	Scanner sc = new Scanner(System.in);
	//enter the strings
	System.out.println("Enter two strings: ");
	String one = sc.nextLine();
	String two = sc.nextLine();
	//take boolean values to call methods
	boolean inbuilt = userDefinedMethod(one, two);
	boolean user = builtInMethod(one, two);
	
	if(inbuilt == user)
		//print if both result are equal
		System.out.println("Both result are equal");
	else
		//print it otherwise
		System.out.println("Both strings are unequal");
	
	sc.close();
	}
}