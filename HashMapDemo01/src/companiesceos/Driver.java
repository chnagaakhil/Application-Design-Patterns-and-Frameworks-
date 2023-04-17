package companiesceos;

import java.util.HashMap;

public class Driver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashMap<Company, CEO> myMap = new HashMap<Company, CEO>();
		Company c1 = new Company("Google","Mountain View CA",1220);
		Company c2 = new Company("Microsoft","RedMount WA",1850);
		Company c3 = new Company("Apple","OneApplePark CA",2400);
		Company c4 = new Company("Spotify","Stockholm Sweden",25);
		
		CEO h3 = new CEO("Google",80000000,"Sundar Pichai");
		CEO h0 = new CEO("Microsoft",100000000,"Satya Nadela");
		CEO h1 = new CEO("Apple",250000000,"Tim Cook");
		CEO h2 = new CEO("Spotify",500000,"Daniel Ek");
		
		myMap.put(c1, h3);
		myMap.put(c2, h0);
		myMap.put(c3, h1);
		myMap.put(c4, h2);
		
		System.out.println(myMap);
		
	}

}
