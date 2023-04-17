package hashmapdemo;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class States {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<String, String> myMap = new HashMap<String, String>();
		myMap.put("MO","Missouri");
		myMap.put("TX","Texas");
		myMap.put("NY","New York");
		myMap.put("OH","Ohio");
		myMap.put("NB","Nebraska");
		myMap.put("MO", "Kansas");
		System.out.println(myMap.size());
		System.out.println("\nPrinting all the Keys in HashMap");
		System.out.println(myMap.keySet());
		System.out.println("\nPrinting all the Values in HashMap");
		System.out.println(myMap.values());
		System.out.println(myMap.entrySet());
		
		System.out.println(myMap.replace("MO", "Maryville"));
		System.out.println("\nAfter replacing a Key-Value");
		System.out.println(myMap.keySet());
		System.out.println(myMap.values());
		System.out.println(myMap.isEmpty());
		
		System.out.println("\nAfter checking all methods");
		System.out.println(myMap.putIfAbsent("MS", "Queens"));
		System.out.println(myMap.putIfAbsent("LA", "Los Angeles"));
		System.out.println(myMap.containsKey("MO"));
		System.out.println(myMap.containsKey("MS"));
		System.out.println(myMap.containsValue("Kansas"));
		System.out.println(myMap.size()+"\t"+myMap);
		System.out.println(myMap.getOrDefault("LA", "Los Angeles"));
		System.out.println(myMap.replace("MS", "Queens", "Atlanta"));
		System.out.println(myMap.size()+"\t"+myMap);
		
		
		System.out.println("\nPrinting all the values for Key starting with M");
		for (String key : myMap.keySet())
		{
			String value = myMap.get(key);
			if(key.startsWith("M")) {
				System.out.println(value);
			}
		}
		System.out.println("\nPrinting all the values length greater than 4");
		for(String key : myMap.keySet()) {
			String value = myMap.get(key);
			if(value.length() > 4) {
				System.out.println(value);
			}
		}
	}
}
