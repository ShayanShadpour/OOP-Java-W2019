/**
 * 
 * @author Shayan Shadpour 104399871
 * Class which indicates to the cashier/user how much change is due to the customer. measured in pennies
 *
 */
public class Problem3 {

	private int due;
	
	private int recieved;
	private int pennies,dollars,nickels,dimes,quarters;
	
	public Problem3(int num1, int num2) {
		
		this.due = num1;
		
		this.recieved = num2;
		
	}
	/**
	 * Method that generates appropriate coins for the change due using division and modulo operator
	 */
	public void Cashier() {
		
		if((recieved-due)<0) {
			System.out.println("The customer has not given enough money.");
			return;
		}
		
		int rest = recieved-due;
		
		dollars = rest/100;
		rest = rest%100;
		
		quarters = rest/25;
		rest = rest%25;
		
		dimes = rest/10;
		rest = rest%10;
		
		nickels = rest/5;
		rest = rest%5;
		
		pennies = rest/1;
		rest = rest%1;
		
		System.out.println("Change recieved is "+dollars+" dollars, " + quarters + " quarters, "+dimes+" dimes, "+ nickels+" nickels, and "+pennies+" pennies.");
		
		
	}
	
}
