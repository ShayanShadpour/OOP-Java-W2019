import java.util.ArrayList;
/**
 *Class for a company, contains list of employees and managers and other company details
 * @author Shayan Shadpour 104399871
 *
 */
public class Company{
	
	private String companyName;
	private String startingYear;
	
	private ArrayList<Manager> managers;
	private ArrayList<Employee> employees;

	/**
	 * Constructor class for company when all parameters are known
	 * @param s the company name
	 * @param y the company's starting year
	 */
	public Company(String s, String y) {
		this.companyName = s;
		this.startingYear = y;
	}
	
	/**
	 * Constructor class for when parameters are not known. set to zero or ""
	 */
	public Company() {
		this.companyName = "";
		this.startingYear = "";
	}
	


	/**
	 * Setter method for the company name
	 * @param s the desired company name
	 */
	public void setCompanyName(String s) {
		this.companyName = s;
	}
	
	/**
	 * Setter method for the starting year of the company
	 * @param y the desired starting year
	 */
	public void setStartingYear(String y) {
		this.startingYear = y;
	}
	
	/**
	 * Getter method for the company name
	 * @return the name of the company
	 */
	public String getCompanyName() {
		return this.companyName;
	}
	
	/**
	 * Getter method for the starting year
	 * @return the year that the company started in
	 */
	public String getStartingYear() {
		return this.startingYear;
	}

	/**
	 * Display method for employees
	 */
	public void displayEmployees() {
	        for(Employee p:employees){
	             System.out.println(p);
	        }
	}
	
	/**
	 * Display method for managers
	 */
	public void displayManagers() {
		for(Manager p:managers){
            System.out.println(p);
       }
	}
}
