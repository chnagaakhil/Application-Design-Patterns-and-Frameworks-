package stacksanddeques;

import java.util.ArrayDeque;

public class AStack<E> {
	private ArrayDeque<E> myStack;

    public AStack() {
        super();
        myStack = new ArrayDeque<E>();
    }
    public void setMyStack(ArrayDeque<E> myStack) {
		this.myStack = myStack;
	}

	public ArrayDeque<E> getMyStack() {
        return myStack;
    }

    public void push(E element) {

        myStack.push(element);
    }
    public E pop()
    {
       E pop= myStack.pop();
       return pop;
    }
    public E peek() 
    {
        E peek = myStack.peek();
        return peek;
        }
    public int size()
    {
        int size = myStack.size();
        return size;
    }
    public Boolean isEmpty() 
    {
        return myStack.isEmpty();
    }
}
