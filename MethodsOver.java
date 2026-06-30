public class MethodsOver {

    public static void main(String[] args) {
        methods m = new methods();

    }

}
class over{
    public  static  void m1()
    {
        System.out.println("Hello");
    }

}
class methods extends over
{
   // @Override
    public static void m1() {
        System.out.println("helo stataic");
    }
}





