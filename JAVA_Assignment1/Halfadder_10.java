/*10. Implement a JAVA program to implement a Half adder using Bitwise operator.*/

class Halfadder_10{
	public static void main(String args[]){
		int a = 1;
		int b = 1;
		int sum = a ^ b;
		int cout = a & b;
		System.out.println("Sum is : "+sum);
		System.out.println("Carry is : "+cout);
	}
}