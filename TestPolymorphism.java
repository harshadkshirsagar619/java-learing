package Oops;

public class TestPolymorphism {

    public static void main(String[] args) {
        Calculator c = new Calculator();
        int rs =  c.add(2,3);
        double res = c.add(30.56,45.89);
        int result = c.add(190,89,67);

        System.out.println(rs);
        System.out.println(result);
        System.out.println(res);
    }
}

class Calculator {
    int add(int a,int b)
    {
        return a+b;
    }

    double add(double a ,double b)
    {
        return a+b;
    }

    int add(int x ,int y, int z)
    {
        return x+y+z;
    }
}
