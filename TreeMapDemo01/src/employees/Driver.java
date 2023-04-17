package employees;

import java.util.TreeMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		TreeMap<Employee, Department> myMap = new TreeMap<Employee, Department>();
		Employee e1 = new Employee(123,"John",90000);
		Employee e2 = new Employee(456,"Joyce",40000);
		Employee e3 = new Employee(789,"Ashley",80000);
		Employee e4 = new Employee(124,"Erica",70000);
		Employee e5 = new Employee(135,"Jim",90000);
		Employee e6 = new Employee(678,"Jimmy",90000);
		
		Department d1 = new Department(004,"IIC");
		Department d2 = new Department(044,"CSIS");
		Department d3 = new Department(032,"Marketing");
		Department d4 = new Department(017,"Math");
		Department d0 = new Department(567,"Accounting");
		Department d5 = new Department(133,"Library");
		Department d6 = new Department(895,"Admin");
		
		myMap.put(e1, d2);
		myMap.put(e2, d3);
		myMap.put(e3, d4);
		myMap.put(e4, d1);
		myMap.put(e5, d0);
		myMap.put(e5, d6);
		myMap.put(e6, d5);
		
		System.out.println(myMap);
	}
}
