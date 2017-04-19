/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package org.flp.database;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.flp.model.Partner;

/**
 *
 * @author tanulo
 */
public class DB {
    Connection conn ; 
    static final String DB_URL = "jdbc:mysql://127.0.0.1:3306/test";

    //  Database credentials
    static final String USER = "root";
    static final String PASS = "";
    
    public void init(){
        try {
            conn = DriverManager.getConnection(DB_URL,USER,PASS);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
    }

    public ArrayList<Partner> getAllPartner(){
        Statement stmt = null;
        ArrayList<Partner> pList = new ArrayList();
        if(this.conn != null){
            System.out.println("connection is ok");
            try {
                stmt = conn.createStatement();
                String sql;
                sql = "SELECT id,"
                        + " firstname,"
                        + "lastname FROM partner";
                ResultSet rs = stmt.executeQuery(sql);
                while(rs.next()){
                    Partner p = new Partner();
                    p.setFirstname(rs.getString("firstname"));
                    p.setLastname(rs.getString("lastname"));
                    pList.add(p);
                }
                rs.close();
            } catch (SQLException ex) {
                System.out.println(ex.getMessage());
            }
        }
        return pList;
    }
    
    public void close(){
        if(this.conn != null){
            try {
                conn.close();
            } catch (SQLException ex) {
                System.out.println("close exp");
            }
        }
    }

    public void save(Partner p) {
        try {
            String sql;
            sql = "INSERT INTO partner("
                 + "firstname,"
                 + "lastname) VALUES(?,?)";
            PreparedStatement ps = conn.prepareStatement(sql);
            ps.setString(1, p.getFirstname());
            ps.setString(2, p.getLastname());
            ps.execute();
        } catch (SQLException ex) {
            Logger.getLogger(DB.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
}