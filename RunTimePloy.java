package Oops;

public class RunTimePloy
{
    public static void main(String[] args)
    {
        grandParent g = new Parent();
        g.work();


        Parent p = new child();
        p.work();
        p.Drive();
    }
}


class grandParent
{
    void work()
    {
        System.out.println("Grand Parent Working");
    }
}

class Parent extends grandParent
{
    @Override
    void work() {
        System.out.println("Parent is Working");
    }

    void Drive()
    {
        System.out.println("Parent Is driving");
    }
}

class child extends Parent
{
    @Override
    void Drive() {
        System.out.println("Child is driving");
    }

    @Override
    void work() {
        System.out.println("Child is working");
    }
}