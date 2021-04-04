/*15. Implement a JAVA program to multiply two numbers using recursive multiplication.*/
class RecursiveMultiplication_15{
	double myproduct(double x, double y){
		// if x is less than y swap the numbers
        if (x < y)
            return myproduct(y, x);
      
        // iteratively calculate y times sum of x
        else if (y != 0)
            return (x + myproduct(x, y - 1));
      
        // if any of the two numbers is zero return zero
        else
            return 0;
	}
	public static void main(String args[]){
		double num1 = Double.parseDouble(args[0]);
		double num2 = Double.parseDouble(args[1]);
		RecursiveMultiplication_15 obj = new RecursiveMultiplication_15();
		System.out.println("product is : "+obj.myproduct(num1,num2));
	}
}