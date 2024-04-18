
import java.sql.*;
public class ConnectionJdbc {
    /*JDBC Connectivity in five Steps:
     * 1. Register the driver Class
     * 2.Creating connection String 
     * 3. Creating Statement
     * 4. Executing  MYSQL queries
     * 5.Closing the Connection
     */
    Connection c;
    Statement s;
    ConnectionJdbc(){
            try{
                //1. Register the driver Class
                Class.forName("../lib/mysql-connector-java-8.0.28.jar/com.mysql.cj.jdbc.Driver");
                //2.Creating connection String
                c= DriverManager.getConnection("jdbc:mysql:///universitymanagementsystem","root","root");
                //creating the Statement
                s=c.createStatement();
            }catch(Exception ex){
                ex.printStackTrace();
            }
    }
}
