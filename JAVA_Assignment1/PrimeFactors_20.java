/*20. Implemen a Java program to print all prime factors of a given number.*/
import java.util.*;
class PrimeFactors_20{
	static boolean isPrime(int num){		//checking whether prime or not
		int i;
		for(i = 2; i < num; i++){
			if((num % i) == 0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String args[]){
		// Taking input from user
		System.out.println("Enter the number for finding prime factors");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int i;
		System.out.println("Prime factors of the input number is:");
		for(i = 2 ; i <= num ; i++)
		{
			if((num % i) == 0){
				if(isPrime(i)){			//calling isPrime function for checking prime
					System.out.println(i);
				}
			}
		}
		
	}
}