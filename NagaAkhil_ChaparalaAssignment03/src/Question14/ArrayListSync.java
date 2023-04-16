package Question14;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ArrayListSync {

	public static void main(String[] args) {
		// Creating an ArrayList
		List<String> list = new ArrayList<>();

		// Adding elements to the list
		list.add("Java");
		list.add("Python");
		list.add("C++");
		list.add("Ruby");

		// Synchronizing the entire ArrayList using synchronizedList() method of Collections class
		List<String> syncList = Collections.synchronizedList(list);

		// Synchronizing individual ArrayList methods using synchronized keyword
		synchronized (syncList) {
			System.out.println("Size of synchronized list: " + syncList.size());
		}

		synchronized (syncList) {
			syncList.add("PHP");
			syncList.add("JavaScript");
		}

		synchronized (syncList) {
			System.out.println("Synchronized list: " + syncList);
		}
	}
}


