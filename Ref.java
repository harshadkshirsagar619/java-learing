public class Ref {

    private final String name ;

    private int age;

    public Ref(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    private void heyThisPrivate(int a)
    {
        System.out.println("How did you call this ? - > private "+a);
    }
    public  static  void thisIsPublicStaticMethod()
    {
        System.out.println("I am Public and static");
    }
    public void start()
    {
        System.out.println("Stsre methid called");
    }
}
