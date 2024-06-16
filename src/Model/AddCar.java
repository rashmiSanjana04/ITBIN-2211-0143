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
public class AddCar {
     private static final String DB_URL = "jdbc:mysql://localhost:3306/vehicledbs";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "";

    public void addCar(int rentAmmountPerDay, String facility, String color, String brand, String cNumber) throws SQLException {
        String query = "INSERT INTO vehicle (brand, rentAmmountPerDay, facility, cNumber, color) VALUES (?, ?, ?, ?, ?)";

        try (Connection connection = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
             PreparedStatement statement = (PreparedStatement) connection.prepareStatement(query)) {
            
            statement.setString(4, cNumber);
            statement.setString(1, brand);
            statement.setString(3, facility);
            statement.setString(5, color);
            statement.setInt(2, rentAmmountPerDay);
            
    

            statement.executeUpdate();
        } catch (SQLException e) {
            throw new SQLException("Error adding account: " + e.getMessage());
        }
    }
}
