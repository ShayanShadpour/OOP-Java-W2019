import java.awt.Rectangle;

/**
 * @author Shayan Shadpour 104399871
 */
public class Problem3 {

	public static void main(String[] args) {
		
		//creating two instances of the rectangle object
		Rectangle rec1 = new Rectangle(20, 50, 15, 20);
		Rectangle rec2 = new Rectangle(60, 30, 30, 20);
		
		//using the "get" methods in order to retrieve the coordinates on the rectangles
		System.out.printf("Rectangle 1: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n",rec1.getX(),rec1.getY(),rec1.getWidth(),rec1.getHeight());
		
		System.out.printf("Rectangle 2: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n\n",rec2.getX(),rec2.getY(),rec2.getWidth(),rec2.getHeight());

		//moving the position of rectangle 1
		rec1.translate(-10 , -5);
		
		
		System.out.println("Rectangle 1 has been translated.");
		
		System.out.printf("\nRectangle 1: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n",rec1.getX(),rec1.getY(),rec1.getWidth(),rec1.getHeight());
		
		System.out.printf("Rectangle 2: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n\n",rec2.getX(),rec2.getY(),rec2.getWidth(),rec2.getHeight());
		
		//creating two integers with wanted values
		int new_width = (int) (rec2.getWidth()/2);
		
		int new_height = (int) (rec2.getHeight()*2);  // (int) in order to change the double value to an integer
		
		
		//changing rectangle 2's size using the new values created
		rec2.setSize(new_width,new_height);
		
		
		System.out.println("Rectangle 2 has been resized.");
		
		System.out.printf("\nRectangle 1: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n",rec1.getX(),rec1.getY(),rec1.getWidth(),rec1.getHeight());
		
		System.out.printf("Rectangle 2: Position = (%.1f %.1f) , (W,H) = (%.1f,%.1f)\n",rec2.getX(),rec2.getY(),rec2.getWidth(),rec2.getHeight());
		
		
		
	}
	
}
