package javaAssignment;

public class TwoWheeler {
	
	// Declaring variables
	int noOfWheels= 2;
	short noOfMirrors= 2;
	long chassisNumber= 1234567891011111L;
	boolean isPunchtured= false;
	String bikeName= "Activa";
	double runningKM = 234.23455 ;
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
// creating object
		TwoWheeler myBike = new TwoWheeler();
		System.out.println("No of Wheels="+ myBike.noOfWheels);
		System.out.println("No of Mirrors="+myBike.noOfMirrors);
		System.out.println("Chassis number="+myBike.chassisNumber);
		System.out.println("Punchtured="+myBike.isPunchtured);
		System.out.println("BikeName="+myBike.bikeName);
		System.out.println("Km covered="+myBike.runningKM);
	}

}
