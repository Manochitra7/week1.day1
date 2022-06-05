package javaAssignment;

public class Factorial {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int number= 5;
		int fact=1;
		int i=1;
		for(i=1; i<=number;i++) 
		{
			fact= fact*i;

	}
		
		System.out.println("Factorial of " +number + " is" +fact);

}}
