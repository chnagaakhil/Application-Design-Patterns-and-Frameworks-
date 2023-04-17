package stacksqueuesdequesdemo;

import java.util.LinkedList;
import java.util.Queue;

public class QueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Queue<String> people = new LinkedList<String>();
		people.add("Fudge");
		people.add("Blondie");
		people.remove();
		//System.out.println(people.peek());
		people.add("Computer");
		people.add("Science");
		people.add("is");
		people.add("fun");
		System.out.println("Element of Head: "+people.poll());
		people.remove();
		people.remove();
		people.add("Math");
		people.add("Blondie");
		System.out.println("Element of Head: "+people.poll());
		people.offer("NULL");
		while(!people.isEmpty()) {
			System.out.println(people.remove());
		}
		System.out.println(people.peek());
	}

}
