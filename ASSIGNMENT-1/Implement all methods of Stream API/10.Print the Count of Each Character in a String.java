import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountCharacters {
    public static void main(String[] args) {
        String str = "hello world";

        Map<Character, Long> charCount = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));

        System.out.println("Character counts: " + charCount);
    }
}
