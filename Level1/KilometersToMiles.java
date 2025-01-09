//create a class name KilometersToMiles
public class KilometersToMiles{
	public static void main(String args[]){
	//take distance in kilometers 
	double distanceKilometers = 10.8;
	
	//1 km = 1.6 miles
	//convert kilometers to miles
	//take a new variable name convertKilometersToMiles 
	double convertKilometersToMiles = distanceKilometers * 1.6;
	
	//print miles
	System.out.println("The distance "+distanceKilometers +"km in miles is "+convertKilometersToMiles);
	}	
}