import java.util.ArrayList;
/**
 * Manager class which holds a list of employees and getter/setter methods for manager properties
 * @author Shayan Shadpour 104399871
 *
 */
public class Manager extends Employee {
	
	private ArrayList<Employee> managers;
	private int monthlyBonus;
	private ArrayList<Person> employees;

	/**
	 * constructor when the monthly bonus is not known
	 */
	public Manager() {
		this.monthlyBonus = 0;
	}
	
	/**
	 * constructor when the monthly bonus is known
	 * @param b
	 */
	public Manager(int b) {
		this.monthlyBonus = b;
	}
	
	/**
	 * Method to add a manager to the list. Also adds them to the list of employees
	 * @param name The instance name of the manager to be added
	 */
	public void addManager(Manager name) {
		employees.add(name);
		managers.add(name);
	}
	
	/**
	 * Method to remove a manager from the manager list. also removes them from the employees list
	 * @param name the name of the manager to be removed
	 */
	public void removeManager(Manager name) {
		employees.remove(name);
		managers.remove(name);
	}
	
	
	/**
	 * Setter method for the monthly bonus
	 * @param b the amount of the monthly bonus
	 */
	public void setMonthlyBonus(int b) {
		this.monthlyBonus = b;
	}
	
	/**
	 * Getter method for the monthly bonus
	 * @return the monthly bonus
	 */
	public int getMonthlyBonus() {
		return this.monthlyBonus;
	}
	
}
