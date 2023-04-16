package Question10;

class Superclass {
	public void method() throws ArithmeticException {
		System.out.println("Superclass method");
	}
}

class Subclass extends Superclass {
	//Cannot the throws class in subclass
	//Uncomment to check
	/* @Override
	public void method() throws DivideByZeroException {
		System.out.println("Subclass method");
		int a = 10 / 0; // 
	}*/
}

public class OverridingClasses {
	public static void main(String[] args) {
		Superclass obj1 = new Superclass();
		Subclass obj2 = new Subclass();

		try {
			obj1.method();
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			obj2.method();
		} catch (ArithmeticException e) {
			System.out.println(e.getMessage());
		}
	}
}
