public class Methods {
    public static void main(String[] args) {

        // types pf Methods in java


        System.out.println("hello world");
        Methods obj = new Methods();
        obj.display();

        Methods obj2 = new Methods();
        obj2.display();

        obj2.displayName("Rahul","M1");
        obj.displayName("Kumar","M2");

        int res =  obj.otpGen();
        System.out.println(res);

        String result = obj.myName("Kumar",12);
        System.out.println(result);

        int add = obj2.Sum(19,15);
        System.out.println(add);

    }

    // 1] no parameter no return

    public void display()
    {
        System.out.println("Good Morning");
    }


    //2] with parameter no return

    public  void displayName(String name,String methodName)
    {
        System.out.println("Hello : "+name + " MethodNAme : "+methodName);
    }

    //3] no parameter with returns

    public int otpGen()
    {
        return 6757;
    }

    // 4] with parameter with return

    public String myName(String name,int age)
    {
        System.out.println("My name is :"+name +"And Age : "+age);
        return "Harshad";
    }

    public int Sum(int a,int b)
    {
        return a+b;
    }
}
