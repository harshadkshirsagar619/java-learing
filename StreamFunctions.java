package CollectionExample;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamFunctions {
    public static void main(String[] args) {

        List<Integer> list = Arrays.asList(1,2,34,5,6,7);
        Stream<Integer> st = list.stream();
        st.forEach(s-> System.out.println("List : "+s));

        System.out.println("Map stream================");

        String[] arr={"Alice","Bob","Charlie","Mike","John"};
        List<String> stream= Arrays.stream(arr).map(s->s.toUpperCase()).collect(Collectors.toList());
        System.out.println(stream);

        List<String> list1 = Arrays.stream(arr).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println("List : "+list1);

        System.out.println("------------------Filter--------------------");
        List<String > list2 = Arrays.asList("Java","jdbc","Springs","Core","Servlet");

        list2.stream().filter(s->s.length()==4).forEach(System.out::println);


        System.out.println("------------------Map filter----------------------");


        List<String > stringList = Arrays.asList("Java","jdbc","Springs","Core","Servlet");
     List<String> stringList1 = stringList.stream().filter(s->s.length()>4).map(String::toUpperCase).collect(Collectors.toList());
        System.out.println(stringList1);
    }
}
