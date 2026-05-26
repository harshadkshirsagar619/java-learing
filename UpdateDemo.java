import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;

public class UpdateDemo {
    public static void main(String[] args)throws ClassNotFoundException {

        try {

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentMy", "root", "hmk@2004");
            Statement statement = connection.createStatement();

            int update = statement.executeUpdate("update student set name = 'kartik' where id = 1");
            System.out.println("Updated : "+update+ " rows");

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }
}
