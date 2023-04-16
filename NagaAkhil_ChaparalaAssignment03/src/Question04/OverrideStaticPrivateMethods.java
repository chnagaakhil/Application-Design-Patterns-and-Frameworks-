package Question04;

class Parent {
    static void staticMethod() {
        System.out.println("Parent's static method");
    }
    
    private void privateMethod() {
        System.out.println("Parent's private method");
    }
}

class Child extends Parent {
	// Overriding the static method - Causes an error
	// Uncomment to check
	/*
	@Override
    static void staticMethod() {
        System.out.println("Child's static method");
    }
    */
    
	// Overriding the private method - Causes an error
	// Uncomment to check
	/*
	@Override
    private void privateMethod() {
        System.out.println("Child's private method");
    }
    */
}

public class OverrideStaticPrivateMethods {
    public static void main(String[] args) {
    }
}
