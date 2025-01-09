//create class name DistributePens
public class DistributePens{
	public static void main(String[] args){
	//total pens
	int totalPens = 14;
	
	//take students as three
	int studentTotal = 3;
	
	//pen per student will be totalPens/studentTotal 
	int penPerStudent = totalPens/studentTotal;
	
	//remaining leftover pens totalPens%studentTotal
	int remainingPens = totalPens%studentTotal;
	
	//print the output be like
	System.out.println("The Pen Per Student is " + penPerStudent+ " and the reamaining pen not distributed is " + remainingPens);
	}
}