package Oops;

public class DefaultCons {

    String name;

    int age;

    DefaultCons()
    {
        System.out.println("Default Contructor called");
    }

    public static void main(String[] args) {
        DefaultCons d = new DefaultCons();
        d.name = "Roy";
        d.age = 13;
        d.student();

        DefaultCons obj = new DefaultCons();
        obj.name="Alice";
        d.Course(obj);
    }

    public void student()
    {
        System.out.println("I am :" +name +" And Age :" +age);
    }

    public void Course(DefaultCons d){
        System.out.println("My Name is : "+d.name);
    }
}
