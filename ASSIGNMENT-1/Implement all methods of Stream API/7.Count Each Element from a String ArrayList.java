import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class CountWords {
    public static void main(String[] args) {
        List<String> words = Arrays.asList("apple", "banana", "apple", "orange", "banana", "apple");

        Map<String, Long> wordCount = words.stream()
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Word counts: " + wordCount);
    }
}
