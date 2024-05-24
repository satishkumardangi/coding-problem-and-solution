package in.tillster.phone.book.problem1;

public class Person {
	String firstName;
	String lastName;

	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}

	public String getFirstName() {
		return this.firstName;
	}

	public String getLastName() {
		return this.lastName;
	}

	/**
	 * START ====Code Added As Part Of Solution=======
	 */
	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Person p) {
			return this.firstName.equalsIgnoreCase(p.firstName) && this.lastName.equalsIgnoreCase(p.lastName);
		} else {
			return false;
		}
	}

	@Override
	public int hashCode() {
		return this.firstName.codePointAt(0);
	}
	/**
	 * END ====Code Added As Part Of Solution=======
	 */
}

class PhoneNumber {
	long phoneNumber;

	public PhoneNumber(Long phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public long getPhoneNumber() {
		return this.phoneNumber;
	}
}

interface PhoneBook {
	void addEntry(Person person, PhoneNumber phoneNumber);

	PhoneNumber lookup(Person person);

	/*
	 * void addEntry(T person, PhoneNumber phoneNumber);
	 * 
	 * PhoneNumber lookupByPerson(T person);
	 * 
	 * T lookupByPhoneNumber(PhoneNumber phoneNumber);
	 */
}