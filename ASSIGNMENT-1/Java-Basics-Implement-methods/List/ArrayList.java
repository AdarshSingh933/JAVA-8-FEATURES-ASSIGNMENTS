// ArrayList is a resizable array implementation of the List interface.
import java.util.ArrayList;
import java.util.List;

public class ArrayListExample {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("Apple");
        list.add("Banana");
        list.add("Cherry");

        System.out.println("ArrayList: " + list);
        System.out.println("Element at index 1: " + list.get(1));
        list.remove("Banana");
        System.out.println("ArrayList after removal: " + list);
        System.out.println("Size of ArrayList: " + list.size());
        System.out.println("Is list empty? " + list.isEmpty());
    }
}
