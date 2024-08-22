// HashMap provides a hash table-based implementation of the Map interface.

import java.util.HashMap;
import java.util.Map;

public class HashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new HashMap<>();
        map.put("One", 1);
        map.put("Two", 2);
        map.put("Three", 3);

        System.out.println("HashMap: " + map);
        System.out.println("Value for key 'Two': " + map.get("Two"));
        map.remove("One");
        System.out.println("HashMap after removal: " + map);
        System.out.println("Size of HashMap: " + map.size());
        System.out.println("Does HashMap contain key 'Three'? " + map.containsKey("Three"));
    }
}