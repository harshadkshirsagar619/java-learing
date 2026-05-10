public class Loops {
    public static void main(String[] args) {

      // Iterative Statements

      // 1] For Loops

       int i ;
       for(i = 0 ;i <= 5; i++)
       {
           System.out.println("Hello World : "+i);
       }

       // 2] While Loop

        int a = 0;
        while (a<5)
        {
            System.out.println("A : "+a);
            a++;
        }

        // 3] Do while Loop
        int y = 0;
        do {
            System.out.println("Y : " +y);
            y++;
        }while (y<=3);


    // Jump statements

    // 1] Break

        int m ;
        for ( m = 0; m <= 10; m++)
        {
            if(m == 5)
            {
                break;
            }
            System.out.println("Hello world : "+m);
        }


    // 2] Continue

        for(m = 0; m <= 7; m++)
        {
            if(m == 3 || m == 5)
            {
                continue;
            }
            System.out.println("Continue : "+m);
        }

        int count = 0;
        for(int u = 0;u<=10;u++)
        {

            if(u == count)
            {
                count = count + 2;
                continue;
            }
            System.out.print(u);
        }
    }
}
