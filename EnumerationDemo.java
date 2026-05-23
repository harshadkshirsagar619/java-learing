package Collections.FetchingMethods;


// used only for Legacy Classes :- Vector and stack


import java.util.Enumeration;
import java.util.Vector;

public class EnumerationDemo {
    public static void main(String[] args) {

        Vector<Integer> vector = new Vector<>();
        vector.add(20);
        vector.add(30);
        vector.add(20);
        vector.add(10);
        vector.add(60);

        System.out.println(vector);

        System.out.println("---------------------------------------------------");

        Enumeration<Integer> elements = vector.elements();

        while (elements.hasMoreElements())
        {
            System.out.println(elements.nextElement());
        }

    }
}
