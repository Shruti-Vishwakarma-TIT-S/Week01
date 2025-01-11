import java.util.Scanner;
//create class EligibleVoter
public class EligibleVoter {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        // Enter your age
        System.out.println("Enter your age to find whether you could vote or not: ");
        int age = input.nextInt();
        
        // To find eligibility of voter
        boolean eligible = age >= 18 ;

        // using if else statements
		//check whether person is eligible to vote
		if(eligible)
        System.out.println("The person's age is "+ age+" and can vote.");
		//if above condition fails this will get printed out 
		else
		System.out.println("The person's age is "+ age+" and cannot vote.");	
	
		input.close();
    }
}
