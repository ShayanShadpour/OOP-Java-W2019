public class ComboLockTester {

	
	
	public static void main(String[] args) {
		ComboLock lock = new ComboLock(0,0,0);
		
		int looper = 1;
		System.out.println("Welcome to the combination lock! Try to unlock this lock.");
		
		while(looper!=2) {
			
			if(lock.open()) {
				looper = 2;
			}
			else {
				System.out.println("Wrong combination! Try again.");
				lock.reset();
			}
		}
		System.out.println("Congratulations. You have unlocked the lock.");

	}
}
