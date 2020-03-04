import java.util.Scanner;

/**
 * Class used to test the microwave class created. Simple interface to test various class methods
 * @author Shayan Shadpour 104399871
 *
 */
public class TestMicrowave {

    private static Scanner sc = new Scanner( System.in );

	public static void main(String[] args) {
		
		boolean check = true;
		
		Microwave myMicrowave = new Microwave();
		
		while(check) {
			
			System.out.printf("\nWhat button will you press?\n");
			System.out.printf("1. Add time\n2. Change intensity level\n3. Stop the microwave\n4. Reset the microwave\n5.Start the microwave\n*Any other button will exit the microwave program*\n");
			int choice = sc.nextInt();
			
			switch(choice) { // switch/case statement in order to perform the methods.
			
				case 1:  
					myMicrowave.addTime();
					break;
					
				case 2:  
					System.out.println("What intensity would you like to change to? (Low=1, Medium=2, High=3)"); //user will need to enter a number correlating to their intensity
					System.out.println(" ");
					int  lvl = sc.nextInt();
					myMicrowave.changeLevel(lvl);
					break;
					
				case 3:
					myMicrowave.stop();
					break;
					
				case 4:
					myMicrowave.reset();
					break;
					
				case 5:
					myMicrowave.start();
					break;
					
				default:
					System.out.println("Wrong button pressed. Exiting.");
					check = false;
		
			}
			
		}
		
	sc.close(); //closing the scanner 
		
	}
	
}
