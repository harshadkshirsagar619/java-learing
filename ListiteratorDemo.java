package Collections.FetchingMethods;

// work only for List :- backword,forword,remove,add,update

import java.util.LinkedList;
import java.util.ListIterator;

public class ListiteratorDemo {
    public static void main(String[] args) {

        LinkedList<Integer> list = new LinkedList<>();
        list.add(12);
        list.add(122);
        list.add(22);
        list.add(323);
        list.add(42);
        list.add(12);

        System.out.println(list);

        System.out.println("-------------------------------");

        ListIterator<Integer> li = list.listIterator();

        System.out.println("Forward Directions");

        while (li.hasNext())
        {
            int data = li.next();
            System.out.println(data);
            if(data == 323)
            {
                li.set(30000);
            }
        }

        System.out.println(list);


        System.out.println("backWard Directions");

        while (li.hasPrevious())
        {
            int data = li.previous();
            System.out.println(data);
            if(data == 12)
            {
                li.remove();
            }
        }
        System.out.println(list);
    }
}
