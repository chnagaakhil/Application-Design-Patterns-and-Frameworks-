package movies;

import enums.Roles;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public class Technician extends Person {
	private Roles role;
	
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 * @param role
	 */
	public Technician(String firstName, String lastName, Roles role) {
		super(firstName, lastName);
		this.role = role;
	}
	/**
	 * Getter Methods
	 * @return role
	 */
	public Roles getRole() {
		return this.role;
	}
	/**
	 * Setter Methods
	 * @param role
	 */
	public void setRole(Roles role) {
		this.role = role;
	}
	/**
	 * CompareTo Method
	 */
	@Override
	public int compareTo(Person p) {
		Technician tText = (Technician) p;
		return this.role.compareTo(tText.role);
	}
	/**
	 * toString() Method
	 */
	@Override
	public String toString() {
		return  String.format("%-37s",super.toString() )+ this.getRole();
	}
}
