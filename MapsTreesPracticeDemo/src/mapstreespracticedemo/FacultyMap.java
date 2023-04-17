package mapstreespracticedemo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class FacultyMap {

	public static void main(String[] args) {
		Map<String, List<String>> fmap = new TreeMap<String, List<String>>();
		List<String> Eclasses = new ArrayList<String>(Arrays.asList("Big Data","Data Structures","Secure Programming"));
		fmap.put("Eloe", Eclasses);
		
		List<String> Bclasses = new ArrayList<String>(Arrays.asList("GDP-II","iOS","Capstone"));
		fmap.put("Bandi", Bclasses);
		
		List<String> Fclasses = new ArrayList<String>(Arrays.asList("Patterns","Patterns","Programming", "Secure Programming"));
		fmap.put("Fellah", Fclasses);
		
		List<String> Cclasses = new ArrayList<String>(Arrays.asList("Capstone","GDP-II","iOS", "Patterns"));
		fmap.put("Casse", Cclasses);
		
		List<String> Hclasses = new ArrayList<String>(Arrays.asList("WebApps","GDP-II","iOS", "Programming Languages"));
		fmap.put("Hoot", Hclasses);
		
		System.out.println(fmap.keySet());
		System.out.println(fmap.values());
		
		for(String s : fmap.keySet()) {
			System.out.println(s);
		}
		
		List<Integer> list = new ArrayList<Integer>();
		//Print the faculty who are teaching maximum number of courses
		for(List<String> s : fmap.values()) {
			list.add(s.size());
		}
		int max = list.get(0);
		for(int i = 0; i< list.size();i++) {
			if(max < list.get(i)) {
				max = list.get(i);
			}
		}
		System.out.println("\n"+max);
		
		//Print the faculty who are teaching minimum number of courses
		for(List<String> s : fmap.values()) {
			list.add(s.size());
		}
		int min = list.get(0);
		for(int i = list.size(); i < 0;i--) {
			if(min > list.get(i)) {
				min = list.get(i);
			}
		}
		System.out.println("\n"+min);
		
		//Print the faculty who are teaching maximum number of unique courses
		for(Map.Entry<String, List<String>> s : fmap.entrySet()) {
			List<String> m1 = s.getValue() ;
			if(m1.size()==max)
			{
				System.out.println(s.getKey());
			}
		}
		
		//Print the faculty who are teaching minimum number of unique courses
		for(Map.Entry<String, List<String>> s : fmap.entrySet()) {
			List<String> m2 = s.getValue() ;
			if(m2.size()==min)
			{
				System.out.println(s.getKey());
			}
		}
	}

}
