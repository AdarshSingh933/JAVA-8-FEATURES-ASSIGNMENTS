import java.util.LinkedHashSet;
import java.util.Set;

public class LinkedHashSetExample {
    public static void main(String[] args) {
        Set<String> set = new LinkedHashSet<>();
        set.add("X");
        set.add("Y");
        set.add("Z");

        System.out.println("LinkedHashSet: " + set);
        set.remove("Y");
        System.out.println("LinkedHashSet after removal: " + set);
        System.out.println("Size of LinkedHashSet: " + set.size());
    }
}
