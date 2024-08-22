import java.util.Map;
import java.util.Set;
import java.util.Collection;
import java.util.concurrent.ConcurrentHashMap;
import java.util.function.Function;
import java.util.function.BiFunction;

public class ConcurrentHashMapExample {
    public static void main(String[] args) {
        // Create a ConcurrentHashMap and add some key-value pairs
        Map<String, Integer> map = new ConcurrentHashMap<>();
        map.put("John", 1);
        map.put("Jane", 2);
        map.put("Doe", 3);

        // Display the ConcurrentHashMap
        System.out.println("ConcurrentHashMap: " + map);
        
        // Retrieve and display the value for the key "Jane"
        System.out.println("Value for key 'Jane': " + map.get("Jane"));
        
        // Remove the key "John" and display the updated ConcurrentHashMap
        map.remove("John");
        System.out.println("ConcurrentHashMap after removal: " + map);
        
        // Display the size of the ConcurrentHashMap
        System.out.println("Size of ConcurrentHashMap: " + map.size());
        
        // Check if the key "Jane" is present in the ConcurrentHashMap
        System.out.println("Contains key 'Jane': " + map.containsKey("Jane"));
        
        // Display the set of keys
        Set<String> keySet = map.keySet();
        System.out.println("Key set: " + keySet);
        
        // Display the collection of values
        Collection<Integer> values = map.values();
        System.out.println("Values: " + values);
        
        // Display the set of map entries
        Set<Map.Entry<String, Integer>> entrySet = map.entrySet();
        System.out.println("Entry set: " + entrySet);
        
        // Compute a value for the key "Alice" if it's absent
        map.computeIfAbsent("Alice", key -> 4);
        System.out.println("ConcurrentHashMap after computeIfAbsent: " + map);
        
        // Merge a value with the existing value for key "Jane"
        map.merge("Jane", 5, (oldValue, newValue) -> oldValue + newValue);
        System.out.println("ConcurrentHashMap after merge: " + map);
    }
}
