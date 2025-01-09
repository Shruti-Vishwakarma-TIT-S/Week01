import java.util.Scanner;
//Create TravelComputation class to compute the Distance and Travel Time

class TravelComputation{
	public static void main(String[] args){
	Scanner sc = new Scanner(System.in);
	//Create a variable name to indicate the person travelling
	System.out.println("Enter name: ");
	String name = sc.nextLine();
	
	//Create a variable fromCity, viaCity and toCity to indicate the city
	//from city, via city and to city the person is travelling
	System.out.println("Enter city deatils ");
	String fromCity = sc.nextLine();
	String viaCity = sc.nextLine(); 
	String toCity = sc.nextLine();
	
	System.out.println("Enter distance then time from one city to another, repeat one more time");
	//Create a variable fromToVia to indicate the fromToVia between the fromCity to viaCity
	double fromToVia = sc.nextDouble();
	
	//Create a variable timeFromToVia to indicate the time taken from fromcity to viaCity in minutes
	double timeFromToVia = sc.nextDouble();

	//create a variable viaToFinalCity to indicate the distance between the viaCity to toCity
	double viaToFinalCity = sc.nextDouble();
	
	//Create a variable timeViaToFinalCity to indicate the time taken to travel from viaCity to toCity in minutes
	double timeViaToFinalCity = sc.nextDouble();
	
	//Create a variable totalDistance to indicate the total distance between the fromCity to toCity 
	double totalDistance = fromToVia + viaToFinalCity;
	
	//create a variable totalTime to indicate the total time taken to travel from fromCity to toCity in minutes
	double totalTime = timeFromToVia + timeViaToFinalCity;
	
	//print the travel Details
	System.out.println("The total distance tarvelled by "+name+" from " + fromCity + " to "+ toCity + " via " + viaCity + " is " + totalDistance + " km and " + "the total time taken is "+totalTime+ " minutes ");
	}
}	