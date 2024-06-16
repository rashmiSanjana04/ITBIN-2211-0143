/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddBooking;
import Model.RemoveBooking;
import java.sql.SQLException;

/**
 *
 * @author 94778
 */
public class BookingController {
    
     
    public static void addBooking(String Address,String CustomerName, String Date,String Condition, int AmountOfDays,int BookingID)
                 throws SQLException {
        AddBooking addBooking = new AddBooking();
        addBooking.addBooking(Address,CustomerName, Date,Condition, AmountOfDays,BookingID);
} 
    public void removeBooking(int BookingID) throws SQLException {
        RemoveBooking.removeBooking(BookingID);
    }  
}
    
    
    

