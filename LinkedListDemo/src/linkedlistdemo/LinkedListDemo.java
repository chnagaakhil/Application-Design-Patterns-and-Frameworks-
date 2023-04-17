package linkedlistdemo;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.ListIterator;
import java.util.Scanner;

public class LinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Creating a String Type LinkedList");
		LinkedList<String> designations = new LinkedList<>();
		
		System.out.println("Adding Elements into the designations LinkedList using add()\n");
		designations.add("Professor");
		designations.add("Assistant Professor");
		designations.add("Graduate Assistant");
		designations.add("Teaching Assistant");
		/*
		 * Printing the LinkedList after using add() with Enhanced For-Loop
		 */
		System.out.println("Printing the LinkedList after using add() with Enhanced For-Loop");
		System.out.println("****************************************************************");
		for(String d : designations) {
			System.out.println(d);
		}
		System.out.println("\n");
		
		/*
		 * Printing the LinkedList after using add Method using Enhanced For-Loop
		 */
		System.out.println("Adding Elements into the designations LinkedList using add Method\n");
		designations.add(0,"Student");
		
		System.out.println("Printing the LinkedList after using add Method with Enhanced For-Loop");
		System.out.println("*********************************************************************");
		for(String d : designations) {
			System.out.println(d);
		}
		System.out.println("\n");
		/*
		 * Printing the LinkedList using Iterator
		 */
		designations.add("Research Assistant");
		System.out.println("Printing the LinkedList using Iterator");
		System.out.println("**************************************");
		Iterator<String> d_it = designations.iterator();
		while(d_it.hasNext()) {
			System.out.println(d_it.next());
		}
		System.out.println("\n");
		
		/*
		 * Printing the LinkedList using ListIterator
		 */
		designations.add("Admin Data Assistant");
		System.out.println("Printing the LinkedList using ListIterator");
		ListIterator<String> d_lit = designations.listIterator();
		/*
		 * Printing the LinkedList next elements from HOME(first)
		 */
		System.out.println("Printing the LinkedList next elements from HOME(first)");
		System.out.println("******************************************************");
		while(d_lit.hasNext()) {
			System.out.println(d_lit.next());
		}
		System.out.println("\n");
		
		/*
		 * Printing the LinkedList previous elements from HOME(last)
		 */
		designations.add("Software Developer");
		ListIterator<String> dp = designations.listIterator(designations.size());
		System.out.println("Printing the LinkedList next elements from HOME(last)");
		System.out.println("*****************************************************");
		while(dp.hasPrevious()) {
			System.out.println(dp.previous());
		}
		System.out.println("\n");
		/*
		 * Taking Input from User and Printing all Elements from Index to Last
		 */
		System.out.println("Enter the Index Value");
		Scanner scan = new Scanner(System.in);
		int input = scan.nextInt();
		System.out.println("Printing all Elements from Index "+input+" to end of the list");
		System.out.println("*******************************************************");
		ListIterator<String> getOutput = designations.listIterator(input);
		while(getOutput.hasNext()) {
			System.out.println(getOutput.next());
		}
		System.out.println("\n");
		
		System.out.println("Printing all Elements from Beginning of List until the Index "+input);
		System.out.println("**************************************************************");
		ListIterator<String> getBegin = designations.listIterator(input);
		while(getBegin.hasPrevious()) {
			System.out.println(getBegin.previous());
		}
		System.out.println("\n");
		/*
		 * Deleting elements in the LinkedList using Traditional for-Loop
		 */
		System.out.println("Deleting elements in the LinkedList using Traditional for-Loop");
		System.out.println("**************************************************************");
		ListIterator<String> deleteList = designations.listIterator();
		for(;deleteList.hasNext();) {
			designations.remove();
		}
		/*
		 * Printing the LinkedList after Deletion
		 */
		System.out.println("Printing the LinkedList after Deletion");
		Iterator<String> print_it = designations.iterator();
		while(print_it.hasNext()) {
			System.out.println(print_it.next());
		}
		System.out.println("\n");
		/*
		 * Creating a New Linked List of Type Integer
		 */
		System.out.println("Creating a New Linked List of Type Integer");
		LinkedList<Integer> numbers = new LinkedList<>();
		numbers.add(10);
		numbers.add(20);
		numbers.add(30);
		numbers.add(40);
		numbers.add(50);
		/*
		 * Printing the LinkedList after using add() with Enhanced For-Loop
		 */
		System.out.println("Printing the LinkedList after using add() with Enhanced For-Loop");
		System.out.println("****************************************************************");
		for(Integer n : numbers) {
			System.out.println(n);
		}
		System.out.println("\n");
//		/*
//		 * Deleting element 30 from the LinkedList 
//		 */
//		System.out.println("Deleting Element 30 from the LinkedList");
//		System.out.println("***************************************");
//		int num = numbers.indexOf(30);
//		System.out.println("Index of Value 30 is "+num);
//		numbers.remove(num);
//		System.out.println("\n");
		/*
		 * Getting Error
		 */
		numbers.remove(Integer.valueOf(30));
		/*
		 * Printing the LinkedList after Deleting Element 30
		 */
		System.out.println("Printing the LinkedList after Deleting Element 30");
		System.out.println("*************************************************");
		for(Integer n : numbers) {
			System.out.println(n);
		}
		System.out.println("\n");
	}

}
