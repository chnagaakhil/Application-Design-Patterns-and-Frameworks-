package Question24;

public class GarbageCollector {
	public static void main(String[] args) {
		// create objects
		Person p1 = new Person("John", 30);
		Person p2 = new Person("Sarah", 25);

		// set object references to null
		p1 = null;
		p2 = null;

		// call garbage collector
		System.gc();

		// print message to indicate program completion
		System.out.println("Program finished.");
	}
}


