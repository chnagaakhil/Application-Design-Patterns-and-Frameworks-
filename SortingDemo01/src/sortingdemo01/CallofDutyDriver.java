package sortingdemo01;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class CallofDutyDriver {

	public static void main(String[] args) throws FileNotFoundException {
		ArrayList<CallofDuty> userList = new ArrayList<CallofDuty>();
		Scanner scan = new Scanner(new File("Data.txt"));
		while(scan.hasNext()) {
			CallofDuty user = new CallofDuty(scan.nextInt(), scan.next(),scan.next(),scan.nextDouble(),
					scan.nextInt());
			userList.add(user);
		}
		System.out.println("*******RAW List Printing Players after reading the data*******");
		printList(userList);
		
		System.out.println("*******Printing Players after sorting based on first name********");
		Collections.sort(userList);
        printList(userList);
	}
	
	private static void printList(List<CallofDuty> userList) {
        for(CallofDuty user : userList) {
             System.out.println(user);
        }
	}

}