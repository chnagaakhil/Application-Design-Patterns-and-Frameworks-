package Question21;

import java.io.*;

public class Serialization implements Serializable {
	private String name;
	private int age;
	private double height;

	public Serialization(String name, int age, double height) {
		this.name = name;
		this.age = age;
		this.height = height;
	}

	public static void main(String[] args) {
		Serialization obj = new Serialization("Mahesh Babu", 47, 6.0);
		String filename = "object.ser";

		// Serialization
		try {
			FileOutputStream file = new FileOutputStream(filename);
			ObjectOutputStream out = new ObjectOutputStream(file);

			out.writeObject(obj);

			out.close();
			file.close();

			System.out.println("Object serialized successfully.");

		} catch(IOException ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		}

		// Deserialization
		try {
			FileInputStream file = new FileInputStream(filename);
			ObjectInputStream in = new ObjectInputStream(file);

			Serialization deserializedObj = (Serialization) in.readObject();

			in.close();
			file.close();

			System.out.println("Object deserialized successfully.");
			System.out.println("Name: " + deserializedObj.name);
			System.out.println("Age: " + deserializedObj.age);
			System.out.println("Height: " + deserializedObj.height);

		} catch(IOException | ClassNotFoundException ex) {
			System.out.println("Exception occurred: " + ex.getMessage());
		}
	}
}

