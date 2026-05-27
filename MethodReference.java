package CollectionExample;

interface  Demo{
    void add();
    default void sum()
    {
        System.out.println("Default emthod");
    }

}
class Test{
    public  void learn()
    {
        System.out.println("Heelo World!");
    }
}
class start{
    public static void test()
    {
        System.out.println("Static method ");
    }
}

public class MethodReference {
    public static void main(String[] args) {

       Demo d = new Test()::learn;
        d.add();
        d.sum();



        Demo d1 = start::test;
        d1.add();


    }
}
