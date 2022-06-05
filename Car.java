package javaAssignment;

public class Car {
public void applyBrake() {
	System.out.println("Apply Brake");
}
	public void applyGear()
	{
		System.out.println("Apply gear");
	}
		public void switchonAC() {
			System.out.println("On AC");
		}
		public static void main(String[] args) {
			Car myCar = new Car();
			myCar.applyGear();
			myCar.switchonAC();
			myCar.applyBrake();
			
		}
			
		}
		
		
		


