import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstRepeatedCharacter {
    public static void main(String[] args) {
        String str = "programming";
        Character firstRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() > 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println("First repeated character: " + firstRepeated);
    }
}
