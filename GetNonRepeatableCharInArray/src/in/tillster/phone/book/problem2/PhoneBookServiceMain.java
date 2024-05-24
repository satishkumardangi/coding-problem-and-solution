/**
 * 
 */
package in.tillster.phone.book.problem2;

/**
 * SOLUTION
 */
public class PhoneBookServiceMain {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		Person p1 = new Person("Savi","Dangi");
		Person p2 = new Person("Rakesh","Roshan");
		Person p3 = new Person("Amanjeet","Singh");
		Person p4 = new Person("Vihan","Dahiya");
		Person p5 = new Person(null,"Dahiya");

		PhoneBookService<Person> pbs = new PhoneBookService<>();
		pbs.addEntry(new Person("Savi","Dangi"), new PhoneNumber(44543534L));
		pbs.addEntry(new Person("Rakesh","Roshan"), new PhoneNumber(4454333534L));
		pbs.addEntry(new Person("Amanjeet","Singh"), new PhoneNumber(49999534L));
		pbs.addEntry(new Person("Vihan","Dahiya"), new PhoneNumber(33243434L));
		
		//Lookup By Person
		PhoneNumber pn=pbs.lookupByPerson(p3);
		System.out.println("Phone Number ["+pn.getPhoneNumber()+"]");
		
		PhoneNumber n4 = new PhoneNumber(33243434L);
		//Lookup By phone number
		Person p=pbs.lookupByPhoneNumber(n4);
		System.out.println("Phone Number ["+p.toString()+"]");

	}

}
