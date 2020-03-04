import java.lang.String;
import java.util.Scanner;
/**
 * 
 * @author Shayan Shadpour 104399871
 * Class which validates a credit card number.
 *
 */
public class Problem2 {
	
	private String card;
	private int result1=0;
	private int result2=0;
	private int result3=0;
	private int totalResult;
	
	Scanner in = new Scanner(System.in);

	
	/**
	 * Constructor for when the card number is already given(used while testing)
	 * @param s the string that contains the credit card number
	 */
	public Problem2(String s){
		
		this.card = s;
	}
	
	/**
	 * Constructor for when the card must be input by the user
	 */
	public Problem2() {
		
		this.card = "";
	}
	
	
	/**
	 * Method which performs the validity check outlined in the Assignment2 question sheet.
	 * All steps are performed in this one method.
	 */
	public void validityCheck() {
		
		if(card.length() == 0) {
		System.out.println("Please enter your credit card number (XXXX-XXXX-XXXX-XXXX):");
		card = in.nextLine(); //user may input their card number here.
		}
		in.close();
		
		String parsedCard = card.replaceAll("[^0-9]",""); //removing non-number elements from the string (-," ")
		
		//error check in case number is an incorrect format
		if(parsedCard.length() != 16) {
			System.out.println("Card entered is not of valid length.");
			return;
		}
		
		//adding all numbers
		for (int count = 0; count<parsedCard.length();count++) {
		
			result1 = result1 + Character.getNumericValue(parsedCard.charAt(count));
			
		}
		
		//adding every other number from the right
		for (int count2 = (parsedCard.length() - 2); count2>=0;count2 = count2-2) {
			
			result2 = result2 + Character.getNumericValue(parsedCard.charAt(count2));
			
			//also checking if the number is greater than 4, done in the same loop
			if(Character.getNumericValue(parsedCard.charAt(count2)) > 4) {
				result3++;
			}

		}
	

		totalResult = result1 + result2 + result3;
		
		if(totalResult%10 == 0) {
			
			System.out.println("The credit card number you have entered is valid.");
		}
		
		else {
			System.out.println("The credit card number you have entered is not valid");
		}

	}
	
}
