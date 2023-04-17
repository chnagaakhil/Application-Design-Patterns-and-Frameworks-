package linkedlist;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;
import java.util.Set;
/*
 * s549701 - Naga Akhil Chaparala
 */
public class StudentOperations {
	LinkedList<Student> studentList;
	public StudentOperations() {
		super();
		this.studentList = new LinkedList<Student>();
	}
	public void addStudents() throws FileNotFoundException {
		Scanner scan = new Scanner(new File("input.txt"));
		while(scan.hasNext()) {
			Student sList = new Student(scan.nextLine(),scan.nextInt());
			studentList.add(sList);
			if (scan.hasNext())
			{
				scan.nextLine();
			}
		}
	}
	public LinkedList<Student> removeDuplicates()
	{
		Set<Student> rem = new HashSet<Student>();
        LinkedList<Student> dList = new LinkedList<Student>();
        for(Student sList :rem)
        {
            dList.add(sList);
        }
        return dList;
	}
	public String displayDuplicatesNamesByRecursion(Iterator<Student> stuIterator)
	{
		String name1 = "", name2 = "";
        while(stuIterator.hasNext())
        {
            Student name = stuIterator.next();
            if(!name2.contains(name.getName()+name.getId())) {
                name2+=name.getName()+name.getId()+" ";
            }
            else if (!name1.contains(name.getName()))
            {
            	name1+=name.getName()+", ";
            }
       }
       return name1;
	}
	public LinkedList<Student> getStudentList() {
		return studentList;
	}
}
