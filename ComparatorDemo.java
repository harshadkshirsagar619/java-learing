package Collections.Maps;

import java.util.ArrayList;
import java.util.Collections;

public class ComparatorDemo {
    public static void main(String[] args) {

        ArrayList<Employee> arrayList = new ArrayList<>();

        Employee e1 = new Employee(1,"Kumar","Admin");
        Employee e2 = new Employee(112,"Raj","Tester");
        Employee e3 = new Employee(12,"Ravi","Developer");
        Employee e4 = new Employee(5,"Kartik","Admin");

        arrayList.add(e1);
        arrayList.add(e2);
        arrayList.add(e3);
        arrayList.add(e4);

        System.out.println(arrayList);

        System.out.println("=======================================");

        Collections.sort(arrayList,new Employee());
        System.out.println(arrayList);
    }
}
