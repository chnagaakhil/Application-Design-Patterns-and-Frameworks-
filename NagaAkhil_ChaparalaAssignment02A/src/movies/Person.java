package movies;

import java.util.Objects;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public abstract class Person implements Comparable<Person> {
	/**
	 * Declaring the private variables
	 */
	private String firstName;
	private String lastName;
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 */
	public Person(String firstName, String lastName) {
		this.firstName = firstName;
		this.lastName = lastName;
	}
	/**
	 * Getter Methods
	 * @return firstName
	 */
	public String getFirstName() {
		return this.firstName;
	}
	/**
	 * Getter Methods
	 * @return lastName
	 */
	public String getLastName() {
		return this.lastName;
	}
	/**
	 * Hash Code
	 */
	@Override
	public int hashCode() {
		return Objects.hash(firstName, lastName);
	}
	/**
	 * Equals Method
	 */
	@Override
	public boolean equals(Object obj) {
		if(obj == this) {
        	return true;
        } else if(!(obj instanceof Person)) {
        	return false;
        } else {
        	Person p = (Person)obj;
        	return (this.firstName == p.firstName) && 
        			(this.lastName == p.lastName);
        }
	}
	/**
	 * toString() Method
	 */
	@Override
	public String toString() {
		return this.firstName + " " + this.lastName;
	}
}
