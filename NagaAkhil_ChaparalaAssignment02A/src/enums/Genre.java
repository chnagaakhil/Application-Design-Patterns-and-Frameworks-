package enums;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public enum Genre {
	/**
	 * ENUM Genre
	 */
	BIOGRAPHY(3), DRAMA(5), FANTASY(3),
	HORROR(17), MYSTERY(10), POETRY(1),
	ROMANCE(12), SCIENCE_FICTION(8),
	THRILLER(13);
	/**
	 * Declaring private variables
	 */
	private int age;
	/**
	 * Private Genre Method
	 * @param age
	 */
	private Genre(int age) {
		this.age = age;
	}
	/**
	 * Getter Methods
	 * @return age
	 */
	public int getAge() {
		return this.age;
	}
}
