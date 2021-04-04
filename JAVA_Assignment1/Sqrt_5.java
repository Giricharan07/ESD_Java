//JAVA program to find the square root of the number. (import MATH,can use sqrt)
import java.util.*;
import java.lang.Math;
class Sqrt{
	public static void main(String[] args)
	{
		System.out.println("Enter the positive number:");
		Scanner obj = new Scanner(System.in);
		double a = obj.nextDouble();
		double res = Math.sqrt(a);
		System.out.printf("Square Root Result is:%.3f ",res);
	}
}