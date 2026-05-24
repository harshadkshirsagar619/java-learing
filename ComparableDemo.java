package Collections.Maps;

import java.util.ArrayList;
import java.util.Collections;

public class ComparableDemo {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        list.add(777);
        list.add(22);
        list.add(5);
        list.add(134);
        list.add(122);

        System.out.println(list);

        Collections.sort(list);
        System.out.println(list);

        ArrayList<Student> arrayList = new ArrayList<>();

        Student s1 = new Student(11,"Harshad");
        Student s2 = new Student(6,"Alice");
        Student s3 = new Student(246,"John");
        Student s4 = new Student(34,"Mike");

            arrayList.add(s1);
            arrayList.add(s2);
            arrayList.add(s3);
            arrayList.add(s4);

        System.out.println(arrayList);

        System.out.println("-------------------------------------------------");

        Collections.sort(arrayList);
        System.out.println(arrayList);

    }
}
