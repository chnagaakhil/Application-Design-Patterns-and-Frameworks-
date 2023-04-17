package linkedlistdemo;

import java.util.HashSet;
import java.util.Iterator;
import java.util.TreeSet;

public class SetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> dogSet = new HashSet<String>();
		dogSet.add("Midge");
		dogSet.add("Zelda");
		dogSet.add("Eve");
		dogSet.add("Carmen");
		dogSet.add("Leonard");
		dogSet.add("Zelda");
		System.out.println("Dog set contains "+ dogSet.size() + " elements: "+ dogSet);
		System.out.println("Midge is in set: "+ dogSet.contains("Midge"));
		System.out.println("Odie is in set: "+ dogSet.contains("Odie"));
		dogSet.remove("Midge");
		System.out.println("Dog set contains "+ dogSet.size() + " elements: "+ dogSet);
		System.out.println("Midge is in set: "+ dogSet.contains("Midge"));
		
		TreeSet<String> catSet = new TreeSet<String>();
		catSet.add("Maude");
		catSet.add("Garfield");
		catSet.add("Button");
		catSet.add("Moskowitz");
		catSet.add("Albert");
		System.out.println("Cat set contains "+ catSet.size() + " elements: "+ catSet);
		System.out.println("Maude is in set: "+ catSet.contains("Maude"));
		System.out.println();
		System.out.println("****Printing all the Elements in the DogSet using Enhanced For-Loop****");
		for (String dog : dogSet) {
			System.out.println(dog);
		}
		System.out.println();
		
		System.out.println("****Printing all the Elements in the CatSet using Iterator****");
		Iterator<String> iter = catSet.iterator();
		while (iter.hasNext())
		{
			System.out.println(iter.next());
		}
	}
}
