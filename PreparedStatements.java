import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;


public class PreparedStatements {

    public static void main(String[] args) {


        try {
            // Load driver class
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Built Connections
            Connection con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/studentMy", "root", "hmk@2004");

            String querry = "insert into student(id,name,course) values(?,?,?)";

            PreparedStatement ps = con.prepareStatement(querry);

            ps.setInt(1,103);
            ps.setString(2,"aarush");
            ps.setString(3,".Net");
            ps.executeUpdate();

            ps.setInt(1,102);
            ps.setString(2,"Kumar");
            ps.setString(3,"Java");
            ps.executeUpdate();

            System.out.println("Inserted row ");

        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
