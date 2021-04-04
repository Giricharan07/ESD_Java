/*14. Implement a JAVA program to find the Mean of given 5 numbers.*/
class Mean_14{
	public static void main(String[] args){
		double [] numbers = new double[5];
		double mean;
		int i;
		double sum = 0;
		for(i = 0; i < 5; i++){
			numbers[i] = Double.parseDouble(args[i]);	// using Command Line Arguments for inputs
		}
		for(i = 0; i < 5; i++){
			sum = numbers[i] + sum;						// Calculating the sum of all numbers
		}
		mean = sum / 5;									// Calculating Mean
		System.out.println("mean is "+mean);
	}
}