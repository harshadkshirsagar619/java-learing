import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ScrollInsensitive {
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

            System.out.println("--------------------TYPE_SCROLL_INSENSITIVE--------------------");

            rs.last();
            System.out.println("Last Row : "+rs.getInt("id"));
            System.out.println("last Row : "+rs.getString("name"));

            rs.first();
            System.out.println("first Row : "+rs.getInt("id"));
            System.out.println("Fist Row : "+rs.getString("name"));

            rs.absolute(3);

            System.out.println(" Row : "+rs.getInt("id"));
            System.out.println("Row : "+rs.getString("name"));
            /*
            System.out.println("-------------Read data--------------");
            while (rs.next())
            {
                System.out.println(
                        rs.getInt("id")+" | "+
                                rs.getString("name")+" | "+
                                rs.getString("course")
                );
            }

             */

         } catch (Exception e) {
            e.printStackTrace();
        }

    }
}
