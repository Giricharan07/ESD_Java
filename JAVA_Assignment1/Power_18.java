//18. Find the power of the number without using existing methods. 

class Power_18{
	public static void main(String args[]){
		int power = 5;
		int base = 2;
		int temp = base;
		while(power > 1){
			temp = temp * base;
			power--;
		}
		System.out.println("Solution for finding the power is: " + temp);
	}
}