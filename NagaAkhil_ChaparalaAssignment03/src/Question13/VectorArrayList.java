package Question13;

import java.util.ArrayList;
import java.util.List;
import java.util.Vector;

public class VectorArrayList {
	public static void main(String[] args) {
		// Creating a Vector
		List<String> vector = new Vector<>();
		vector.add("Java");
		vector.add("Python");
		vector.add("C++");

		// Creating an ArrayList
		List<String> arrayList = new ArrayList<>();
		arrayList.add("Java");
		arrayList.add("Python");
		arrayList.add("C++");

		// Retrieving elements from Vector
		System.out.println("Retrieving elements from Vector:");
		for (String element : vector) {
			System.out.println(element);
		}

		// Retrieving elements from ArrayList
		System.out.println("Retrieving elements from ArrayList:");
		for (String element : arrayList) {
			System.out.println(element);
		}

		// Removing an element from Vector
		vector.remove("Python");

		// Removing an element from ArrayList
		arrayList.remove("Python");

		// Retrieving elements from Vector after removal
		System.out.println("Retrieving elements from Vector after removal:");
		for (String element : vector) {
			System.out.println(element);
		}

		// Retrieving elements from ArrayList after removal
		System.out.println("Retrieving elements from ArrayList after removal:");
		for (String element : arrayList) {
			System.out.println(element);
		}
	}
}

