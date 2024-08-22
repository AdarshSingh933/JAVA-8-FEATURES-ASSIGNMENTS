import java.util.Map;
import java.util.TreeMap;
import java.util.Set;
import java.util.Collection;

public class TreeMapExample {
    public static void main(String[] args) {
        // Create a TreeMap and add some key-value pairs
        Map<String, Integer> map = new TreeMap<>();
        map.put("Lion", 1);
        map.put("Tiger", 2);
        map.put("Bear", 3);

        // Display the TreeMap
        System.out.println("TreeMap: " + map);
        
        // Retrieve and display the value for the key "Tiger"
        System.out.println("Value for key 'Tiger': " + map.get("Tiger"));
        
        // Remove the key "Lion" and display the updated TreeMap
        map.remove("Lion");
        System.out.println("TreeMap after removal: " + map);
        
        // Display the size of the TreeMap
        System.out.println("Size of TreeMap: " + map.size());
        
        // Display the first (lowest) key
        System.out.println("First key: " + ((TreeMap<String, Integer>) map).firstKey());
        
        // Display the last (highest) key
        System.out.println("Last key: " + ((TreeMap<String, Integer>) map).lastKey());
        
        // Display a subMap from "Bear" to "Tiger" (not inclusive of "Tiger")
        Map<String, Integer> subMap = ((TreeMap<String, Integer>) map).subMap("Bear", "Tiger");
        System.out.println("SubMap from 'Bear' to 'Tiger': " + subMap);
        
        // Display the navigable set of keys
        Set<String> keySet = ((TreeMap<String, Integer>) map).keySet();
        System.out.println("Key set: " + keySet);
        
        // Display the collection of values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);
        
        // Display the set of map entries
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Entry set: " + entrySet);
    }
}
