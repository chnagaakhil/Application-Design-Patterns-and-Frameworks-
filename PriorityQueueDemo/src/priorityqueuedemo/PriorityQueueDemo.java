package priorityqueuedemo;

import java.util.PriorityQueue;

public class PriorityQueueDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		PriorityQueue<String> pq = new PriorityQueue<String>();
		pq.add("Telugu");// 4
		pq.add("Mandarin"); // 6
		pq.add("English"); // 1
		pq.add("Spanish"); // 2
		pq.add("Tamil"); // 5
		pq.add("Hindi"); // 3
		System.out.println(pq);
		System.out.println(pq.size());
		
		PriorityQueue<Integer> IT = new PriorityQueue<Integer>();
		IT.add(5);
		IT.add(2);
		IT.add(1);
		IT.add(3);
		IT.add(4);
		System.out.println(IT);
		System.out.println(IT.size());
		
		PriorityQueue<String> q = new PriorityQueue<String>();
		q.add("d");
		q.add("e");
		q.add("c");
		q.add("a");
		q.add("b");
		System.out.println(q);
		System.out.println(q.size());
	}
}