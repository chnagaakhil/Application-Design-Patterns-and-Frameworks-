package queue;

import java.util.LinkedHashSet;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.TimeUnit;
/*
 * s549701 - Naga Akhil Chaparala
 */
public class Queue {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		 LinkedBlockingQueue<Integer> queue = new LinkedBlockingQueue<Integer>(5);
         queue.add(1);
         System.out.println("Remanining capacity is: "+queue.remainingCapacity());
         for(int i=1;i<queue.remainingCapacity()+queue.size();i++) {
        	 queue.add(i);
        	 System.out.println("Remaining capacity is: "+queue.remainingCapacity());
         }
         queue.offer(1, 5, TimeUnit.SECONDS);
         System.out.println("Remaining capacity is: "+queue.remainingCapacity());
         try {
        	 queue.add(2);
         }
         catch(Exception e) {
        	 System.out.println("When we used the offer technique in the third phase, it "
        	 		+ "didn't add but instead waited until the allotted time to insert if "
        	 		+ "the queue wasn't already filled. But while using the add method,"
        	 		+ " I received an Exception since the queue was full.");
         }
         LinkedHashSet<Integer> list=new LinkedHashSet<Integer>();
         String set = "";
         for(int q:queue)
        	 if(!list.add(q))
        		 set+=q+" ";
         System.out.println("Duplicates in the queue are: "+list);
         try {
        	 queue.poll();
        	 queue.remove();
         }
         catch(Exception e) {
        	 System.out.println("Execution of the poll() and remove() methods with exception handling.");
         }
         queue.clear();
         try {
        	 queue.peek();
        	 queue.element();
         }
         catch(Exception e) {
        	 System.out.println("because there are no elements in the queue, when the methods peek() and element() "
        	 		+ "are called an exception is raised.");
         }
         System.out.println("the poll() method removes and returns an element.\r\n"
         		+ "The front-end element is eliminated with the delete() method. As queue "
         		+ "is empty in the next phase, the methods peek() and element() were not run.");
	}
}
