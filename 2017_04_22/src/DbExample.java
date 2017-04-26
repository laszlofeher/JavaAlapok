
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author tanulo
 */
public class DbExample {
    public static void main(String[] args) {
        try {
            Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/test", "root", "");
            Statement stm = conn.createStatement();
            ResultSet rs = stm.executeQuery("Select * From partner");
            ResultSetMetaData rsmd = rs.getMetaData();
            int count = rsmd.getColumnCount();
            while(rs.next()){
                for (int i = 1; i <= count; i++) {
                    System.out.print(rs.getString(i)+" | ");
                }
                System.out.println("");
            }
        } catch (SQLException ex) {
            Logger.getLogger(DbExample.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        
        
        
        
        
    }
}
