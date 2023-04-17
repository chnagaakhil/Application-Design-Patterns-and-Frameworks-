package linkedlistdemo;

import java.util.LinkedList;
import java.util.ListIterator;

public class LinkedListDemo03 {

	private static LinkedList<Integer> numbers;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		numbers = new LinkedList<Integer>();
		numbers.addFirst(3);
		numbers.addFirst(2);
		numbers.addLast(6);
		numbers.addLast(8);
		numbers.addFirst(15);
		numbers.add(3, 17);
		numbers.add(5, 25); 
		numbers.add(numbers.indexOf(2) + 1,34);
		printList();
		System.out.println();
		numbers.set(4, 100);
		System.out.println(numbers.contains(34));
		System.out.println(numbers.contains(27));
		printList();
		System.out.println();
		System.out.println("size = " + numbers.size());
		numbers.removeFirst();
		numbers.removeLast();
		printList();
		System.out.println();
		numbers.addFirst(45);
		numbers.addFirst(30);
		numbers.addLast(75);
		numbers.addLast(93);
		numbers.addFirst(37);
		numbers.add(5, 110);
		numbers.add(9, 46);
		printList();
		System.out.println();
		removeOddNumbers();
		printList();
		System.out.println();
	}
	private static void printList() {
		ListIterator<Integer> myList = numbers.listIterator();
		while(myList.hasNext()) {
			System.out.print(myList.next() + " ");
		}
	}
	private static void removeOddNumbers() {
		ListIterator<Integer> myList2 = numbers.listIterator();
		while(myList2.hasNext()) {
			Integer num = myList2.next();
			if (num % 2 != 0) {
				myList2.remove();
			}
		}
	}
}
