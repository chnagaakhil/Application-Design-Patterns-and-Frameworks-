package stacksanddeques;

import java.util.Iterator;

/*
 * s549701 - Naga Akhil Chaparala
 */
public class GreetingsStack {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AStack<Character> greeting = new AStack<>();
		greeting.push('H');
        greeting.push('A');
        greeting.push('P');
        greeting.push('P');
        greeting.push('Y');
        greeting.push(' ');
        greeting.push('N');
        greeting.push('E');
        greeting.push('W');
        greeting.push(' ');
        greeting.push('Y');
        greeting.push('E');
        greeting.push('A');
        greeting.push('R');
        
        Iterator<Character> greetStack = greeting.getMyStack().descendingIterator();
        while (greetStack.hasNext()) {
            System.out.print(greetStack.next());
        }
	}

}
