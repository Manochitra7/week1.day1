package week1.d1;

public class AmstrongNumber {
// sum of cubes of its digits is equal to number itself
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int input= 153;
        int output= 0;
        int value= 0;
		while (input > 0) {
			
			int rem = input % 10;
			output = output+ (rem*rem*rem);
			input = input / 10;
		}
		
		System.out.println(output);
		value = output;
	
		if(value==output) {
			System.out.println(value  +" is Amstrong Number");
		}
			else {
				System.out.println(value +" is not an Amstrong Number");
			}
	}
}
		

	

