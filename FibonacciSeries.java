package javaAssignment;

public class FibonacciSeries {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int range= 8;
		int firstNum=0; 
		int secNum=1;
		int sum;
		System.out.println(firstNum);
		System.out.println(secNum);
		int i;
		for(i=1; i<=range; i++)
		{
			sum=firstNum+secNum;
			System.out.println(sum);
			// Swap numbers
			firstNum=secNum;
			secNum=sum;
		}

	}

}
