import java.util.Set;
import java.util.TreeSet;

public class TreeSetExample {
    public static void main(String[] args) {
        Set<String> set = new TreeSet<>();
        set.add("Dog");
        set.add("Cat");
        set.add("Elephant");

        System.out.println("TreeSet: " + set);
        set.remove("Cat");
        System.out.println("TreeSet after removal: " + set);
        System.out.println("Size of TreeSet: " + set.size());
    }
}
