//JAVA program to find the GCF  and LCM of given numbers. 
import java.util.*;
import java.lang.Math;
class Lcm{
	public static void main(String[] args)
    {
		int num1 = 66;
		int num2 = 198;
		int i, gcd = 0;
		int j = 1;
		int temp1 = num1;
		int temp2 = num2;
		for(i = 1; i <= Math.max(num1, num2); i++){
			if((num1 % i) == 0 && (num2 % i) == 0){
				gcd = i;
			}
		}
		System.out.println("GCD is " + gcd);
		i = 1;
		while(temp1 != temp2){
			if(temp2 > temp1){
				temp1 = temp1 * i;
				i++;
				}
			if (temp1 > temp2){
				temp2 = temp2 * j;
				j++;
				}
		}
		System.out.println("LCM is " + temp1);
	}
	
}