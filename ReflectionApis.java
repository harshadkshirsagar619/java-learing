import java.lang.reflect.Field;
import java.lang.reflect.Method;

public class ReflectionApis {

    public static void main(String[] args) throws Exception{

        Ref r = new Ref("Alice",12);

       Field[] RefFields =  r.getClass().getDeclaredFields();

       for (Field field : RefFields)
       {
          // System.out.println(field.getName());
           if (field.getName().equalsIgnoreCase("name"))
           {
               field.setAccessible(true);
               field.set(r,"Mike");
           }
       }
        System.out.println(r.getName());

        System.out.println("----------------------------------------");

        Method[] RefMethods =  r.getClass().getDeclaredMethods();
       for (Method method : RefMethods)
       {
           if (method.getName().equals("start"))
           {
               method.invoke(r);
           }
           System.out.println(method.getName());
       }

        System.out.println("-----------------------");

       for (Method method : RefMethods)
       {
           if (method.getName().equals("heyThisPrivate"))
           {
               method.setAccessible(true);
               method.invoke(r,23);
           }
          // System.out.println(method.getName());
       }

    }
}
