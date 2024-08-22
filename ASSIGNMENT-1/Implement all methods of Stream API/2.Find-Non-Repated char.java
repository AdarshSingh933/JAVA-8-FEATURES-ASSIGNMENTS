import java.util.function.Function;
import java.util.stream.Collectors;

public class FirstNonRepeatedCharacter {
    public static void main(String[] args) {
        String str = "swiss";
        Character firstNonRepeated = str.chars()
            .mapToObj(c -> (char) c)
            .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()))
            .entrySet()
            .stream()
            .filter(entry -> entry.getValue() == 1)
            .map(Map.Entry::getKey)
            .findFirst()
            .orElse(null);

        System.out.println("First non-repeated character: " + firstNonRepeated);
    }
}
