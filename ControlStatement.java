import java.util.Scanner;

public class ControlStatement {
    public static void main(String[] args) {

        // Control Statements

     // Decision-Making Statements - IF , IF-ELSE , Nested-if


            int c = 3;
            if(c == 5)
            {
                System.out.println("C is equal to 5");
            }

            int a = 2;
           if(a > 10){
               System.out.println("A is greater 10");
               a-=10;
               if(a > 8)
               {
                   a-=8;
                   System.out.println("A is greater than 8");
                   if(a > 3)
                   {
                       System.out.println("A is greater than 3");
                   }else {
                       System.out.println("A is smaller than 3");
                   }
               }else {
                   System.out.println("A is smaller than 8");
                   if(a > 4)
                   {
                       System.out.println("A is greater than 4");
                   }else {
                       System.out.println("A is Smaller than 4");
                   }
               }
           }
           else {
               System.out.println("A is smaller");
               if(a > 5)
               {
                   a-=5;
                   System.out.println("A is greater than 5");
                   if(a == 1)
                   {
                       System.out.println("A is equal to 1");
                       return;
                   }
               }else {
                   System.out.println("A is smaller than 5");
                   if(a > 1){
                       a-=a;
                       System.out.println("A is grater than 1");
                       if(a == 1)
                       {
                           System.out.println("A is equal to 1");
                           return;
                       }
                   }else {
                       System.out.println("A is smaller than 1");
                   }
               }
           }



// Switch statement

        int n = 2;
        switch (n){
            case 1 :
                System.out.println("value is 1");
                break;
            case 2:
                System.out.println("value is 2");
                break;
            case 3:
                System.out.println("value is 3");
                break;
            default:
                System.out.println("Enetr the valid char");
        }


// Taking Input from user

        Scanner sc = new Scanner(System.in);

        System.out.println("Enter the value : ");
        int A = sc.nextInt();
        switch (A){
            case 1 :
                System.out.println("Mondey");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            default:
                System.out.println("enter the valid value");
        }
    }
}



