import java.util.Arrays;
import java.util.Scanner;

/**
 * Tester class for the person class. user enters 10 names then has the first and last name given, alphabetically sorted. (using their names).
 * @author Shayan Shadpour - 104399871
 *
 */
public class PersonTester {

	
	public static void main(String[] args) {
		
		
		Scanner sc = new Scanner(System.in);
		
		//first I take the user input of all the names
		String[] nameArray = new String[10];
		
		System.out.println("Enter 10 names.");
		
		for(int i = 0;i<10;i++) {
			nameArray[i] = sc.nextLine();
		}
		
		//then I create person objects with those names
		Person person1 = new Person(nameArray[0]);
		Person person2 = new Person(nameArray[1]);
		Person person3 = new Person(nameArray[2]);
		Person person4 = new Person(nameArray[3]);
		Person person5 = new Person(nameArray[4]);
		Person person6 = new Person(nameArray[5]);
		Person person7 = new Person(nameArray[6]);
		Person person8 = new Person(nameArray[7]);
		Person person9 = new Person(nameArray[8]);
		Person person10 = new Person(nameArray[9]);
		
		//then I add those names to a list of type Person
		Person[] personlist =  {person1, person2, person3, person4, person5, person6, person7, person8, person9, person10};
		
		Arrays.sort(personlist);

        String firstPerson = personlist[0].getName();
        System.out.println("First person: " + firstPerson);

        String lastPerson = personlist[personlist.length - 1].getName();
        System.out.println("Last person: " + lastPerson);
		
		sc.close();
		
		
	}
	
}
