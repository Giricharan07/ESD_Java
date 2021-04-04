/*17. Find the dictance between two points, using euclidean distance.*/
import java.lang.Math;

class EuclidianDistance_17{
	public static void main(String args[]){
		/* Let the two points be (x1,x2) and (y1,y2) */
		int x1= 8;		
		int x2 = 5;
		int y1 = 7;
		int y2 = 3;
		Double distance = Math.sqrt(Math.pow((x2 - x1),2) + Math.pow((y2 - y1), 2));
		System.out.println("Distance between two points is: " + distance);
	}
}