package stacksanddeques;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

/*
 * s549701 - Naga Akhil Chaparala
 */
public class BooksStack {

	public static void main(String[] args) throws FileNotFoundException {
		// TODO Auto-generated method stub
		AStack<Book> books = new AStack<Book>();
		Scanner scan = new Scanner(new File("books.txt"));
		while(scan.hasNext())
		{
			String BookName = scan.nextLine();
			String Bookauthor = scan.nextLine();
			Book details = new Book(BookName, Bookauthor);
            books.push(details);
		}
		System.out.println("All books in the stack from top to bottom");
		System.out.println("-------------------------------------");
		for (Book book : books.getMyStack()) {
			System.out.println(book.toString());
	        System.out.println("-------------------------------------");
		}
		Book Stack = null;
	    for (Book bStack : books.getMyStack()) {
	    	if (bStack.getTitle().equals("Fantastic Beasts: The Crimes of Grindelwald")) {
	    			Stack = bStack;
	    		}
	        }
	        if (Stack != null) {
	            books.getMyStack().remove(Stack);
	        }
	    System.out.println("\n");
	    System.out.println("Stack after removing book with name Fantastic Beasts: The Crimes of Grindelwald");
	    System.out.println("-------------------------------------");
	    for (Book bksAfter : books.getMyStack()) {
	    	System.out.println(bksAfter.toString());
	        System.out.println("-------------------------------------");
	        }
	}

}
