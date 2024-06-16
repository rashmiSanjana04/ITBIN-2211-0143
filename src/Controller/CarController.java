/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Controller;

import Model.AddCar;
import Model.RemoveCar;
import java.sql.SQLException;

/**
 *
 * @author 94778
 */
public class CarController {
     
    public static void addCar(int rentAmmountPerDay, String facility, String color, String brand, String cNumber)
                 throws SQLException {
        AddCar addCar = new AddCar();
        addCar.addCar(rentAmmountPerDay, facility, color, brand, cNumber);
    }

    
    public void removeCar(int cNumber) throws SQLException {
        RemoveCar.removeCar(cNumber);
    }  
    
    
    public void removeCar(String cNumber) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

  
}
