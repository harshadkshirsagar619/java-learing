package Collections.Lists;

// Same as List But Methods are synchronized

import java.util.Vector;

public class VectorDemo {
    public static void main(String[] args) {
        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(30);
        vector.add(20);
        vector.add(10);
        vector.add(60);

        System.out.println(vector);

        System.out.println(vector.contains(30));

        vector.add(1,10);
        System.out.println(vector);

        System.out.println(vector.elementAt(3));

        Vector<Integer> vector1 = new Vector<>();
        for (int i = 1;i<=10;i++)
        {
            vector1.add(i);
        }
        System.out.println(vector1);

    }
}
