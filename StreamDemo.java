package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.UUID;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamDemo {
    public static void main(String[] args) {

        int[] array = {1,2,3,4,5};
        int sum2 = Arrays.stream(array).filter(n ->n%2 == 0).sum();
        System.out.println(sum2);

        List<Integer> number = Arrays.asList(1,2,3,4,5,6);
        Stream<Integer> stream2 = number.stream();

        int[] arr = {1,2,3,4,5,6,7,8};
        IntStream stream = Arrays.stream(arr);

        String[] name = {"harsh","rahul","ram"};
        Stream<String> stream1 = Arrays.stream(name);

        Stream<String> names = Stream.of("Harahd","Raju","Sham","karan");

        Stream<Integer> limit = Stream.iterate(0, n -> n + 1).limit(10);

        Stream<UUID> integerStream = Stream.generate(()-> UUID.randomUUID()).limit(5);
    }
}
