package Collections.Lists;

import java.util.ArrayList;
import java.util.List;

public class ArrayListDemo {
    public static void main(String[] args) {

        // Duplicate are allowed
        // Insertion Order Preserved
        // Random Access Avaliable index

        List<Integer> list = new ArrayList<>();

        list.add(10);
        list.add(20);
        list.add(30);
        list.add(10);
        list.add(50);
        System.out.println(list);

        System.out.println(list.get(2));

        // Common Methods
        /*
            add()
            get()
            remove()
            size()
            clear()
            add(index,element)
            isEmpty()
         */

        System.out.println(list.size());
        System.out.println(list.set(3,500));
        System.out.println(list);

        if(list.isEmpty())
        {
            System.out.println("List is emplty");
        }else {
            System.out.println("List is not empty");
        }


        list.add(1,50);
        System.out.println(list);


    }
}
