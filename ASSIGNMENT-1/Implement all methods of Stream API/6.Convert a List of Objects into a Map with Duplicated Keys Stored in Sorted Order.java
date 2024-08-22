import java.util.*;
import java.util.stream.Collectors;

class Person {
    String name;
    int age;

    Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return name + " (" + age + ")";
    }
}

public class ListToMap {
    public static void main(String[] args) {
        List<Person> people = Arrays.asList(
            new Person("John", 25),
            new Person("Jane", 30),
            new Person("John", 25)
        );

        Map<String, List<Person>> map = people.stream()
            .collect(Collectors.groupingBy(
                Person::getName,
                TreeMap::new, // To keep the keys sorted
                Collectors.toList()
            ));

        System.out.println("Map with sorted keys: " + map);
    }
}
