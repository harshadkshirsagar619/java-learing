package Collections.Lists;

/*
    prgram to remive all elementts from lust

    create list with  elements
    dispaly list is non empty
    remove all elements using clear method
    diplay list is empty
* */

import java.util.ArrayList;
import java.util.List;

public class ListExample {
    public static void main(String[] args) {

        List<Integer> list = new ArrayList<>();
        int count = 0;
        for(int i = 1; i<=10;i++)
        {
            count = count + i;
            list.add(count);
        }

        System.out.println("List : " +list);

        if(list.isEmpty())
        {
            System.out.println("List is empty");
        }else {
            System.out.println("List is not Empty : "+list);
        }


         list.clear();

        if(list.isEmpty())
        {
            System.out.println("List is empty :" +list);
        }else {
            System.out.println("List is not empty");
        }
    }
}
