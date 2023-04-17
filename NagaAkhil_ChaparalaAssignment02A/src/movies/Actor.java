package movies;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public class Actor extends Person {
	
	/**
	 * Declaring private variables
	 */
	private int age;
	private double remuneration;
	/**
	 * Constructor
	 * @param firstName
	 * @param lastName
	 * @param age
	 * @param remuneration
	 */
	public Actor(String firstName, String lastName, int age, double remuneration) {
		super(firstName, lastName);
		this.age = age;
		this.remuneration = remuneration;
	}
	/**
	 * Getter Methods
	 * @return age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * Setter Methods
	 * @param age
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * Getter Methods
	 * @return remuneration
	 */
	public double getRemuneration() {
		return remuneration;
	}
	/**
	 * Setter Methods
	 * @param remuneration
	 */
	public void setRemuneration(double remuneration) {
		this.remuneration = remuneration;
	}
	/**
	 * CompareTo Method
	 */
	@Override
	public int compareTo(Person p) {
		Actor aText = (Actor) p;
		return Double.compare(this.remuneration, aText.remuneration);
	}
	/**
	 * toString Method
	 */
	@Override
	public String toString() {
		return  String.format("%-37s", super.toString())  +"Age: " + this.getAge()+"\n";
	}
}
