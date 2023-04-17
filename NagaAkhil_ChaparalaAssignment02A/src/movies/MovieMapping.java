package movies;

import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public class MovieMapping {
	private HashMap<Movie, LinkedList<Person>> movieMap = new HashMap<Movie, LinkedList<Person>>();

	public MovieMapping() {
	}

	public HashMap<Movie, LinkedList<Person>> getMoviemap() {
		return movieMap;
	}

	public void setMovieMap(HashMap<Movie, LinkedList<Person>> movieMap) {
		this.movieMap = movieMap;
	}

	public void addMovieCrewPerson(Movie movie, Person person) {
		if (!this.movieMap.containsKey(movie)) {
			this.movieMap.put(movie, new LinkedList<Person>());
		}
		this.movieMap.get(movie).add(person);
	}

	public LinkedList<Movie> getListOfMoviesAPersonActed(String actorFullName) {
		LinkedList<Movie> allMovies = new LinkedList<Movie>();
		for(Entry<Movie, LinkedList<Person>> e1: movieMap.entrySet()) {
			Movie movie = e1.getKey();
			HashMap<String, Actor> list = movie.getCharacters();
			for(Entry<String, Actor> actorEntry: list.entrySet()) {
				if((actorEntry.getValue().getFirstName()+" "+actorEntry.getValue().getLastName()).equals(actorFullName)) {
					allMovies.add(movie);
				}
			}
		}
		return allMovies;
	}

	public LinkedList<Technician> getAllTechnicians(String movieName) {
		LinkedList<Technician> allTechnicians = new LinkedList<Technician>();
		for (Entry<Movie, LinkedList<Person>> e2 : movieMap.entrySet()) {
			Movie movie = e2.getKey();
			LinkedList<Person> list = e2.getValue();
			if (movie.getTitle().equals(movieName)) {
				for (int i = 0; i < list.size(); i++)
					if (list.get(i) instanceof Technician)
						allTechnicians.add((Technician) list.get(i));
			}
		}

		return allTechnicians;
	}

	public LinkedList<String> getListOfCharacterNames(String actor) {
		LinkedList<String> characterNames = new LinkedList<>();
		for (Entry<Movie, LinkedList<Person>> e3 : movieMap.entrySet()) {
			Movie movie = e3.getKey();
			HashMap<String, Actor> list = movie.getCharacters();
			for (Entry<String, Actor> entry1 : list.entrySet()) {
				if (((entry1.getValue()).getFirstName() + " " + (entry1.getValue()).getLastName()).equals(actor)) {
					characterNames.add(entry1.getKey());
				}
			}
		}
		Collections.sort(characterNames);
		return characterNames;
	}

	public LinkedList<Actor> getAllActors() {
		LinkedList<Actor> allActors = new LinkedList<>();
		HashSet<String> actorSet = new HashSet<>();
		for (Entry<Movie, LinkedList<Person>> entry : movieMap.entrySet()) {
			HashMap<String, Actor> list = entry.getKey().getCharacters();
			for (Entry<String, Actor> entry1 : list.entrySet()) {
				if (!actorSet.contains(entry1.getValue().toString())) {
					allActors.add(entry1.getValue());
					actorSet.add(entry1.getValue().toString());
				}
			}
		}
		Collections.sort(allActors,Collections.reverseOrder());
		return allActors;
	}

	@Override
	public String toString() {
		StringBuilder strBuild = new StringBuilder();
		List<Map.Entry<Movie, LinkedList<Person>> > list1 = new LinkedList<Map.Entry<Movie, LinkedList<Person>> >( movieMap.entrySet());
		Collections.sort(list1,(i1, i2) -> i1.getKey().getTitle().compareTo(i2.getKey().getTitle()));
		Collections.sort(list1,(i1, i2) -> i1.getKey().getGenre().compareTo(i2.getKey().getGenre()));
		for (Entry<Movie, LinkedList<Person>> entry : list1) {
			strBuild.append("******************************************************\n");
			strBuild.append(entry.getKey().toString() + "\n");
			strBuild.append("------------------------------------------------------\n");
			strBuild.append("Movie crew\n");
			strBuild.append("------------------------------------------------------\n");
			strBuild.append("Name                                    Role\n");
			strBuild.append("------------------------------------------------------\n");
			LinkedList<Technician> list = this.getAllTechnicians(entry.getKey().getTitle());
			for (int i = 0; i < list.size(); i++) {
				String perName = list.get(i).toString();
				strBuild.append(perName + "\n");
			}
		}
		return strBuild.toString();
	}


}
