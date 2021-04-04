/*21. Implement Java program to check if a given number is Fibonacci number or not.*/
import java.util.*;
class Fibonacci_21{
	public static void main(String args[]){
		System.out.println("Enter the number for checking Fibonacci number or not:");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int num1 = 0;
		int num2 = 1;
		int num3 = 0;
		while(num3 <= num){
			if(num3 == num){
				System.out.println("Given number is fibonacci");
				return;
			}
			num3 = num1 + num2;
			num1 = num2;
			num2 = num3;		
		}
		System.out.println("Number is not fibonacci");
	}
}