package veritabani;

import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;


public class DbConnection {
   
           static String url=  "jdbc:postgresql://localhost:5432/SinemaOtoDb";
           static Connection connection=null;


public static Connection getConnection() throws ClassNotFoundException {

               try {
                   Class.forName("org.postgresql.Driver");
                   connection= DriverManager.getConnection(url,"postgres","123");
                   System.out.println("Bağlandı.");
                   
               } catch (SQLException ex) {
                   Logger.getLogger(DbConnection.class.getName()).log(Level.SEVERE, null, ex);
               }
               return connection;

                
 }      
}
