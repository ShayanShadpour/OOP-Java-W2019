/**
 * Tester class for the company
 * @author Shayan Shadpour 104399871
 *
 */
public class MyCompany extends Company {

	
	public static void main(String[] args) {
	
	Company dell = new Company("Dell","1997");
	Employee james = new Employee("2000",5000,15,5);
	Manager robertson = new Manager(500);
	
	
	dell.addEmployee(james);	//adding james to employee list
	dell.addManager(robertson); //adding robertson to manager list, thus adding him to employee list as well
	
	 for(Employee p:employees){		//listing all employees
         System.out.println(p);
     }

	
	
	}
	
}
