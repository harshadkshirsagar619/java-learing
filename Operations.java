package Stream;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Operations {

    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,3,4,55,66,9,89,78,123,44,0,2,1,00);

        List<Integer> integerStream = list.stream().filter(s->s%2==0).collect(Collectors.toList());
        System.out.println(integerStream);

        List<Integer> integers = integerStream
                .stream()
                .map(s -> s/2)
                .distinct()
                .sorted((a,b)-> b-a)
                .limit(4)
                .skip(1)
                .collect(Collectors.toList());
        System.out.println(integers);

        List<Integer> skip = Stream.iterate(0, x -> x + 1)
                .limit(20)
                .skip(1)
                .filter(x->x%2!=0)
                .map(x->x+10)
                .collect(Collectors.toList());
        System.out.println(skip);
    }
}
