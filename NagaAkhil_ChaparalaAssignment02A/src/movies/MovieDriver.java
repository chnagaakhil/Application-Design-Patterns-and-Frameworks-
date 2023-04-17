/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package movies;

import enums.Genre;
import enums.MPAA_Rating;
import enums.Roles;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map.Entry;
import java.util.Scanner;
/**
 * 
 * @author S549701 - Naga Akhil Chaparala
 *
 */
public class MovieDriver {
	/**
	 * @param args the command line arguments
	 */
	public static void main(String[] args) throws FileNotFoundException {
		// Create MovieMapping object as mapper and initialize it.
		MovieMapping Moviemapper = new MovieMapping();
		// Read given movies.txt and assign objects accordingly
		Scanner scan = new Scanner(new File("movies.txt"));
		// Start loop
		String keyText = scan.nextLine();
		while (scan.hasNext()) {
			if (keyText.equals("Movie")) {
				String title = scan.nextLine();
				String genre = scan.nextLine();
				Genre genr = Enum.valueOf(Genre.class, genre.toUpperCase());
				String collectText = scan.nextLine();
				String[] collecArray = collectText.split(" ");
				Double collections = valueConversion(collecArray[0], collecArray[1]);
				MPAA_Rating mpaa = Enum.valueOf(MPAA_Rating.class, scan.nextLine());
				Movie movieObj = new Movie(title, genr, mpaa, collections);
				scan.nextLine();
				keyText = scan.nextLine();
				while (!keyText.equalsIgnoreCase("Technicians")) {
					String[] line1 = keyText.split(" - ");
					String characterName = line1[0];
					String[] actorName = line1[1].split(" ");
					int age = Integer.parseInt(scan.nextLine());
					String[] remunerationArray = scan.nextLine().split(" ");
					Double remuneration = valueConversion(remunerationArray[0], remunerationArray[1]);
					Actor actorObj = new Actor(actorName[0], actorName[1], age, remuneration);
					movieObj.addCharacter(characterName, actorObj);
					keyText = scan.nextLine();
				}
				keyText = scan.nextLine();
				while (!keyText.equalsIgnoreCase("Movie")) {
					String[] tecnName = keyText.split(" ");
					String rText = scan.nextLine().replace(' ', '_');
					Roles role = Enum.valueOf(Roles.class, rText.toUpperCase());
					Technician techObj = new Technician(tecnName[0], tecnName[1], role);
					Moviemapper.addMovieCrewPerson(movieObj, techObj);
					if (scan.hasNext()) {
						keyText = scan.nextLine();
					} else {
						break;
					}
				}
			}

		}

		System.out.println("******************************************************\r\n"
				+ "Details of all movies in mapper");
		System.out.println(Moviemapper.toString());
		// Method call for getting all technicians of a given movie name
		System.out.println("******************************************************\r\n"
				+ "All technicians mapped with in movie Avengers\r\n"
				+ "******************************************************");
		LinkedList<Technician> allTechnicians = Moviemapper.getAllTechnicians("Avengers: Infinity War");
		for (Technician techText : allTechnicians) {
			String TechnName = techText.getFirstName() + " " + techText.getLastName();
			System.out.println(String.format("%-37s", TechnName) + techText.getRole());
		}
		// Method call for getting character names of an actor in different movies
		System.out.println("******************************************************\r\n"
				+ "Character names of actor Prabas Raju in different movies\r\n"
				+ "******************************************************");
		LinkedList<String> allMovieNames = Moviemapper.getListOfCharacterNames("Prabhas Raju");
		for (String mapperText : allMovieNames) {
			System.out.println(mapperText);
		}
		// Method call for getting all movie names of given actor name.
		System.out.println("******************************************************\r\n"
				+ "List of movies Anushka Shetty acted\r\n" + "******************************************************");
		LinkedList<Movie> ListOfMoviesAPersonActed = Moviemapper.getListOfMoviesAPersonActed("Anushka Shetty");
		for (Movie m : ListOfMoviesAPersonActed) {
			System.out.println(m.getTitle());
		}
		// Method call for printing all actors in mapper
		System.out.println("******************************************************\r\n"
				+ "List of all actors from all movies in the map\r\n"
				+ "******************************************************");
		LinkedList<Actor> allActors = Moviemapper.getAllActors();
		for (Actor actorText : allActors) {
			System.out.print(actorText.toString());
		}
		// Method call printing list of all movies based on gross collections in
		System.out.println("******************************************************\r\n"
				+ "List of all movies sorted based on gross collections in descending order\r\n"
				+ "******************************************************");
		HashMap<Movie, LinkedList<Person>> movies = Moviemapper.getMoviemap();

		List<Movie> moviesList = new ArrayList<Movie>();
		for(Entry<Movie, LinkedList<Person>> entry: movies.entrySet()) {
			moviesList.add(entry.getKey());
		}
		// descending order
		moviesList.sort(Comparator.comparing(Movie::getCollections));
		Collections.reverse(moviesList);
		for(Movie movieText: moviesList) {
			System.out.printf("%-30s $%.2f%n", movieText.getTitle(), movieText.getCollections());
		}

	}

	public static double valueConversion(String number, String value) {
	    double collection = Double.parseDouble(number.replace("$", ""));
	    if (value.equalsIgnoreCase("billion")) {
	        return collection * 1000000000.00;
	    } else if (value.equalsIgnoreCase("million")) {
	        return collection * 1000000.00;
	    } else {
	        return 0;
	    }
	}

}
