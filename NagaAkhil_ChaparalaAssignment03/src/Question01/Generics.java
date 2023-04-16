package Question01;

import java.util.*;

public class Generics {
	public static void main(String[] args) {
		// Example 1: Generic List
		List<String> courseList = new ArrayList<>();
		courseList.add("Mobile Computing IOS");
		courseList.add("Patterns and Frameworks");
		courseList.add("Project Management");
		System.out.println("List of Courses: " + courseList);

		// Example 2: Generic Map
		Map<String, Integer> stringIntegerMap = new HashMap<>();
		stringIntegerMap.put("One", 1);
		stringIntegerMap.put("Two", 2);
		stringIntegerMap.put("Three", 3);
		System.out.println("Map of String-Integer: " + stringIntegerMap);

		// Example 3: Generic Class
		Pair<String, Integer> pair = new Pair<>("Project Management", 1);
		System.out.println("Pair of String-Integer: " + pair);
	}
}

// Generic Class Example
class Pair<Key, Value> {
	private final Key key;
	private final Value value;

	public Pair(Key key, Value value) {
		this.key = key;
		this.value = value;
	}

	public Key getKey() {
		return key;
	}

	public Value getValue() {
		return value;
	}

	@Override
	public String toString() {
		return "(" + key + ", " + value + ")";
	}
}
