package ExceptionPractice;

public class CustomException {
    public static void main(String[] args) {
    //CustomException c = new CustomException();

    try {
        withdraw(1000,500);
    } catch (insufficientBalance e) {
        e.printStackTrace();
    }

    }
    public static void withdraw(int amount,int bal)throws insufficientBalance
    {
        if (amount > bal)
        {
            throw new insufficientBalance("The Amount : "+amount+ " Balance : "+bal);
        }
        else {
            System.out.println("Amount withdraw Successfully");
        }
    }

}

class insufficientBalance extends Exception
{
    public insufficientBalance(String msg)
    {
        super(msg);
    }
}
