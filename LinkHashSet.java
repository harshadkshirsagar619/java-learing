package Collections.Sets;

// The linkhashset
// contain order
// random access not allowed
// Duplicate not allowed


import java.util.LinkedHashSet;
import java.util.Set;

public class LinkHashSet {
    public static void main(String[] args) {

        Set<Integer> set = new LinkedHashSet<>();

        set.add(12);
        set.add(120);
        set.add(42);
        set.add(1);
        set.add(20);
        set.add(12);

        System.out.println(set);

        System.out.println(set.size());
        System.out.println(set.contains(42));
        set.remove(12);
        System.out.println(set);
    }
}
