/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package kontrol;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author Adnan
 */
public class koneksi {
    private static Connection konek;
    public static Connection GetConnection()throws SQLException{
        if(konek==null){            
            konek = DriverManager.getConnection("jdbc:mysql://localhost:3306/db_travel","root","");
        }
        return konek;
    }
    
}
