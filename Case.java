// Altering a character from upper to lower and lower to upper case
import java.util.*;
class Case{
	public static void main(String[] args)
	{
		Scanner in=new Scanner(System.in);
		System.out.println("Enter the letter:");
		String str= in.nextLine();
		char c=str.charAt(0);
		int a=(int)c;
		a=a^32;
		char b=(char)a;
		System.out.println("Altered string is:"+b);
	}
}