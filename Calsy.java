package AdvanceMultithreading;

// Functional Interface

@FunctionalInterface
public interface Calsy {

    int add(int a,int b);

    default void m1()
    {
        System.out.println("Hello ");
    }

}
/*
class test implements Calsy
{
    @Override
    public int add(int a, int b) {
        int sum = a + b;
        return sum;
    }
}

 */

/*
class Driver{
    public static void main(String[] args) {
        test t = new test();
        System.out.println(t.add(5,5));
    }
}

 */

// AFTER JAVA 1.8 using

class Driver2
{
    public static void main(String[] args) {
        Calsy operation = (a,b)->a+b;
        System.out.println(operation.add(5,6));
    }
}