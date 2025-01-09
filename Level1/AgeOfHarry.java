//Create a program to calculate the age of harry by using the birth year
//Create Class Name AgeOfHarry
public class AgeOfHarry{
	public static void main(String[] args){
	//given in the question is that harry was born in year 2000
	int harryBirthYear = 2000;
	
	//to assume current year is 2024
	int currentYear = 2024;
	
	//to find harry's current age would be like subtract harryBirthYear from currentYear
	int harryCurrentAge = currentYear - harryBirthYear;
	
	//print harryCurrentAge
	System.out.println("Harry's age in 2024 is " + harryCurrentAge);
	
	}
}	