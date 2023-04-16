package Question25;

import java.util.*;
import java.util.function.*;

public class JavaFeaturesDemo {

	public static void main(String[] args) {

		// Lambda expressions
		List<String> names = Arrays.asList("John", "Jane", "Bob", "Alice");
		Collections.sort(names, (a, b) -> a.compareTo(b));
		System.out.println(names);

		// Method references
		names.forEach(System.out::println);

		// Streams
		List<Integer> numbers = Arrays.asList(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
		int sum = numbers.stream().filter(n -> n % 2 == 0).mapToInt(n -> n).sum();
		System.out.println("Sum of even numbers: " + sum);

		// Optional
		String str = null;
		Optional<String> optionalStr = Optional.ofNullable(str);
		if (optionalStr.isPresent()) {
			System.out.println("String value: " + optionalStr.get());
		} else {
			System.out.println("String is null");
		}

		// Default methods in interfaces
		List<String> fruits = Arrays.asList("Apple", "Banana", "Mango");
		fruits.sort(Comparator.naturalOrder());
		fruits.forEach(System.out::println);

		// Functional interfaces
		Predicate<String> predicate = s -> s.startsWith("J");
		boolean result = predicate.test("John");
		System.out.println(result);
	}
}
