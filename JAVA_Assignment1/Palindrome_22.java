/*22. Check whether the number is a palindrome number or not.*/
import java.util.*;
class Palindrome_22{
	public static void main(String args[]){
		System.out.println("Enter the number for checking Palindrome or not:");
		Scanner obj = new Scanner(System.in);
		int num = obj.nextInt();
		int temp = num;
		int digit, revNum = 0;
		while(temp > 0){
			digit = temp % 10;
			temp = temp / 10;
			revNum = (revNum * 10) + digit;
		}
		if(revNum == num){
			System.out.println("Number is Palindrome");
		}
		else{
			System.out.println("Number is not Palindrome");
		}
	
	}
}