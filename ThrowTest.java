package ExceptionHandlings;

public class ThrowTest {
    public static void main(String[] args) {

        withdraw(1000,2000);
    }

    public static  void withdraw(double bal,double amt)
    {
        if(amt>bal)
        {
            try {
                throw new Exception("Insufficient balance");
            } catch (Exception e) {
                System.out.println(e.getMessage());
            }
        }else {
            System.out.println("Withdraw successfully");
        }
    }
}
