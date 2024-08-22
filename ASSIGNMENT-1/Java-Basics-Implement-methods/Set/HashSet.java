import java.util.HashSet;
import java.util.Set;

public class HashSetExample {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();
        set.add("Apple");
        set.add("Banana");
        set.add("Cherry");

        System.out.println("HashSet: " + set);
        set.remove("Banana");
        System.out.println("HashSet after removal: " + set);
        System.out.println("Size of HashSet: " + set.size());
        System.out.println("Does HashSet contain 'Apple'? " + set.contains("Apple"));
    }
}
