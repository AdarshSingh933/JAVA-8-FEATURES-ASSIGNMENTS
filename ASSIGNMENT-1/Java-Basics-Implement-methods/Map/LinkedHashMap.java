// LinkedHashMap maintains the order of insertion.

import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMapExample {
    public static void main(String[] args) {
        Map<String, Integer> map = new LinkedHashMap<>();
        map.put("Apple", 1);
        map.put("Banana", 2);
        map.put("Cherry", 3);

        System.out.println("LinkedHashMap: " + map);
        System.out.println("Value for key 'Banana': " + map.get("Banana"));
        map.remove("Apple");
        System.out.println("LinkedHashMap after removal: " + map);
        System.out.println("Size of LinkedHashMap: " + map.size());
    }
}