import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class InsertDemo {
    public static void main(String[] args) throws ClassNotFoundException {
        try {
            // Load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");
            // Built Connections
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentMy", "root", "hmk@2004");
            // create statement
            Statement statement = con.createStatement();
            // execute querry
            String querry = "insert into student(id,name,course) values(6,'Bob','Java'),(7,'Harsh','DSA')";
            int update = statement.executeUpdate(querry);
            System.out.println("Inserted : " + update + " rows");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
