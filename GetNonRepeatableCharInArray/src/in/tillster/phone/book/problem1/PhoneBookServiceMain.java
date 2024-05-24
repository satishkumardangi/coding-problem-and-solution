/**
 * 
 */
package in.tillster.phone.book.problem1;

/**
 * 
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

		PhoneBookService pbs = new PhoneBookService();
		pbs.addEntry(new Person("Savi","Dangi"), new PhoneNumber(44543534L));
		pbs.addEntry(new Person("Rakesh","Roshan"), new PhoneNumber(4454333534L));
		pbs.addEntry(new Person("Amanjeet","Singh"), new PhoneNumber(49999534L));
		pbs.addEntry(new Person("Vihan","Dahiya"), new PhoneNumber(33243434L));
		
		PhoneNumber pn=pbs.lookup(p3);
		System.out.println("Phone Number ["+pn.getPhoneNumber()+"]");
		

	}

}
