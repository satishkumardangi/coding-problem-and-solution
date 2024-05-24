Problem 1
Implementation of PhoneBook service and Junit testcase. More discussion around implementation using map like hashcode/equals. :
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

interface PhoneBook {
                void addEntry(Person person, PhoneNumber phoneNumber);
                PhoneNumber lookup(Person person);
}
