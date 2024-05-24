package in.tillster.phone.book.problem1;
import java.util.Map;
import java.util.HashMap;
/**
 * Solution Implementation of PhoneBook interface
 */
public class PhoneBookService implements PhoneBook {
	
	Map<Person,PhoneNumber> tempStore = new HashMap<>();

	@Override
	public void addEntry(Person person, PhoneNumber phoneNumber) {
		tempStore.put(person, phoneNumber);
	}

	@Override
	public PhoneNumber lookup(Person person) {
		return tempStore.get(person);
	}
	

}
