//Checking Armstrong Number

class Armstrong{
	public static void main(String[] args){
		int number=Integer.parseInt(args[0]);
		int number1=number,temp1=number;
		int power=0,power1=0;
		int sum=0,s=0;
		while(number!=0)
		{
			number=number/10;
			power++;
		}
		power1=power;
		while(power1<=4)
		{
			s=number1%10;
			number1=number1/10;
			int i,temp=1;
			for(i=0; i<power; i++)
			{
				temp=temp*s;
			}
			sum=sum+temp;
			power1--;
		}
		if(temp1==sum)
		{
			System.out.println("Armstrong");
		}
		else
			System.out.println("Not Armstrong");
	}	
}