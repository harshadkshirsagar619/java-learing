import com.sun.source.tree.AssignmentTree;

public class Operators {
    public static void main(String[] args) {

        int a = 10;
        int b = 10;

    // Arithmetic  Operators

        System.out.println("--------Arithmetic operators-----------");
        System.out.println(a + b);
        System.out.println(a - b);
        System.out.println(a * b);
        System.out.println(a / b);
        System.out.println(a % b);

    // Increment(++) and Decrement(--) Also called Unary Operators

        System.out.println(a++); // --> post increment
        System.out.println(++a); // --> pre increment
        System.out.println(++b);
        System.out.println(b--);

        int c = 6;
        int res = c++ + ++c + ++c + c++ + ++c;
        System.out.println(res);

        int r = c++ + --c + c++ + c--;
        System.out.println(r);


        // Relational Operators

        int x = 10;
        int y = 110;
        System.out.println("--------Relational Operators--------");
        System.out.println(x == y);
        System.out.println(x < y);
        System.out.println(x > y);
        System.out.println(x <= y);
        System.out.println(x >= y);
        System.out.println(x != y);


    // logical Operators

        boolean p = true;
        boolean q = false;
        System.out.println("--------Logical operators-----------");
        System.out.println((x > y) && (x < y));
        System.out.println((x > y) || (x < y));
        System.out.println(( !(q)) );


    //Assignment Operator

        System.out.println("---------AssignmentOperator--------");
        System.out.println( x+=1 );
        System.out.println( y-=1 );
        System.out.println( x*=2 );
        System.out.println( y/=2 );


    // Ternary Operators

        System.out.println("--------Ternary Operator-----");
        // it is used instead pf IF-ELSE

        int marks = 35;
        String result = (marks >= 35) ? "pass" : "fail";
        System.out.println(result);


    }
}
