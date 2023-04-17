package stacksqueuesdequesdemo;

import java.util.Stack;

public class StackDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Stack<String> dogStack = new Stack<String>();
		dogStack.push("Bas");
		dogStack.push("Bird");
		dogStack.push("Luci");
		dogStack.pop();
		System.out.println(dogStack);
		System.out.println(dogStack.peek());
		dogStack.push("Fudge");
		dogStack.push("Blonkie");
		dogStack.push("Audrey");
		dogStack.push("Zelda");
		dogStack.push("Midge");
		dogStack.push("Carmen");
		System.out.println(dogStack);
		System.out.println("\n**********Printing all the elements until the stack is empty**********");
		while(!dogStack.isEmpty()) {
			System.out.println(dogStack.pop());
		}
		Stack<String> myStack = new Stack<String>();
		myStack.push("Fun");
		myStack.push("Is");
		myStack.push("Science");
		myStack.push("Computer");
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek() + " "); 
		myStack.pop();
		System.out.print(myStack.peek()); 
		myStack.pop();
		System.out.println();
	}

}
