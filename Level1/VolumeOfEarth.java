//create class name VolumeOfEarth
public class VolumeOfEarth{
	public static void main(String[] args){
	//take radius as 
	int radiusOfEarth = 6378;
	
	//take volumeOfEarth as = (4/3)*pi*r^3
	double volumeOfEarth = (4/3.0)* Math.PI * (Math.pow(radiusOfEarth,3));
	
	//convert volumeOfEarth in kms to Miles
	double cubicMiles = volumeOfEarth * 1.6;
	
	//print the output be like
	System.out.println("The volume of earth in cubic kilometers is "+ volumeOfEarth+ " and cubic miles is " + cubicMiles);
	}
}