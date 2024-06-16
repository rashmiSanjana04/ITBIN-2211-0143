/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 * 
 *
 * @author 94778
 */
import com.mysql.jdbc.PreparedStatement; 
import java.sql.Connection; 
import java.sql.DriverManager; 
import java.sql.SQLException; 
import java.sql.Statement;

public class DBConnection {
     private static final String URL = "jdbc:mysql://localhost:3306/vehicledbs";
    private static final String USER = "root"; // replace with your DB username
    private static final String PASSWORD = ""; // replace with your DB password
    static Connection conn;
    static Statement stat = null;
     
    public static Statement getStatementConnection() {
         try {
//Establish the connection
         String url = "jdbc:mysql://localhost:3306/vehicledbs";
         conn = DriverManager.getConnection(url, "root", "");
//Create the connection
            stat = conn.createStatement();
       
        } catch (SQLException e) {
        }
           return stat;
        }
    //Close the connection
public static void closeCon() throws SQLException {
        conn.close();
    }

    static Connection getConnection() throws SQLException {
        return DriverManager.getConnection(URL, USER, PASSWORD);
    }
}
