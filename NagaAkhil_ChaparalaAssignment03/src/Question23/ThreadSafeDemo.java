package Question23;

public class ThreadSafeDemo {

	public static void main(String[] args) {
		ImmutableClass obj = new ImmutableClass("Hello", 10);
		System.out.println("Original object: " + obj);

		// Create multiple threads to access the object concurrently
		Thread t1 = new Thread(new MyRunnable(obj));
		Thread t2 = new Thread(new MyRunnable(obj));
		t1.start();
		t2.start();
	}

	static class MyRunnable implements Runnable {
		private final ImmutableClass obj;

		MyRunnable(ImmutableClass obj) {
			this.obj = obj;
		}

		public void run() {
			System.out.println("Thread " + Thread.currentThread().getId() + " accessed object: " + obj);
			System.out.println("Thread " + Thread.currentThread().getId() + " tried to modify object...");
			obj.setValue(20); // Try to modify the immutable object
			System.out.println("Thread " + Thread.currentThread().getId() + " finished execution...");
		}
	}
}

final class ImmutableClass {
	private final String str;
	private final int value;

	public ImmutableClass(String str, int value) {
		this.str = str;
		this.value = value;
	}

	public String getStr() {
		return str;
	}

	public int getValue() {
		return value;
	}

	public ImmutableClass setValue(int newValue) {
		// Note: This method returns a new instance of the class with the updated value
		return new ImmutableClass(str, newValue);
	}

	public String toString() {
		return "str = " + str + ", value = " + value;
	}
}


