/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

/**
 *
 * @author 94778
 */
import java.sql.ResultSet; 
import java.sql.SQLException;
import java.sql.Statement;  

public class DBSearch {
    Statement stmt; 
ResultSet rs; 
public ResultSet searchLogin(String usName) { 
try { 
stmt = DBConnection.getStatementConnection(); 
String name = usName; 
//Execute the Query 
rs = stmt.executeQuery("SELECT * FROM login where username='" 
+ name + "'"); 
} catch (SQLException e) { 
} 
return rs; 
}
}
