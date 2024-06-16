/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

/**
 *
 * @author 94778
 */
public class RemoveBooking {
    public static void removeBooking(int BookingID) throws SQLException {
        String sql = "DELETE FROM  booking WHERE booking_ID = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setInt(1, BookingID);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No account found with Car number: " + BookingID);
            }
        } catch (SQLException e) {
            throw new SQLException("Error removing car: " + e.getMessage(), e);
        }
    } 

    

    
}
