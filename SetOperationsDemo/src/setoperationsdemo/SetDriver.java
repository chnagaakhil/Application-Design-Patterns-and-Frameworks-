package setoperationsdemo;

import java.util.HashSet;
import java.util.Set;

public class SetDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String> names =  new HashSet<String>();
		names.add("James");
		names.add("Smith");
		names.add("John");
		names.add("Barnes");
		names.add("John");
		names.add("Gary");
		names.add("Smith");
		System.out.println(names);
		HashSet<String> nicknames = new HashSet<String>();
		nicknames.add("Walter");
		nicknames.add("Lang");
		nicknames.add("James");
		nicknames.add("Smith");
		nicknames.add("Rogers");
		nicknames.add("Stark");
		nicknames.add("Bond");
		System.out.println(nicknames);
		HashSet<String> union = findUnion(names,nicknames);
		Set<String> common = findCommonElements(names,nicknames);
		Set<String> complement = findComplementOfSet1(names,nicknames);
		
		System.out.println(union);
		System.out.println("Number of Union Elements "+union.size());
		System.out.println(common);
		System.out.println("Number of Common Elements "+common.size());
		System.out.println(complement);
		System.out.println("Number of Complement Elements "+complement.size());
	}
	public static HashSet<String> findUnion(HashSet<String> names, HashSet<String> nicknames) {
		HashSet<String> union =  new HashSet<String>(names);
		union.addAll(nicknames);
		return union;
	}
	public static Set<String> findCommonElements(HashSet<String> names, HashSet<String> nicknames) {
		HashSet<String> common =  new HashSet<String>();
//		common.retainAll(nicknames);
//		return common;
		for(String s : names) {
			if(nicknames.contains(s)) {
				common.add(s);
			}
		}
		return common;
	}
	public static Set<String> findComplementOfSet1(HashSet<String> names, HashSet<String> union) {
		HashSet<String> complement =  new HashSet<String>(names);
		complement.removeAll(union);
		return complement;
	}
}
