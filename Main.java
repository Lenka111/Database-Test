//Elena Voinu
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        try( Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");
             Statement statement = con.createStatement();) {
            //will create the database if it doesn't exist, otherwise it will connect to it
       
            // execute the following command
            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)")

        }
        catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
