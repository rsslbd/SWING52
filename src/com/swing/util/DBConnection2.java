package com.swing.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

public class DBConnection2 {
    Connection con;
    String url = "jdbc:mysql://localhost:3306/schema";
    String username = "root";
    String password = "root";
    String sql = "SELECT * FROM employee where name = ? OR id = ?"; 
    void getData(){
        try {
            con = DriverManager.getConnection(url, username, password); //connection
            
            PreparedStatement psmt = con.prepareStatement(sql); //preparedstatement
            psmt.setString(1, "SSS");
            psmt.setInt(2, 2);
            ResultSet rs = psmt.executeQuery(); //resultset
            while (rs.next()) {                
                System.out.println(rs.getString("name") + " " + rs.getInt("age"));
            }
        } catch (Exception e) {
        }
    }
    
    public static void main(String[] args) {
        DBConnection2 db = new DBConnection2();
        db.getData();
    }
}