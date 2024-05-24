package in.tillster.phone.book.problem2;

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
	 * =======================Solution Code START===========================
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
	
	public String toString() {
		return firstName+" "+lastName;		
	}
	/**
	 * =======================Solution Code END===========================
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

	/**
	 * =======================Solution Code START===========================
	 */

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof PhoneNumber p) {
			return this.phoneNumber == p.phoneNumber;
		} else {
			return false;
		}
	}
	/**
	 * =======================Solution Code END===========================
	 */

}

interface PhoneBook<T> {

	void addEntry(T person, PhoneNumber phoneNumber);

	PhoneNumber lookupByPerson(T person);

	T lookupByPhoneNumber(PhoneNumber phoneNumber);

}