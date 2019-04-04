package OCAtasks.assesment1.streamAPI;

import java.util.Arrays;
import java.util.List;
import java.util.stream.IntStream;

/**
 * Created by veronika on 04.04.2019.
 */
public class StreamExamples {
    public static void main(String[] args) {
        IntStream.of(120, 410, 85, 32, 314, 12)
                .filter(x -> x < 300)
                .map(x -> x + 11)
                .limit(3)
                .forEach(System.out::println);

        List<String> myList = Arrays.asList("a1", "a2", "b1", "c2", "c1");
        myList.stream()
                .filter(s -> s.startsWith("c"))
                .map(String::toUpperCase)
                .sorted()
                .forEach(System.out::println);

    }
}
