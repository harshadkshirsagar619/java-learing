package Oops;

public class ParaCons {
    String name;

    int duration;

    ParaCons(String name,int duration)
    {
       // System.out.println(name);
        this.name = name;
        this.duration = duration;  //instance = local Constructor Variable
        //System.out.println("Para Constructor Called");
    }

    public static void main(String[] args) {
        ParaCons p = new ParaCons("Java",4);
       // p.name = "Kumar";
        p.student();

        ParaCons p1 = new ParaCons("DSA",2);
        p1.student();

        ParaCons p2 = new ParaCons("Python",4);
        p2.student();
    }

    public  void student()
    {
        System.out.println("My Course name : "+name +" Duration is : "+duration);
    }
}
