// 13. JAVA program to find the max and min of given two numbers.
import java.util.*;
class MaxMin_13{
	public static void main(String args[]){
		Scanner obj = new Scanner(System.in);
		System.out.println("Enter the first number");
		double a = obj.nextDouble();
		System.out.println("Enter the second number");
		double b = obj.nextDouble();
		double max =  a > b ? a : b;
		double min =  a < b ? a : b;
		System.out.println("Maximum of two numbers is:"+max);
		System.out.println("Minimum of two numbers is:"+min);
	}
}