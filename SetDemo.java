package Collections.Sets;

// Duplicate not allowed
// insertion order not preserved

import java.util.HashSet;
import java.util.Set;

public class SetDemo {
    public static void main(String[] args) {
        Set<Integer> set = new HashSet<>();

        set.add(12);
        set.add(13);
        set.add(14);
        set.add(16);
        set.add(12);
        System.out.println(set);

        System.out.println(set.contains(12));

        System.out.println(set.remove(12));
        System.out.println(set);

        System.out.println(set.size());

    }
}
