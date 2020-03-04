
public class Problem2Tester {

	public static void main(String[] args) {
		
		//user can enter a valid or non-valid number to be tested
		Problem2 input = new Problem2();
		input.validityCheck();
		
		//example of a valid card
		System.out.printf("\n4012-8888-8888-1881 should return as a valid card: \n");
		Problem2 card = new Problem2("4012-8888-8888-1881");
		card.validityCheck();
		
		//example of a non-valid card
		System.out.printf("\n3023-5555-3412-7358 should return as a non-valid card: \n");
		Problem2 card2 = new Problem2("3023-5555-3412-7358");
		card2.validityCheck();
		
	}
	
}
