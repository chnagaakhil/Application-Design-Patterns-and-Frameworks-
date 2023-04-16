package Question26;

public class PureSingleton {

	private static final PureSingleton instance = new PureSingleton();

	private PureSingleton() {
		System.out.println("Creating a PureSingleton instance.");
	}

	public static PureSingleton getInstance() {
		return instance;
	}

	public void showMessage() {
		System.out.println("This is a PureSingleton object.");
	}

	public static void main(String[] args) {
		PureSingleton obj1 = PureSingleton.getInstance();
		PureSingleton obj2 = PureSingleton.getInstance();

		System.out.println("obj1 hash code: " + obj1.hashCode());
		System.out.println("obj2 hash code: " + obj2.hashCode());

		obj1.showMessage();
	}
}

