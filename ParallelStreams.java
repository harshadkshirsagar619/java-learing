package CollectionExample;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ParallelStreams {


    public static void main(String[] args) {

        List<String> list = new ArrayList<>();

        list.add("Red");
        list.add("Yellow");
        list.add("Green");
        list.add("Blue");
        list.add("purple");
        list.add("Yellow");
        System.out.println(list);

        System.out.println("Prallel Stream");

        List<String> stream = list.parallelStream().collect(Collectors.toList());
        System.out.println(stream);

        System.out.println("=-------------------------------");

        int[] arr ={2,3,4,5,66,7};
        int sum = Arrays.stream(arr).parallel().sum();
        System.out.println("Sum : "+sum);
    }
}
