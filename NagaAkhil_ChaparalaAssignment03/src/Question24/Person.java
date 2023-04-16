package Question24;

class Person {
	private String name;
	private int age;

	public Person(String name, int age) {
		this.name = name;
		this.age = age;
	}

	@Override
	protected void finalize() throws Throwable {
		// print message when object is garbage collected
		System.out.println(name + " object is garbage collected.");
	}
}