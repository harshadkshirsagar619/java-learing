package ExceptionHandlings;

public class ExceptionDemo {
    public static void main(String[] args) {

        System.out.println("Before Exception");

        try{
            int a = 10/0;
        }
        catch (Exception e) {
            System.out.println(e.getMessage());
        }
        finally {
            System.out.println("After handling");
        }

        System.out.println("--------------------------------------------");

        try{
            System.out.println("Hello");
           int b = 20/0;
        }catch (ArithmeticException a)
        {
            System.out.println(a.getMessage());
            System.out.println("Arithmetic exception");
        }
        catch (RuntimeException r){
            System.out.println(r.toString());
            System.out.println("Runtime exception");
        }catch (Exception e) {
            System.out.println(e.toString());
            System.out.println("Exception Block");
        }
        finally {
            System.out.println("Final Block");
        }

        System.out.println("_________________________________________");

        String s = null;
        try
        {
            int l = s.length();
        }catch (NullPointerException n)
        {
            System.out.println(n.toString());
        }
        finally {
            System.out.println("Final block");
        }
    }
}
