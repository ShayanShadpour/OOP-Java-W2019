import java.util.ArrayList;
/**
 * Tester class for the FriendsList subclass. tests the methods
 * @author Shayan Shadpour 104399871
 *
 */
public class MyFriends {


    public static void main(String[] args) {

        FriendList myFriends = new FriendList();

        Person shane = new Person("Shane","Fludd","523-326-2315",11,20);
        Person isabelle  = new Person("Isabelle","Crossington","226-324-6783",11,16);
        Person charlie = new Person("Charlie","Arbuckle","123-456-7890",3,16);
        Person penny = new Person("Penny", "Proud","878-236-8484",2,14);

        myFriends.addFriend(shane);
        myFriends.addFriend(isabelle);
        myFriends.addFriend(charlie);
        myFriends.addFriend(penny);
        
        System.out.println("Currently, I have " + myFriends.countFriends() + " Friends!");

        //Sorting by last name
        System.out.println("");
        System.out.println("All friends(sorted by last name): ");
        ArrayList<Person> friends = myFriends.sortByLastName();
        for(Person p:friends){
            System.out.println(p);
        }
        
        //Sorting by month
        System.out.println(""); //creating a space for visibility
        System.out.println("Friends who are born in November: ");
        ArrayList<Person> novemberFriends = myFriends.sortByMonth(11);
        for(Person p:novemberFriends){
            System.out.println(p);
        }

        //Sorting by day
        System.out.println("");
        System.out.println("Friends who are born on the 16th of any month: ");
        ArrayList<Person> dayFriends = myFriends.sortByDay(16);
        for(Person p:dayFriends){
            System.out.println(p);
        }
        
        //Sorting by month and day
        System.out.println("");
        System.out.println("Friends who are born on the 16th of November ");
        ArrayList<Person> bdayFriends = myFriends.sortByDayAndMonth(11,16);
        for(Person p:bdayFriends){
            System.out.println(p);
        }
        
        //finding a friend's cellphone number by using their first and last name
        System.out.println("");
        System.out.println("Isabelle's cellphone number is: "+myFriends.getCellNumber(isabelle.getFirstName(),isabelle.getLastName()));
        
        //Removing a friend based on first name
        System.out.printf("\nNow removing all friends with the first name 'Shane'.\n");
        myFriends.removeFirstName("Shane");
        
        //Listing friends after removing 'Shane' to show he is gone
        System.out.printf("\nListing my friends once more: \n");
        for(Person p:friends){
            System.out.println(p);
        }
        
        System.out.println("");
        System.out.println("I am left with " + myFriends.countFriends()+" Friends.");

    }
    
}