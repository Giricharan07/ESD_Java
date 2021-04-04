//JAVA program to find the square using newton raphson method.

import java.util.*;
import java.lang.Math;
class NR{
	public static void main(String[] args)
	{
		int i;
		System.out.println("Enter the number for finding the square root:");
		Scanner obj=new Scanner(System.in);
		double a = obj.nextDouble();
		double n = a; 
		double root;
		double l = 0.001;      // for checking closeness and accuracy
		while(true)
		{
			root = 0.5*(a + (n/a));
			if(Math.abs(root - a) < l)   //checking for closeness
				break;
			a=root;		//updating the root
		}
		System.out.printf("Square root of %.3f is %.3f", n, root);
	}
}