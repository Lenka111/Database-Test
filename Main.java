import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;


public class Main {
    public static void main(String[] args) {
        try {
            //will create the database if it doesn't exist, otherwise it will connect to it
            Connection con = DriverManager.getConnection("jdbc:sqlite:test.db");
            Statement statement = con.createStatement();
            // execute the following command
            statement.execute("CREATE TABLE contacts(name TEXT, phone INTEGER, email TEXT)");

            //close the resource
            //statement must be closed before we close the connection
            statement.close();
            //close the connection
            con.close();

        }
        catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
