package CollectionExample;

import java.util.*;

public class MapIterators {

    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();

        int[] arr = {1,2,3,4,5};
        String[] name = {"Alice","Mike","Bob","John","Charlie"};

        for (int i = 0;i<= args.length-1;i++)
        {
            map.put(arr[i],name[i]);
        }

        map.forEach((key,value)->{
            System.out.println("Keys : "+key+" | Values : "+value);
        });

        System.out.println("Maps : ");
        Set<Integer> set = map.keySet();
        Iterator<Integer> iterator = set.iterator();
        while (iterator.hasNext())
        {
            Integer i2 = iterator.next();
                Integer a = Integer.valueOf(map.get(i2));
            System.out.println("Avlues : "+a);
        }
    }
}
