/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

/**
 *
 * @author tanulo
 */
public class DatabaseWithStatement {
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    public static void main(String[] args) {
        Connection conn = null;
        Statement stmt = null;
        
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id,"
                    + " firstname,"
                    + "lastname FROM partner";
            
            ResultSet rs = stmt.executeQuery(sql);
            while(rs.next()){
                System.out.println(rs.getString("id"));
                System.out.println(rs.getString(2));
            }
            rs.close();
        } catch (SQLException ex) {
        } finally{
            if(conn != null){
                try {
                    conn.close();
                } catch (SQLException ex) {
                }
            }
        }
    }
}
