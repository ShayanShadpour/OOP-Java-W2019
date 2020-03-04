
/**
 * Class which holds info related to a person and has related getter/setter methods.
 * @author Shayan Shadpour 104399871 
 *
 */
public class Person implements Comparable<Person> {
	private String fName;
	private String lName;
	private String cell;
	private int bMonth;
	private int bDay;

	
	/**
	 * Constructor for Person class if all parameters are given
	 * @param f The person's first name
	 * @param l The person's last name
	 * @param c	The person's cell number
	 * @param month	The person's month of birth
	 * @param day The person's day of birth
	 */
	public Person(String f, String l, String c, int month, int day) {
		this.fName = f;
		this.lName = l;
		this.cell = c;
		this.bMonth = month;
		this.bDay = day;
	}
	
	/**
	 * Constructor for Person class if no parameters are given
	 */
	public Person() {
		this.fName = "";
		this.lName = "";
		this.cell = "";
		this.bMonth = 0;
		this.bDay = 0;
	}
	
	/**
	 * Method which gets the first name of this instance of the Person class
	 * @return the first name of this person.
	 */
	public String getFirstName() {
		
		return this.fName;
		
	}
	
	/**
	 * Method which gets the last name of this instance of the Person class
	 * @return the last name of this person.
	 */
	public String getLastName() {
		return this.lName;
	}
	
	/**
	 * Method which gets the cellphone number of this instance of the Person class
	 * @return the cell# of this person
	 */
	public String getCell() {
		return this.cell;
	}
	
	/**
	 * Getter method for birthday
	 * @return the birthday of this person
	 */
	public int getBirthDay() {
		return this.bDay;
	}
	
	/**
	 * Getter method for birth MONTH
	 * @return the month that this person was born in
	 */
	public int getBirthMonth() {
		return this.bMonth;
	}
	
	/**
	 * Setter method for this person's first name
	 * @param s the desired first name
	 */
	public void setFirstName(String s) {
	this.fName = s;
		
	}
	
	/**
	 * Setter method for this person's last name
	 * @param s the desired last name
	 */
	public void setLastName(String s) {
	this.lName = s;
	}
	
	/**
	 * Setter method for this person's cell number
	 * @param c the desired cell number
	 */
	public void setCell(String c) {
	this.cell = c;
	}
	
	/**
	 * Setter method for this person's day of birth
	 * @param d the day of birth
	 */
	public void setBirthDay(int d) {
	this.bDay = d;
	}
	
	/**
	 * Setter method for this person's month of birth
	 * @param m the month of birth
	 */
	public void setBirthMonth(int m) {
	this.bMonth = m;	
	}
	
	/**
	 * Method which returns a string detailing all information of a given instance of class person
	 * @return a string with all this person's information
	 */
	@Override
	public String toString() {
	    return "NAME: " + getFirstName() + " " + getLastName() + ", BDAY: " + getBirthMonth() + "/" + getBirthDay() + ", CELL#: " +
	            getCell();
	}
	
	/**
	 * OVerriding the compareTo method to order objects by last name
	 * @param other the other object we are comparing to
	 * @return the correct ordering when using Collections.Sort
	 */
	
	@Override
	public int compareTo(Person other) {
		return this.getLastName().compareTo(other.getLastName());
	}

	/**
	 * Was not sure how to compare two things in one compareTo method, however i have created another compareTo which compares the first names
	 * @param other the other object we are comparing to
	 * @return the correct ordering when using Collections.Sort (if this were the true compareTo method from the comparable interface)
	 */
	public int compareTo1(Person other) {
		return this.getFirstName().compareTo(other.getFirstName());
	}
	
}
