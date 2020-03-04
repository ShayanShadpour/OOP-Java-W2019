/**
 * 
 * @author Shayan Shadpour 104399871
 * Class which simulates a microwave and it's various functions.
 *
 */
public class Microwave {

	private int time= 0;
	private String level1 = "Low";
	private String level2 = "Medium";
	private String level3 = "High";
	private String currentLevel = "Low";
	

	/**
	 * Adds time to the microwave timer.
	 */
	public void addTime() {
		
		time=time+10;
	}
	
	/**
	 * Starts the microwave, and displays the opponent's selected options
	 */
	public void start() {
		
		if(time==0) {
			System.out.println("Timer is currently at 0. Please set the time and try again.");
		}
		
		else {
		System.out.printf("Cooking for %d seconds at level %s ...\n\n",time,currentLevel);
		}
	}
	
	/**
	 * Allows the user to change the intensity level of the microwave.
	 * @param intensity The intensity of the microwave
	 */
	public void changeLevel(int intensity) {
		
		switch (intensity) {
		
		case 1: currentLevel = level1;
				break;
		
		case 2: currentLevel = level2;
				break;
		
		case 3: currentLevel = level3;
				break;
				
		default: System.out.println("Invalid intensity entered.");
				break;
				
		}
	}
		
	/**
	 * Stops the microwave from running.
	 */
	public void stop() {
		
		time = 0;
		System.out.printf("Cooking stopped.\n\n");
	}
	
	/**
	 * Resets the timer and intensity for the microwave.
	 */
	public void reset() {
		time = 0;
		currentLevel = level1;
		System.out.printf("Microwave reset. Power is at low.\n\n");
	}

	
	
}