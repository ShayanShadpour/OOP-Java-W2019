import java.awt.Shape;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Line2D;

/**
 * 
 * @author Shayan Shadpour 104399871
 *
 */
public class Problem4 {
	
	public static void main(String[] args) {
		
		//create a line with the following initial values = (5,10) to (20,35)
		
		Shape myLine = new Line2D.Float(5, 10, 20, 35);
				
		//print the line coordinates
		
		System.out.println("Start point coordinates: (" + ((Line2D) myLine).getX1() + " , " + ((Line2D)myLine).getY1() + ")");
		System.out.println("End point coordinates: (" + ((Line2D) myLine).getX2() + " , " + ((Line2D)myLine).getY2() + ")");

		//change the end point of the line to (10,15)
		((Line2D)myLine).setLine(5,10,10,15);
		
		//print the line coordinates
		System.out.println("New coordinates: ");
		System.out.println("Start point coordinates: (" + ((Line2D) myLine).getX1() + " , " + ((Line2D)myLine).getY1() + ")");
		System.out.println("End point coordinates: (" + ((Line2D) myLine).getX2() + " , " + ((Line2D)myLine).getY2() + ")");
		
		
		//create ellipse with height 30, width 50.
		//x coordinate of upper left framing rectangle is 5
		//y coordinate of upper left of framing rectangle is 15
		
		System.out.println("");
		Shape myEllipse = new Ellipse2D.Float(5,15,50,30);
		
		System.out.println("Ellipse coordinates:");
		
		System.out.println("Height: " + ((Ellipse2D) myEllipse).getHeight());
		System.out.println("Width: " + ((Ellipse2D) myEllipse).getWidth());
		
		System.out.println("X coordinate of upper-left corner of framing rectangle: " + ((Ellipse2D) myEllipse).getX());
		System.out.println("Y coordinate of upper-left corner of framing rectangle " + ((Ellipse2D) myEllipse).getY());

		
		
		
	}
	

}
