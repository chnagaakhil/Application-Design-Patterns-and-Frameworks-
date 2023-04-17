package movies;

import java.util.HashMap;
import enums.Genre;
import enums.MPAA_Rating;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public class Movie implements Comparable<Movie> {
	/**
	 * Declaring private variables
	 */
	private String title;
	private Genre genre;
	private MPAA_Rating rating;
	private double collections;
	private HashMap<String, Actor> characters;
	/**
	 * Constructor
	 * @param title
	 * @param genre
	 * @param rating
	 * @param collections
	 */
	public Movie(String title, Genre genre, MPAA_Rating rating, double collections) {
		this.title = title;
		this.genre = genre;
		this.rating = rating;
		this.collections = collections;
		this.characters = new HashMap<String, Actor>();
	}
	/**
	 * Getter Methods
	 * @return title
	 */
	public String getTitle() {
		return this.title;
	}
	/**
	 * Getter Methods
	 * @return genre
	 */
	public Genre getGenre() {
		return this.genre;
	}
	/**
	 * Getter Methods
	 * @return rating
	 */
	public MPAA_Rating getMPAARating() {
		return this.rating;
	}
	/**
	 * Getter Methods
	 * @return collections
	 */
	public double getCollections() {
		return this.collections;
	}
	/**
	 * Getter Methods
	 * @return characters
	 */
	public HashMap<String, Actor> getCharacters() {
		return this.characters;
	}
	/**
	 * Getter Methods
	 * @return characterName
	 * @return actor
	 */
	public void addCharacter(String characterName, Actor actor) {
		this.characters.put(characterName, actor);
	}
	/**
	 * CompareTo Method
	 * @param genre
	 */
	public void compareTo(Genre genre) {
		
	}
	/**
	 * toString() Method
	 */
	@Override
	public String toString() {
		String cast = "";
		for (HashMap.Entry<String, Actor> a : characters.entrySet()) {
			String character = String.format("%-30s", a.getKey());
			String actor = a.getValue().getFirstName() + " " + a.getValue().getLastName();
			cast += "\n" + character + actor;
		}
		return this.getTitle() + "\nGenre: " + this.getGenre() + "        Rating: " + this.getMPAARating() + " ("
		+ this.getMPAARating().getAge() + " Years)\r\n" + "Collections: $" + String.format("%.2f", this.getCollections()) + "\r\n"
		+ "Cast:\r\n" + "------------------------------------------------------\r\n"
		+ "Character Played                     Actor Name\r\n" + "------------------------------------------------------\r" + cast;
	}
	/**
	 * CompareTo Method
	 */
	@Override
	public int compareTo(Movie o) {
		// TODO Auto-generated method stub
		return 0;
	}
}
