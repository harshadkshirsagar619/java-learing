package Collections.Sets;


// treeSet
// duplicate not allowed
// insertion not allowed
// sorted order increasing

import java.util.Set;
import java.util.TreeSet;

public class TreeSetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new TreeSet<>();

        set.add(12);
        set.add(120);
        set.add(142);
        set.add(1);
        set.add(98);
        set.add(12);

        System.out.println(set);


        System.out.println(set.size());
        System.out.println(set.contains(42));
        set.remove(12);
        System.out.println(set);

    }
}
