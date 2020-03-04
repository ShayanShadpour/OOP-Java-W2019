import java.util.Scanner;

public class PrimePrinter {

public static void main (String[] args){
	
	 Scanner in = new Scanner(System.in);
	 System.out.print("Enter upper limit: ");
	 int limit = in.nextInt();
	 in.close();
	 PrimeGenerator prime = new PrimeGenerator();
	 
	 int i = 2;
	 while(i<limit) {
		 
		 System.out.println(i);
		 i = prime.nextPrime();
		
		 
	 }
	 
	 
	 }
}
	

