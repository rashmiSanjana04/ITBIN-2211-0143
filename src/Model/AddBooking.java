/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import com.mysql.jdbc.PreparedStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author 94778
 */
public class AddBooking {
    
    private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicledbs";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public void addBooking(String Address,String CustomerName, String Date,String Condition, int AmountOfDays,int BookingID) throws SQLException {
        String query = "INSERT INTO booking (address, customer_Name, date, con_d, amount_Days,booking_ID) VALUES (?, ?, ?, ?, ?,?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query)) {
            
            statement.setString(1, Address);
            statement.setString(2, CustomerName);
            statement.setString(3, Date);
            statement.setString(4, Condition);
            statement.setInt(5, AmountOfDays);
            statement.setInt(6, BookingID);
            
    

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error adding account: " + e.getMessage());
        }
    }

   

   

    
    
}
