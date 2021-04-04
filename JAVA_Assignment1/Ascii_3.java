//JAVA program to print the ASCII values of A-Z, a-z , 0-9.

class Ascii{
	public static void main(String[] args)
	{
		int i;
		System.out.println("ASCII values of A-Z is:\n");
		for(i='A' ;i <= 'Z'; i++)
			System.out.println("ASCII value of "+(char)i+" is "+i);
		
		
		System.out.println("\nASCII values of a-z is:\n");
		for(i='a' ;i <= 'z' ; i++)
			System.out.println("ASCII value of "+(char)i+" is "+i);
		
		
		System.out.println("\nASCII values of 0-9 is:\n");
		for(i='0' ;i <= '9' ; i++)
			System.out.println("ASCII value of "+(char)i+" is "+i);
	}
}