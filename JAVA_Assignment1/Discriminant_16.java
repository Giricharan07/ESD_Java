/*16. Find the discriminant, for the quadratic equations. */
/*quadratic equation = ax^2+bx+c
 * discriminant = b^2-4ac
 */
 import java.util.*;
 class Discriminant_16{
	 public static void main(String[] args){
		 System.out.println("Enter the value of a in quadratic equation:");
		 Scanner obj = new Scanner(System.in);
		 double a = obj.nextDouble();
		 System.out.println("Enter the value of b in quadratic equation:");
		 double b = obj.nextDouble();
		 System.out.println("Enter the value of c in quadratic equation:");
		 double c = obj.nextDouble();
		 
		 double discriminant = ((b*b)-(4*a*c));
		 
		 System.out.println("Discriminant of quadratic equation is:"+discriminant);
	 }
 }