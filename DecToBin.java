//Coverting Decimal to Binary
import java.util.*;
class DecToBin{
	public static void main(String[] args)
	{
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the Decimal Value:");
		int a = in.nextInt();
		int num=0, a1,temp=1;
		while(a != 0)
		{
			a1 = a%2;
			num = num+(a1*temp);
			a=a/2;
			temp=temp*10;
		}
		System.out.println("Binary Value:"+num);
	}
}