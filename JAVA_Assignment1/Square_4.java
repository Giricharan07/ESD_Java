// JAVA program to find the square of the number.
import java.util.*;
class Square{
	public static void main(String[] args)
	{
		System.out.println("Enter the Number to be squared:");
		Scanner obj = new Scanner(System.in);
		double a = obj.nextDouble();
		double res = a*a;
		System.out.printf("Result is:%.3f ",+res);
	}
}