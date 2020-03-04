import java.util.Scanner;
/**
 * 
 * @author Shayan Shadpour 104399871
 * Class which simulates a combination lock in a gym locker. Can be opened if correct turns are made.
 *
 */
public class ComboLock {

	private final int TOTAL = 40;
	private int dial;
	private int secret1;
	private int secret2;
	private int secret3;
	
	private Scanner in = new Scanner(System.in);


	/**
	 * Constructor. assigns the values of the correct lock combination
	 * @param secret1 the first correct lock combination 
	 * @param secret2 the second correct lock combination
	 * @param secret3 the last correct lock combination
	 */
	public ComboLock(int secret1, int secret2, int secret3) {
		this.secret1 = secret1;
		this.secret2 = secret2;
		this.secret3 = secret3; 
	}
	
	/**
	 * Method that resets the dial position. 
	 */
	public void reset() {
		dial = 0;
	}
	
	/**
	 * Method which turns the dial N ticks to the left.
	 * @param ticks The amount of ticks that the dial needs to turn
	 */
	public void turnLeft(int ticks) {
		
		if(dial - ticks >=0) {
			dial = dial - ticks;
		}
		
		else {
			dial = (TOTAL - ticks + dial);
		}
	}
	
	/**
	 * Method which turns the dial N ticks to the right.
	 * @param ticks The amount of ticks that the dial needs to turn
	 */
	public void turnRight(int ticks) {
		
		if(dial + ticks < TOTAL) {
			dial = dial + ticks;
		}
		
		else {
			dial = (dial+ticks)%40; //in case the dial would go past 40, loops around the lock instead
		}
	}
	
	/**
	 * Method which uses the turnRight/turnLeft methods to move the dial to the user's desired position and "open" the lock
	 * @return true if the user enters the correct combination, otherwise returns false
	 */
	public boolean open() {
		
		//initially set them to false, will only open if all 3 are true
		boolean check1 = false;
		boolean check2 = false;
		boolean check3 = false;
		int input;
		int input2;
		int input3;
		
		System.out.println("How many ticks right?:");
		input = in.nextInt();
		turnRight(input);
		
		if(dial == this.secret1) {
			check1 = true;
		}
		
		
		System.out.println("How many ticks left?:");
		input2 = in.nextInt();
		turnLeft(input2);
		
		if(dial == this.secret2) {
			check2 = true;
		}
		
		
		System.out.println("How many ticks right? (3rd turn): ");
		input3 = in.nextInt();
		turnRight(input3);
		
		if(dial == this.secret3) {
			check3 = true;
		}
		
		return check1&&check2&&check3; //only way to return true is have all three correct inputs
	}
	
}
