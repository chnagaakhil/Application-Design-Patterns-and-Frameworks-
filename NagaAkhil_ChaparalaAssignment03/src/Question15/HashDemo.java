package Question15;

import java.util.HashMap;
import java.util.Hashtable;

public class HashDemo {
	public static void main(String[] args) {
		// Creating a Hashtable to store movie directors and their birth years
		Hashtable<String, String> ht = new Hashtable<String, String>();
		ht.put("SSRajamouli", "RRR");
		ht.put("James Cameron", "Avatar Way of Water");
		ht.put("Prashanth Neel", "KGF Chapter 2");

		// Creating a HashMap to store the same data
		HashMap<String, String> hm = new HashMap<String, String>();
		hm.put("SSRajamouli", "RRR");
		hm.put("James Cameron", "Avatar Way of Water");
		hm.put("Prashanth Neel", "KGF Chapter 2");

		// Retrieving data from Hashtable
		System.out.println("Directors in Hashtable:");
		for (String director : ht.keySet()) {
			System.out.println(director + ": " + ht.get(director));
		}

		// Retrieving data from HashMap
		System.out.println("Directors in HashMap:");
		for (String director : hm.keySet()) {
			System.out.println(director + ": " + hm.get(director));
		}

		// Trying to add null key to Hashtable
		try {
			ht.put(null, "");
		} catch (NullPointerException e) {
			System.out.println("NullPointerException: " + e.getMessage());
		}

		// Adding null key to HashMap
		hm.put(null, "");
		System.out.println("Adding null key to HashMap: " + hm.get(null));
	}
}

