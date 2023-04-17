package setsdemo;

import java.util.HashSet;
import java.util.TreeSet;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Dog d1 = new Dog("German Shepherd",8);
		Dog d2 = new Dog("Pundraniun",6);
		Dog d3 = new Dog("Tommy",5);
		Dog d4 = new Dog("Spike",8);
		Dog d5 = new Dog("Austrin",2);
		Dog d6 = new Dog("Spike",5);
		TreeSet<Dog> dogTree = new TreeSet<Dog>();
		dogTree.add(d1);
		dogTree.add(d2);
		dogTree.add(d3);
		dogTree.add(d5);
		dogTree.add(d5);
		dogTree.add(d6);
		System.out.println("\nTreeSet of Dog");
		System.out.println(dogTree);
		
		HashSet<Dog> dogSet = new HashSet<Dog>();
		dogSet.add(d1);
		dogSet.add(d2);
		dogSet.add(d3);
		dogSet.add(d5);
		dogSet.add(d5);
		dogSet.add(d6);
		System.out.println("\nHashSet of Dog");
		System.out.println(dogSet);
	}

}
