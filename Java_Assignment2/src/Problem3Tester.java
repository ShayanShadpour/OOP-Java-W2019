import java.util.Scanner;
public class Problem3Tester {


	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		//testing the user-inputs
		
		System.out.println("Enter the amount due(in pennies): ");
		int due = in.nextInt();
		
		System.out.println("Enter the amount recieved(in pennies): ");
		int recieved = in.nextInt();
		in.close();
		
		Problem3 Cashier1 = new Problem3(due,recieved);
		Cashier1.Cashier();
		
		//testing the three possible cases
		
		System.out.printf("\nCase in change should be given: \n");
		Problem3 Cashier2 = new Problem3(327,500);
		Cashier2.Cashier();
		
		System.out.printf("\nCase in which no change should be given: \n");
		Problem3 Cashier3 = new Problem3(500,500);
		Cashier3.Cashier();
		
		System.out.printf("\nCase in which the customer did not supply enough money: \n");
		Problem3 Cashier4 = new Problem3(500,200);
		Cashier4.Cashier();
		
		
		
	}
	
}
