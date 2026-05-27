package CollectionExample;

import java.util.Arrays;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Set;

public class ForEachMethod
{
    public static void main(String[] args)
    {
        HashSet<String> set = new HashSet<>(Arrays.asList("Alice","John","Mike","Amar","Charlie"));

        set.forEach(set1->{
            if (set1.startsWith("A"))
            {
                System.out.println(set1);
            }
        });

        System.out.println("----------------------------------");
        Set<Integer> list = new HashSet<>(Arrays.asList(1,2,3,56,78,44,100,9));
        list.forEach(l->{
            if (l%2==0)
            {
                System.out.println(l);
            }
        });

        System.out.println("------------------------LinkedList---------------------");

        LinkedList<Integer> list1 = new LinkedList<>(Arrays.asList(23,3,7,4,56,2,45));

        list1.forEach(s->{
           int a =  s*s;
            System.out.println(a);
        });
    }
}
