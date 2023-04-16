package Question12;

public class FinalClasses {

	// Example of using the final keyword
	final int a = 10;
	final String b;

	public FinalClasses() {
		b = "Hello"; // Final variable can be initialized in constructor
	}

	final void display() {
		System.out.println("Final method");
	}

	public static void main(String[] args) {

		// Example of using the finally keyword
		try {
			int x = 5 / 0;
		} catch (ArithmeticException e) {
			System.out.println("Divide by zero exception");
		} finally {
			System.out.println("Finally block");
		}

		// Example of using the finalize() method
		FinalClasses obj = new FinalClasses();
		obj = null;
		System.gc(); // Invoking Garbage Collector
	}

	protected void finalize() {
		System.out.println("Finalize method called");
	}
}
