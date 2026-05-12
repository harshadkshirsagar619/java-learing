package Oops;

public class Course {

    String name;

    int durations;


    Course(String name)
    {
        System.out.println("Para constructor");
    }

    public static void main(String[] args) {
        System.out.println("Before Object Called");

        Course c = new Course("java");

        System.out.println("After Object Called");
       /* c.name = "Java";
        Course c1 = new Course();
        c.Learn(c1);
        */
       // c1.name = "Devops";
        //c.Learn(c1);

        Course c1 = new Course("DSA");
    }

    public void Learn(Course c)
    {
        System.out.println("I am Learning "+c.name);
    }
}
