package enums;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public enum MPAA_Rating {
	/**
	 * ENUM MPAA_Rating
	 */
	G("General Audiences", 0),
	NC_17("Adults Only", 18),
	PG("Parental Guidance Suggested", 12),
	PG_13("Parents Strongly Cautioned", 13),
	R("Restricted", 17);
	/**
	 * Declaring private variables
	 */
	private String description;
	private int age;
	/**
	 * Private MPAA_Rating Method
	 * @param description
	 * @param age
	 */
	private MPAA_Rating(String description, int age) {
		this.description = description;
		this.age = age;
	}
	/**
	 * Getter Methods
	 * @return description
	 */
	public String getDescription() {
		return this.description;
	}
	/**
	 * Getter Method
	 * @return age
	 */
	public int getAge() {
		return this.age;
	}
}
