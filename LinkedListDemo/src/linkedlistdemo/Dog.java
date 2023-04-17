package linkedlistdemo;

import java.util.Objects;

public class Dog implements Comparable<Dog>{
	private String name;
	private int age;
	public Dog(String name, int age) {
		super();
		this.name = name;
		this.age = age;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	@Override
	public int hashCode() {
		return Objects.hash(age, name);
	}
	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dog other = (Dog) obj;
		return age == other.age && Objects.equals(name, other.name);
	}
	public void setAge(int age) {
		this.age = age;
	}
	@Override
	public String toString() {
		return "\nDogSet [name=" + name + ", age=" + age + "]";
	}
	public int compareTo(Dog d) {
		return name.compareTo(d.getName());
	}
}
