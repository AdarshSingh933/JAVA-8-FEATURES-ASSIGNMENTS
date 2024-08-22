import java.util.Arrays;

public class MaxElement {
    public static void main(String[] args) {
        int[] numbers = {1, 3, 5, 7, 9};
        int max = Arrays.stream(numbers)
            .max()
            .orElseThrow(NoSuchElementException::new);

        System.out.println("Maximum element: " + max);
    }
}
