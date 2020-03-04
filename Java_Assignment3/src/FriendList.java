import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * FriendsList class which is a superclass of Person.java
 * @author Shayan Shadpour 104399871
 *
 */
public class FriendList extends Person {
	
	private ArrayList<Person> friends; //arraylist of "person" objects to have a list of friends
	
	/**
	 * Constructor to create a list of friends
	 */
	public FriendList() {
		friends = new ArrayList<>();
	}

	/**
	 * Method which lets you add a person to a list of friends
	 * @param name The name of the person object you want to add
	 */
	public void addFriend(Person name) {
		friends.add(name);
	}
	
	/**
	 * Method which lets you remove a person from a list of friends
	 * @param name The name of the person object you want to remove
	 */
	public void removeFriend(Person name) {
		friends.remove(name);
	}
	
	public void removeFirstName(String s) {
		for(Person p : friends) {
			if(p.getFirstName().equalsIgnoreCase(s)){
				friends.remove(p);		//inserting all friends that have the matching birth month
			}
		}
	}
	
	/**
	 * Method which returns the amount of friends currently in the list
	 * @return the number of friends in the list
	 */
	public int countFriends() {
		return friends.size();
	}
	
	/**
	 * Method which sorts the existing arraylist by comparing last names.
	 * @return arraylist correctly sorted
	 */
	public ArrayList<Person> sortByLastName(){
	
		Collections.sort(friends); //already defined how I want to sort in overwritten "compareTo" in person.java
        return friends;
    }
	
	/**
	 * Method which creates a new list and adds all friends with the wanted month, then sorts them by day.
	 * @return the correct arrayList, organized by month/sorted by day
	 */
	public ArrayList<Person> sortByMonth(int m){
		
		ArrayList<Person> monthFriends = new ArrayList<>(); //creating array of friends in given month
		
		for(Person p : friends) {
			if(p.getBirthMonth() == m){
				monthFriends.add(p);		//inserting all friends that have the matching birth month
			}
		}
		
		Collections.sort(monthFriends, new Comparator<Person>()  //using comparator to sort friends by day, now that we have our correct month
			{
				@Override
				public int compare(Person person, Person other) 
				{
					return person.getBirthDay() - other.getBirthDay();
				}
			}
		);
		
		return monthFriends;
	}
	
	
	/**
	 * Method which sorts friend list by days, then by last names
	 * @param d specific day we are using to sort our friend list
	 * @return
	 */
    public ArrayList<Person> sortByDay(int d) {
        ArrayList<Person> dayFriends = new ArrayList<>();
        for (Person p : friends) {
            if (p.getBirthDay() == d) {
                dayFriends.add(p);
            }
        }

        Collections.sort(dayFriends); //already have compareTo sorting by last names in Person.java
        return dayFriends;

    }
	
    /**
     * Method to sort friend list by given month and day (wasn't sure about what was wanted so created a method for just the day and one for both)
     * @param m The desired month
     * @param d The desired day
     * @return an arraylist which contains the friends who have a birthday on the given day and month
     */
    public ArrayList<Person> sortByDayAndMonth(int m, int d){
    	ArrayList<Person> monthFriends = new ArrayList<>(); //creating array of friends in given month
		ArrayList<Person> dayFriends = new ArrayList<>();	//creating the final arraylist for days in the month above

		for(Person p : friends) {
			if(p.getBirthMonth() == m){
				monthFriends.add(p);		//inserting all friends that have the matching birth month
			}
		}
		
        for (Person p : monthFriends) {
            if (p.getBirthDay() == d) {
                dayFriends.add(p);
            }
        }
        Collections.sort(dayFriends); //already have compareTo sorting by last names in Person.java
        return dayFriends;
    }
    
	
	/**
	 * Method which finds the cellphone number of a friend who has the matching first/last names given by the user
	 * @param fName the friend's first name
	 * @param lName the friend's last name
	 * @return the cellphone number of the correct friend
	 */
    public String getCellNumber(String fName, String lName) {

        for (Person person : friends) {

            if (person.getFirstName().equalsIgnoreCase(fName) &&
                    person.getLastName().equalsIgnoreCase(lName)) {
                return person.getCell();
            }
        }

        return "Friend not Found."; //if no match is found then we display this error message
    }
	
	

	
	
	


}
