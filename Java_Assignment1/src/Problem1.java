/**
 * Shayan Shadpour
 * 104399871
 * Question 1
 */
import java.lang.Math;		//importing math in order to use the PI and pow methods
public class Problem1 {

	public static void main(String[] args) {
		
		double s;
		double s1=3;
		double v1 = 5;
		double g = 2;
		double t = 2;
		double G = 5;
		double a = 4;
		double p = 3;
		double m1 = 5;
		double m2 = 2;
		double pi = Math.PI;
	
		
		
		s = ((s1*v1)-((g/2.0)*(Math.pow(t,3.0))));
		
		G = ((3.0/4)*(Math.pow(pi,2.0)))*(Math.pow(a,3.0)/(Math.pow(p,(1.0/2.0))*(m1-m2)));
		
		System.out.printf("Value of s: %f\n",s);
		
		
		System.out.println("Value of G: "+G);
		
	}
	
	
}

