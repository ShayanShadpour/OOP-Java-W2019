import java.util.ArrayList;

/**
 * Employee class which is a subclass of the Person superclass
 * @author Shayan Shadpour 104399871
 *
 */
public class Employee extends Person {
	private String hiringYear;
	private int salary;
	private int vdays;
	private int unusedvdays;
	private ArrayList<Person> employees;
	
	/**
	 * Constructor for Employee class
	 * @param y hiring year
	 * @param s annual salary
	 * @param v vacation days
	 * @param uv unused vacation days
	 */
	public Employee(String y, int s, int v, int uv) {
		this.hiringYear = y;
		this.salary = s;
		this.vdays = v;
		this.unusedvdays = uv;	
	}
	
	/**
	 * Constructor for no-input case
	 */
	public Employee() {
		this.hiringYear = "";
		this.salary = 0;
		this.vdays = 0;
		this.unusedvdays = 0;
	}
	

	/**
	 * method to add an employee to the list
	 * @param name the name of the employee
	 */
	public void addEmployee(Employee name) {
		employees.add(name);
	}
	
	/**
	 * Method to remove an employee from the list
	 * @param name
	 */
	public void removeEmployee(Employee name) {
		employees.remove(name);
	}
	
	//Below are the setter/getter methods of this class
	
	public void setYear(String y) {
		this.hiringYear = y;
	}
	
	
	public void setSalary(int s) {
		this.salary = s;
	}
	
	public void setVacation(int v) {
		this.vdays = v;
	}
	
	public void setUnusedVacation(int uv) {
		this.unusedvdays = uv;
	}
	
	public String getYear() {
		return this.hiringYear;
	}
	
	public int getSalary() {
		return this.salary;
	}
	
	public int getVacationDays() {
		return this.vdays;
	}
	
	public int getUnusedDays() {
		return this.unusedvdays;
	}
	
}
