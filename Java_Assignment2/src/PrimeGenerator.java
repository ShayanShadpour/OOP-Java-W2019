/**
 * @author Shayan Shadpour 104399871
 * Class which generates prime numbers
 *
 */
public class PrimeGenerator
{
 private int current;
 public PrimeGenerator()
 {
 current = 1;
 }
 /**
 Calculates the next prime number.
 @return the next prime number
 */
 public int nextPrime()
 {
	 current++;
 while(!isPrime(current)) {
	 current++;
 }
 return current;
 }
 /**
 Check if n is a prime number.
 @param n to check whether it is prime or not
 @return true if n is prime
 */
 public static boolean isPrime(int n)
 {
 
	 int test;
	 for(int i=2;i<=n/2;i++)
		{
	           test=n%i;
		   if(test==0)
		   {
		      return false;
		   }
		}
	 return true;
}
 
public static void main(String[] args) {
	
	
	PrimeGenerator prime = new PrimeGenerator();
	
	if(isPrime(prime.current)) {
		System.out.println("prime");
	}
	else {
		System.out.println("Not prime");
	}
	System.out.println(prime.nextPrime());
	
	
}
 

 
 
 
 
 
 
 
 
}