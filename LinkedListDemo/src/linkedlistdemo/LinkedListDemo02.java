package linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo02 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> myList = new LinkedList<Integer>();
		System.out.println("Adding Elements using add to the List");
		myList.addFirst(3);
		myList.addFirst(2);
		myList.addLast(6);
		myList.addLast(8);
		myList.addFirst(15);
		for(Integer l :myList) {
			System.out.println(l);
		}
		System.out.println("\n");
		/*
		 * adding using add() Method
		 */
		System.out.println("Adding Elements using add() Method to the List");
		myList.add(3, 17);
		myList.add(5, 25); 
		myList.add(myList.indexOf(2) + 1,34);
		myList.set(4, 100);
		for(Integer a_l : myList) {
			System.out.println(a_l);
		}
	}

}
