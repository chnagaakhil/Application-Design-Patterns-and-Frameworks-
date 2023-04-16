package Question27;

public class SingletonSyncDemo {
	private static SingletonSyncDemo instance;

	private SingletonSyncDemo() {}

	public static synchronized SingletonSyncDemo getInstance() {
		if (instance == null) {
			System.out.println("Creating new instance of SingletonSyncDemo");
			instance = new SingletonSyncDemo();
		}
		return instance;
	}

	public void showMessage() {
		System.out.println("Hello, World!");
	}

	public static void main(String[] args) {
		System.out.println("Getting instance of SingletonSyncDemo");
		SingletonSyncDemo obj1 = SingletonSyncDemo.getInstance();

		System.out.println("Getting instance of SingletonSyncDemo again");
		SingletonSyncDemo obj2 = SingletonSyncDemo.getInstance();

		System.out.println("Are both instances equal? " + (obj1 == obj2));

		System.out.println("Calling showMessage method on obj1");
		obj1.showMessage();

		System.out.println("Calling showMessage method on obj2");
		obj2.showMessage();
	}
}

