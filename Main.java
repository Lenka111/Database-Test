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
            statement.execute("CREATE TABLE IF NOT EXISTS" +
                              " contacts(name TEXT, phone INTEGER, email TEXT)");
            //add data to the database.
            statement.execute("INSERT INTO contacts(name, phone, email)" +
                                  " VALUES('Elena', 222333444, 'lena@email.com')");
            statement.execute("INSERT INTO contacts(name, phone, email)" +
                                  " VALUES('Joe', 111333444, 'joe@email.com')");
            statement.execute("INSERT INTO contacts(name, phone, email)" +
                                  " VALUES('Jane', 22255566, 'Jane@email.com')");
            statement.execute("INSERT INTO contacts(name, phone, email)" +
                                  " VALUES('Fido', 5557788, 'fido@email.com')");

        }
        catch (SQLException e){
            System.out.println("Something went wrong: " + e.getMessage());
        }
    }
}
