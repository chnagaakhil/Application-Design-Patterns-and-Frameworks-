package Question02;

public class AccessModifiers {
    public static void main(String[] args) {
    }
}

class Animal {
    public void publicMethod() {
        System.out.println("This is a public method.");
    }

    protected void protectedMethod() {
        System.out.println("This is a protected method.");
    }

    void defaultMethod() {
        System.out.println("This is a default method.");
    }

    private void privateMethod() {
        System.out.println("This is a private method.");
    }
}

class Dog extends Animal {
	// Converting the public method to private - Causes an error
	// Uncomment the method to check
	/* private void publicMethod() {
		System.out.println("This is a public method converted to private");
	} */
	
	
	// Converting the protected method to public - Possible
	public void protectedMethod() {
		System.out.println("This is a protected method converted to public");
	}
	
	// Converting the private method to protected - Possible
	protected void privateMethod() {
		System.out.println("This is a private method converted to protected");
	}
	
	// Converting the default method to public - Causes an error
	// Uncomment the method to check
	/*
	private void defaultMethod() {
		System.out.println("This is a default method converted to private");
	} */
	
}
