import java.util.stream.Stream;

public class ConcatenateStreams {
    public static void main(String[] args) {
        Stream<String> stream1 = Stream.of("A", "B", "C");
        Stream<String> stream2 = Stream.of("D", "E", "F");

        Stream<String> concatenatedStream = Stream.concat(stream1, stream2);
        concatenatedStream.forEach(System.out::println);
    }
}
