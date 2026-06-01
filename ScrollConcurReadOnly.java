import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollConcurReadOnly {
    public static void main(String[] args) {

        try {
            // Load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Built Connections
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentMy", "root", "hmk@2004");

            // create statement
            Statement statement = con.createStatement(ResultSet.TYPE_SCROLL_INSENSITIVE,ResultSet.CONCUR_READ_ONLY);

            // execute querry
            String querry = "select * from student";
            ResultSet rs = statement.executeQuery(querry);

            System.out.println("--------------------Fetch data in not live update--------------------");


            Thread.sleep(10000);

            rs.beforeFirst();

            System.out.println("-------------Read data--------------");
            while (rs.next())
            {
                System.out.println(
                        rs.getInt("id")+" | "+
                                rs.getString("name")+" | "+
                                rs.getString("course")
                );
            }

           con.close();

        } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
