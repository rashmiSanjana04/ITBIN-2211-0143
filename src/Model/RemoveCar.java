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
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class RemoveCar {
   public static void removeCar(String cNumber) throws SQLException {
        String sql = "DELETE FROM  vehicle WHERE cNumber = ?";

        try (Connection conn = DBConnection.getConnection(); PreparedStatement pstmt = conn.prepareStatement(sql)) {
            pstmt.setString(4, cNumber);
            int rowsAffected = pstmt.executeUpdate();
            if (rowsAffected == 0) {
                throw new SQLException("No account found with Car number: " + cNumber);
            }
        } catch (SQLException e) {
            throw new SQLException("Error removing car: " + e.getMessage(), e);
        }
    } 

    public static void removeCar(int cNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    
}
