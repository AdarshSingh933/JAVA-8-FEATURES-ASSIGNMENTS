import java.util.PriorityQueue;
import java.util.Comparator;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class PriorityQueueDescendingOrderExample {
    public static void main(String[] args) {
        // Define a custom comparator that orders Person objects by age in descending order
        Comparator<Person> ageDescendingComparator = new Comparator<Person>() {
            @Override
            public int compare(Person p1, Person p2) {
                return Integer.compare(p2.age, p1.age); // Reverse the natural order
            }
        };

        // Create a PriorityQueue with the custom comparator
        PriorityQueue<Person> queue = new PriorityQueue<>(ageDescendingComparator);

        // Add elements to the PriorityQueue
        queue.add(new Person("John", 25));
        queue.add(new Person("Jane", 22));
        queue.add(new Person("Doe", 30));

        // Display and remove elements from the PriorityQueue
        System.out.println("PriorityQueue elements ordered by age in descending order:");
        while (!queue.isEmpty()) {
            System.out.println(queue.poll()); // Remove and display the highest age first
        }
    }
}
