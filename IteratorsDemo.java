package Collections.FetchingMethods;


//Works for all type of collection
// traverse and remove

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorsDemo {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();

        list.add(12);
        list.add(120);
        list.add(30);
        list.add(2);
        list.add(12);
        list.add(122);

        System.out.println(list);
        System.out.println("===============================");

        Iterator<Integer> iterator = list.iterator();

        while (iterator.hasNext())
        {
            int data = iterator.next();
            if(data == 30)
            {
                System.out.println("Removing : "+data);
                iterator.remove();
            }else {
                System.out.println(data);
            }
            // System.out.println(iterator.next());
        }

    }
}
