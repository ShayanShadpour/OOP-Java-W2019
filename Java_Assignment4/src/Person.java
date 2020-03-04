/**
 * Person class with a name and implements comparable, thus the compareTo method is overwritten.
 * @author Shayan Shadpour - 104399871
 *
 */
public class Person implements Comparable<Person> {

private String name;

/**
 * Constructor class for the person
 * @param s the name of the person
 */
public Person(String s) {
	this.name = s;
}

/**
 * Get function for the name of the person
 * @return
 */
public String getName() {
	return this.name;
}

/**
 *Overriding the compareTo method to make sure the name is being compared.
 */
@Override
public int compareTo(Person other) {
	
	int check = this.name.compareToIgnoreCase(other.name);
	return check;
}
	




}
