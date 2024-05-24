package in.tillster.phone.book.problem2;
import java.util.Map;
import java.util.Map.Entry;
import java.util.HashMap;
import java.util.Optional;

public class PhoneBookService<T> implements PhoneBook<T> {
	Map<T,PhoneNumber> store = new HashMap<>();

	@Override
	public void addEntry(T person, PhoneNumber phoneNumber) {
		store.put(person, phoneNumber);
	}

	@Override
	public PhoneNumber lookupByPerson(T person) {
		return store.get(person);
	}

	@Override
	public T lookupByPhoneNumber(PhoneNumber phoneNumber) {
		Optional<Entry<T,PhoneNumber>>entryOpt=store.entrySet().stream().filter(e-> e.getValue().equals(phoneNumber)).findFirst();
		if(entryOpt.isPresent()) {
			return entryOpt.get().getKey();
		}else {
			return null;
		}
	}
	


}
