// printing odd numbers from 1 to 100
class Odd{
	public static void main(String[] args)
	{
		int i;
		System.out.println("odd numbers from 1 to 100:");
		for(i=1; i<=100 ; i++)
		{
			if(i%2!=0)
				System.out.printf("%d\t",i);
		}
	}
}