Problem 2

Write PhoneBookImpl class which will implement PhoneBook interface . There were junits which need to be passed:

public class Person {
String firstName;
String lastName;
 
public void Person(String firstName, String lastName){
this.firstName = firstName;
this.lastName = lastName;
}
 
public String getFirstName() {
return this.firstName;
}
 
 
public String getLastName() {
return this.lastName;
}
}
 
class PhoneNumber {
long phoneNumber;
 
public void PhoneNumber(Long phoneNumber) {
this.phoneNumber = phoneNumber;
}
 
public long getPhoneNumber() {
return this.phoneNumber;
}
}
 
interface PhoneBook <PhoneNumber>{
void addEntry(T person, PhoneNumber phoneNumber);
PhoneNumber lookupByPerson(T person);
				T lookupByPhoneNumber(PhoneNumber phoneNumber);
 
}

 
We need to implement above three methods and also override equals and hascode method.


