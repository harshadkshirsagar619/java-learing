package ExceptionHandlings;

public class AgeCalculator {
    public static void main(String[] args) {

      try {
          CheckAge(1);
      } catch (Exception e) {
          System.out.println(e.getMessage());
      }

    }

    public static void CheckAge(int age)throws Exception
    {
        if(age < 0)
        {
            throw new Exception("Age cannot be Negative");
        } else if (age < 18) {
            throw new Exception("Age is less Than 18");
        }else {
            throw new Exception("Age is greater than 18");
        }
    }
}
