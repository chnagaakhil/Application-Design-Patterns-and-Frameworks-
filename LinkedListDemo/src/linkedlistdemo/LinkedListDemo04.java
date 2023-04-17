package linkedlistdemo;

import java.util.LinkedList;

public class LinkedListDemo04 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		LinkedList<Integer> variables = new LinkedList<Integer>();
		System.out.println("Adding elements into the LinkedList");
		variables.add(10);
		variables.add(20);
		variables.add(30);
		variables.add(40);
		variables.add(50);
		for(Integer i :variables) {
			System.out.println(i);
		}
		
		System.out.println("Creating a Parallel LinkedList");
		LinkedList<Integer> parallelList = new LinkedList<Integer>();
		parallelList.addAll(variables);
		for(Integer j :parallelList) {
			System.out.println(j);
		}
		System.out.println("Printing all the elements in the parallel LinkedList");
		for(Integer j :parallelList) {
			j = j * 3;
			System.out.println(j);
		}
	}
}
