// LinkedList is a doubly linked list implementation of the List interface.
import java.util.LinkedList;
import java.util.List;

public class LinkedListExample {
    public static void main(String[] args) {
        List<String> list = new LinkedList<>();
        list.add("Dog");
        list.add("Elephant");
        list.add("Fox");

        System.out.println("LinkedList: " + list);
        System.out.println("Element at index 2: " + list.get(2));
        list.remove("Elephant");
        System.out.println("LinkedList after removal: " + list);
        System.out.println("Size of LinkedList: " + list.size());
    }
}
