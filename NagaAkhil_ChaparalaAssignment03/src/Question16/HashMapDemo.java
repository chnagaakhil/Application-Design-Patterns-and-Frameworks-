package Question16;

import java.util.HashMap;

public class HashMapDemo {
    public static void main(String[] args) {
        HashMap<String, String> directorMap = new HashMap<>();
        
        // adding key-value pairs to the HashMap
        directorMap.put("Christopher Nolan", "The Dark Knight");
        directorMap.put("James Cameron", "Avatar Way of Water");
        directorMap.put("SSRajamouli", "RRR");
        directorMap.put("Prashanth Neel", "KGF Chapter 2");
        
        // retrieving a value from the HashMap
        String movie = directorMap.get("SSRajamouli");
        System.out.println("SSRajamouli's movie: " + movie);
        
        // removing a key-value pair from the HashMap
        directorMap.remove("Christopher Nolan");
        System.out.println("Removed Christopher Nolan's movie from the HashMap");
        
        //Finally Directors and Movie List from HashMap
        System.out.println(directorMap);
    }
}

