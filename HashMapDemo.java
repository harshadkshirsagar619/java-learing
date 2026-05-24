package Collections.Maps;

// Thread Safe as arrayList
// Duplicate keys are not allowed
// default valued allowed only ones

import java.util.HashMap;
import java.util.Map;

public class HashMapDemo {
    public static void main(String[] args) {

        Map<Integer,String> map = new HashMap<>();
        map.put(1,"Harshad");
        map.put(2,"Harsh");
        map.put(3,"Alice");
        map.put(4,"Bod");
        map.put(5,"Kumar");
        map.put(56,"Kumar");
        map.put(6,"Alice");
        map.put(0,null);
        map.put(0,"Raj");
        //map.put(0,null);
        System.out.println(map);

        System.out.println(map.get(0));
        System.out.println(map.containsKey(3));
 // 1}
        for(int data:map.keySet())
        {
            System.out.println("Keys : "+data +" Value : "+map.get(data));

        }

        System.out.println("==============================================================");

  // 2}
        for (String data : map.values())
        {
            System.out.println("Values : "+data);
        }

        System.out.println("------------------------------------------");

 // 3}

        for (Map.Entry<Integer,String> entry : map.entrySet())
        {
            System.out.println("Keys : "+entry.getKey() +" Values : "+entry.getValue());
        }

        System.out.println("---------------------------------------------------------");

  // 4}

        map.forEach((key,value)->{
            System.out.println("keys : "+key +" values : "+value);
        });

        System.out.println("=========================================");

        map.remove(4);
        System.out.println(map);

        map.clear();
        System.out.println(map);
    }
}
